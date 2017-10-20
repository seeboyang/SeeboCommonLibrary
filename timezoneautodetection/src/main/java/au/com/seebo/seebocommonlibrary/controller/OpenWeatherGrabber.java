package au.com.seebo.seebocommonlibrary.controller;

import android.util.Log;

import au.com.seebo.seebocommonlibrary.interfaces.OpenWeatherService;
import au.com.seebo.seebocommonlibrary.models.WeatherResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yang on 20/12/16.
 */

public class OpenWeatherGrabber {

    private String baseUrl;
    private String apiKey;

    private static final String defaultUrl = "http://api.openweathermap.org/data/2.5/";
    private static final String defaultApiKey = "61f806dad532bad3654c034c0b524f23";
    private Retrofit retrofit;
    private OpenWeatherService service;
    private static final String TAG = "OpenWeatherGrabber";

    public OpenWeatherGrabber() {
        this(defaultApiKey,defaultUrl);
    }


    public OpenWeatherGrabber(String API_KEY, String baseUrl) {
        this.baseUrl = baseUrl;
        this.apiKey = API_KEY;
        retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(OpenWeatherService.class);
    }

    public void getCurrentWeather(Callback<WeatherResponse> callback, String zipCode, String countryCode) {
        Log.d(TAG, "try to start retrofit call");
        Call<WeatherResponse> call = service.getWeather(apiKey, "metric", zipCode + "," + countryCode);
        call.enqueue(callback);
    }
}
