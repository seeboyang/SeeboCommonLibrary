package au.com.seebo.seebocommonlibrary.interfaces;

import au.com.seebo.seebocommonlibrary.models.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yang on 20/12/16.
 */

public interface OpenWeatherService {
    @GET("weather")
    Call<WeatherResponse> getWeather(@Query("APPID") String appid, @Query("units") String unit, @Query("zip") String zip);
}
