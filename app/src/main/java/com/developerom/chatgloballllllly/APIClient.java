package com.developerom.chatgloballllllly;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class APIClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl("https://fcm.googleapis.com/fcm/").addConverterFactory(ScalarsConverterFactory.create()).build();
        }
        return retrofit;
    }
}
