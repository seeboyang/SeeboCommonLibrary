package au.com.seebo.seebocommonlibrary.controller;

import au.com.seebo.seebocommonlibrary.interfaces.ExternalIPService;
import au.com.seebo.seebocommonlibrary.models.GEOIP;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yang on 20/12/16.
 */

public class ExternalIPGrabber {
    private static String baseUrl = "http://freegeoip.net/";
    private Retrofit retrofit;
    private ExternalIPService service;

    public ExternalIPGrabber() {
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(ExternalIPService.class);
    }

    public void getIP(Callback<GEOIP> callback) {
        Call<GEOIP> call = service.getGEOIP();
        call.enqueue(callback);
    }


}
