package com.developerom.chatgloballllllly;

import java.util.HashMap;

public class Constants {

    public static final String KEY_USER_NAME = "user_name";

    public static final String REMOTE_MSG_AUTHORIZATION = "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";
    public static final String KEY_PREFERENCE_NAME = "videoMeetingPreference";

    public static final String REMOTE_MSG_TYPE = "type";
    public static final String REMOTE_MSG_INVITATION = "invitation";
    public static final String REMOTE_MSG_MEETING_TYPE = "meetingType";
    public static final String REMOTE_MSG_INVITER_TOKEN = "inviterToken";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_ID = "registration_ids";

    public static HashMap<String,String> getRemoteMessageRemotes(){
        HashMap<String,String> headers = new HashMap<>();
        headers.put(Constants.REMOTE_MSG_AUTHORIZATION,"key=AAAA7RWWVcs:APA91bHgSOFqI09fo1q-Bts2wRvp6JKm-fr50sWKNctfbSOh0_Gj-nbqxFqPjnoX4PzdvPmE7BG_h9nNquUIy-oH7nULDnG3yWigReboY17rzNVKt3t7lnIxA0d0S0je5rSugNOGrucz");
        headers.put(Constants.REMOTE_MSG_CONTENT_TYPE,"application/json");
        return headers;
    }
}
