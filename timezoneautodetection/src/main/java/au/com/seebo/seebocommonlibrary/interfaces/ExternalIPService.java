package au.com.seebo.seebocommonlibrary.interfaces;

import au.com.seebo.seebocommonlibrary.models.GEOIP;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yang on 20/12/16.
 */


public interface ExternalIPService {
    @GET("json/")
    Call<GEOIP> getGEOIP();
}
