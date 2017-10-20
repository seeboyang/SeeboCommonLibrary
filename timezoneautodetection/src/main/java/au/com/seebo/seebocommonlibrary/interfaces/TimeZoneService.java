package au.com.seebo.seebocommonlibrary.interfaces;


import au.com.seebo.seebocommonlibrary.models.TimeZoneDBResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yang on 19/12/16.
 */

public interface TimeZoneService {
    @GET("get-time-zone")
    Call<TimeZoneDBResponse> getTimeZone(@Query("key") String key, @Query("by") String by, @Query("format") String format,
                                         @Query("ip") String ip, @Query("fields") String fields);
}
