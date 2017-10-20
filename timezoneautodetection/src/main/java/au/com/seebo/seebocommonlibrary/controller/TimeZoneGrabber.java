package au.com.seebo.seebocommonlibrary.controller;

import au.com.seebo.seebocommonlibrary.interfaces.TimeZoneService;
import au.com.seebo.seebocommonlibrary.models.Fields;
import au.com.seebo.seebocommonlibrary.models.TimeZoneDBResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yang on 19/12/16.
 */

public class TimeZoneGrabber {

    public static String BY_CITY = "city";
    public static String BY_ZONE = "zone";
    public static String BY_POSITION = "position";
    public static String BY_IP = "ip";
    private String by;
    private static String baseUrl = "http://api.timezonedb.com/v2/";
    private static String API_KEY = "KYV8JJ16YV7U";
    private static String FORMAT_JSON = "json";
    private static String FORMAT_XML = "xml";
    private Retrofit retrofit;
    private TimeZoneService service;

    public TimeZoneGrabber() {
        init();
    }

    private void init() {
        retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(TimeZoneService.class);
    }

    public void getTimeZoneByIP(String ip, Callback<TimeZoneDBResponse> callback) {
        Call<TimeZoneDBResponse> call = service.getTimeZone(API_KEY, BY_IP, FORMAT_JSON, ip, Fields.getFields());
        call.enqueue(callback);
    }


}
