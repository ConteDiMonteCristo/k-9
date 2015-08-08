package com.fsck.k9;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.Nullable;
import android.test.mock.MockContext;
import android.view.Display;

import com.fsck.k9.mocks.MockStorage;

import org.junit.*;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;


import static org.mockito.Mockito.*;

/**
 * Testing Account using mockito for stubbing
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class AccountTest {
    //stubs
    Context mockContext = mock(Context.class);
    SQLiteDatabase mockDB = mock(SQLiteDatabase.class);
    Cursor mockCursor = mock(Cursor.class);
    SharedPreferences mockStorage = new MockStorage();
    Preferences mockPreferences = mock(Preferences.class);

    @Before
    public void setUp(){
        K9.app = RuntimeEnvironment.application;
        when(mockContext.getApplicationContext()).thenReturn(mockContext);
        when(mockContext.getPackageName()).thenReturn(this.getClass().getPackage().getName());
        when(mockContext.openOrCreateDatabase(anyString(), anyInt(), (SQLiteDatabase.CursorFactory) anyObject())).thenReturn(mockDB);
        when(mockContext.getSharedPreferences(anyString(), anyInt())).thenReturn(mockStorage);
        when(mockDB.rawQuery(contains("preferences_storage"), (String[]) anyObject())).thenReturn(mockCursor);
        when(mockPreferences.getPreferences()).thenReturn(mockStorage);
    }

    @Test
    public void accountCreationFromContext() {
        Account a = new Account(mockContext);
        assertNotNull(a);
    }

    @Test
    public void accountCreationFromPreferences() {
        Account a = new Account(mockPreferences,"mock-id-1");
        assertNotNull(a);
    }

}
