package com.fsck.k9.mocks;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.util.Log;

import com.fsck.k9.K9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MockStorage implements SharedPreferences {

    private static Map<String,String> mStorage = new HashMap<String,String>();

    //static initializer for stubbed behaviour
    static {
        mStorage.put("mock-id-1.folderDisplayMode", "NOT_SECOND_CLASS");
        mStorage.put("fontSizeMessageViewSubject", "-1");
        mStorage.put("mock-id-1.automaticCheckIntervalMinutes", "-1");
        mStorage.put("messageViewDeleteActionVisible", "true");
        mStorage.put("mock-id-1.ledColor", "-16737844");
        mStorage.put("mock-id-1.ringtone", "content://settings/system/notification_sound");
        mStorage.put("messageViewFixedWidthFont", "false");
        mStorage.put("mock-id-1.accountNumber", "0");
        mStorage.put("messageViewCopyActionVisible", "false");
        mStorage.put("mock-id-1.trashFolderName", "Trash");
        mStorage.put("mock-id-1.pushPollOnConnect", "true");
        mStorage.put("hideTimeZone", "false");
        mStorage.put("sortAscending", "false");
        mStorage.put("messageViewMoveActionVisible", "false");
        mStorage.put("enableDebugLogging", "false");
        mStorage.put("quietTimeEnabled", "false");
        mStorage.put("mock-id-1.Spam.integrate", "false");
        mStorage.put("mock-id-1.useCompression.WIFI", "true");
        mStorage.put("messageViewShowNext", "false");
        mStorage.put("mock-id-1.markMessageAsReadOnView", "true");
        mStorage.put("changeRegisteredNameColor", "false");
        mStorage.put("mock-id-1.spamFolderName", "Spam");
        mStorage.put("fontSizeMessageViewTo", "-1");
        mStorage.put("wrapFolderNames", "false");
        mStorage.put("mock-id-1.folderNotifyNewMailMode", "ALL");
        mStorage.put("mock-id-1.vibrate", "false");
        mStorage.put("fontSizeMessageViewSender", "-1");
        mStorage.put("mock-id-1.latestOldMessageSeenTime", "1437550084000");
        mStorage.put("gesturesEnabled", "false");
        mStorage.put("mock-id-1.messageFormat", "HTML");
        mStorage.put("MailService.previousInterval", "-1");
        mStorage.put("mock-id-1.description.0", "Initial identity");
        mStorage.put("mock-id-1.signatureBeforeQuotedText", "false");
        mStorage.put("mock-id-1.syncRemoteDeletions", "true");
        mStorage.put("colorizeMissingContactPictures", "true");
        mStorage.put("splitViewMode", "NEVER");
        mStorage.put("notificationQuickDelete", "NEVER");
        mStorage.put("mock-id-1.lastAutomaticCheckTime", "0");
        mStorage.put("fontSizeMessageViewAdditionalHeaders", "-1");
        //smtp://user:pwd:PLAIN@mail.mock.com:587
        mStorage.put("mock-id-1.transportUri", "c210cDovL3VzZXI6cHdkOlBMQUlOQG1haWwubW9jay5jb206NTg3==");
        mStorage.put("mock-id-1.Spam.pushMode", "INHERITED");
        mStorage.put("fontSizeMessageListSender", "-1");
        mStorage.put("mock-id-1.vibratePattern", "0");
        mStorage.put("registeredNameColor", "-16777073");
        mStorage.put("mock-id-1.Spam.syncMode", "NO_CLASS");
        mStorage.put("animations", "true");
        mStorage.put("messageListPreviewLines", "2");
        mStorage.put("fixedMessageViewTheme", "true");
        mStorage.put("mock-id-1.stripSignature", "true");
        mStorage.put("messageViewArchiveActionVisible", "false");
        mStorage.put("messageViewTheme", "2");
        mStorage.put("hideUserAgent", "false");
        mStorage.put("mock-id-1.replyAfterQuote", "false");
        mStorage.put("messageListStars", "true");
        mStorage.put("mock-id-1.maximumPolledMessageAge", "-1");
        mStorage.put("fontSizeMessageViewContentPercent", "100");
        mStorage.put("notificationHideSubject", "NEVER");
        mStorage.put("mock-id-1.remoteSearchNumResults", "25");
        mStorage.put("mock-id-1.name.0", "mock-user-1");
        mStorage.put("fontSizeMessageViewCC", "-1");
        mStorage.put("showCorrespondentNames", "true");
        mStorage.put("messageListSenderAboveSubject", "false");
        mStorage.put("hideSpecialAccounts", "false");
        mStorage.put("mock-id-1.quotePrefix", ">");
        mStorage.put("backgroundOperations", "WHEN_CHECKED_AUTO_SYNC");
        mStorage.put("mock-id-1.expungePolicy", "EXPUNGE_IMMEDIATELY");
        mStorage.put("mock-id-1.signatureUse.0", "true");
        mStorage.put("mock-id-1.remoteSearchFullText", "false");
        mStorage.put("messageViewSpamActionVisible", "false");
        mStorage.put("mock-id-1.cryptoApp","");
        mStorage.put("mock-id-1.messageFormatAuto", "false");
        mStorage.put("fontSizeFolderStatus", "-1");
        mStorage.put("showContactName", "false");
        mStorage.put("mock-id-1.maximumAutoDownloadMessageSize", "32768");
        mStorage.put("fontSizeMessageListDate", "-1");
        mStorage.put("fontSizeMessageListPreview", "-1");
        mStorage.put("mock-id-1.email.0", "mockuser@mockserver.com");
        mStorage.put("mock-id-1.defaultQuotedTextShown", "true");
        mStorage.put("mock-id-1.folderTargetMode", "NOT_SECOND_CLASS");
        mStorage.put("fontSizeMessageListSubject", "-1");
        mStorage.put("mock-id-1.Spam.displayMode", "FIRST_CLASS");
        mStorage.put("mock-id-1.led", "false");
        mStorage.put("quietTimeStarts", "21:00");
        mStorage.put("mock-id-1.subscribedFoldersOnly", "false");
        mStorage.put("mock-id-1.description", "MockProvider");
        mStorage.put("fontSizeMessageViewDate", "-1");
        mStorage.put("mock-id-1.idleRefreshMinutes", "24");
        mStorage.put("fontSizeFolderName", "-1");
        mStorage.put("fontSizeMessageComposeInput", "18");
        mStorage.put("mock-id-1.notifyMailCheck", "true");
        mStorage.put("useVolumeKeysForListNavigation", "false");
        mStorage.put("startIntegratedInbox", "false");
        mStorage.put("mock-id-1.draftsFolderName", "Drafts");
        mStorage.put("mock-id-1.displayCount", "25");
        mStorage.put("confirmDeleteStarred", "false");
        mStorage.put("mock-id-1.folderPushMode", "NONE");
        mStorage.put("mock-id-1.alwaysShowCcBcc", "false");
        mStorage.put("attachmentdefaultpath", "/storage/sdcard");
        mStorage.put("mock-id-1.maxPushFolders", "10");
        mStorage.put("useVolumeKeysForNavigation", "false");
        mStorage.put("mock-id-1.ring", "true");
        mStorage.put("defaultAccountUuid", "mock-id-1");
        mStorage.put("fontSizeAccountDescription", "-1");
        mStorage.put("mock-id-1.useCompression.MOBILE", "true");
        mStorage.put("confirmSpam", "false");
        mStorage.put("language","English");
        mStorage.put("mock-id-1.goToUnreadMessageSearch", "false");
        mStorage.put("mock-id-1.signature.0", "-- \nSent from my Android device with K-9 Mail. Please excuse my brevity.");
        mStorage.put("confirmDelete", "false");
        mStorage.put("mock-id-1.quoteStyle", "PREFIX");
        mStorage.put("fontSizeAccountName", "-1");
        mStorage.put("mock-id-1.sortAscending", "false");
        mStorage.put("mock-id-1.Spam.inTopGroup", "true");
        mStorage.put("mock-id-1.vibrateTimes", "5");
        mStorage.put("mock-id-1.searchableFolders", "ALL");
        mStorage.put("messageComposeTheme", "2");
        mStorage.put("enableSensitiveLogging", "false");
        mStorage.put("lockScreenNotificationVisibility", "MESSAGE_COUNT");
        mStorage.put("useBackgroundAsUnreadIndicator", "true");
        mStorage.put("mock-id-1.chipColor", "-16737844");
        mStorage.put("mock-id-1.notifyNewMail", "true");
        mStorage.put("mock-id-1.sortTypeEnum", "SORT_DATE");
        mStorage.put("mock-id-1.showPicturesEnum", "NEVER");
        mStorage.put("mock-id-1.enabled", "true");
        mStorage.put("mock-id-1.archiveFolderName", "Archive");
        mStorage.put("showContactPicture", "true");
        mStorage.put("mock-id-1.notifySelfNewMail", "true");
        mStorage.put("mock-id-1.autoExpandFolderName", "INBOX");
        mStorage.put("mock-id-1.allowRemoteSearch", "false");
        mStorage.put("threadedView", "true");
        mStorage.put("messageListCheckboxes", "false");
        mStorage.put("messageViewReturnToList", "false");
        mStorage.put("mock-id-1.messageReadReceipt", "false");
        //pop3://PLAIN:user:pwd@mail.mock.com:110
        mStorage.put("mock-id-1.storeUri", "cG9wMzovL1BMQUlOOnVzZXI6cHdkQG1haWwubW9jay5jb206MTEw==");
        mStorage.put("sortTypeEnum", "SORT_DATE");
        mStorage.put("confirmDeleteFromNotification", "true");
        mStorage.put("theme", "0");
        mStorage.put("mock-id-1.useCompression.OTHER", "true");
        mStorage.put("notificationDuringQuietTimeEnabled", "true");
        mStorage.put("countSearchMessages", "true");
        mStorage.put("quietTimeEnds", "7:00");
        mStorage.put("mock-id-1.localStorageProvider", "InternalStorage");
        mStorage.put("measureAccounts", "true");
        mStorage.put("mock-id-1.inboxFolderName", "INBOX");
        mStorage.put("mock-id-1.folderSyncMode", "FIRST_CLASS");
        mStorage.put("mock-id-1.cryptoKey", "0");
        mStorage.put("mock-id-1.deletePolicy", "0");
        mStorage.put("mock-id-1.sentFolderName", "Sent");
        mStorage.put("autofitWidth", "true");
    }

    @Override
    public Map<String, ?> getAll() {
        return mStorage;
    }

    @Nullable
    @Override
    public String getString(String key, String defValue)
    {
        String val = mStorage.get(key);
        if (val == null) {
            return defValue;
        }
        return val;
    }

    @Nullable
    @Override
    public Set<String> getStringSet(String key, Set<String> defValues) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public int getInt(String key, int defValue) {
        String val = mStorage.get(key);
        if (val == null) {
            return defValue;
        }
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException nfe) {
            Log.e(K9.LOG_TAG, "Could not parse int", nfe);
            return defValue;
        }
    }

    @Override
    public long getLong(String key, long defValue) {
        String val = mStorage.get(key);
        if (val == null) {
            return defValue;
        }
        try {
            return Long.parseLong(val);
        } catch (NumberFormatException nfe) {
            Log.e(K9.LOG_TAG, "Could not parse long", nfe);
            return defValue;
        }
    }

    @Override
    public float getFloat(String key, float defValue) {
        String val = mStorage.get(key);
        if (val == null) {
            return defValue;
        }
        try {
            return Float.parseFloat(val);
        } catch (NumberFormatException nfe) {
            Log.e(K9.LOG_TAG, "Could not parse float", nfe);
            return defValue;
        }
    }

    @Override
    public boolean getBoolean(String key, boolean defValue) {
        String val = mStorage.get(key);
        if (val == null) {
            return defValue;
        }
        return Boolean.parseBoolean(val);
    }

    @Override
    public boolean contains(String key) {
        return mStorage.containsKey(key);
    }

    @Override
    public Editor edit() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
        throw new RuntimeException("Not implemented");
    }
}

