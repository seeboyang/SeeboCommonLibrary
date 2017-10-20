package au.com.seebo.seebocommonlibrary.models;

/**
 * Created by yang on 19/12/16.
 */

public class Fields {
    private static String countryCode = "countryCode";
    private static String cityName = "cityName";
    private static String zoneName = "zoneName";
    private static String gmtOffset = "gmtOffset";
    private static String dst = "dst";
    private static String prefix = "fields=";
    private static String separator = ",";

    public static String getFields() {
        return prefix + countryCode + separator + cityName + separator + zoneName + separator + gmtOffset + separator + dst;
    }
}
