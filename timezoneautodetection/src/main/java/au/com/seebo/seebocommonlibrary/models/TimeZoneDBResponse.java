package au.com.seebo.seebocommonlibrary.models;

/**
 * Created by yang on 19/12/16.
 */

public class TimeZoneDBResponse {
    private String status;
    private String message;
    private String countryCode;
    private String countryName;
    private String zoneName;
    private String cityName;
    private String abbreviation;
    private long gmtOffset;
    private String dst;
    private long dstStart;
    private long dstEnd;
    private String nextAbbreviation;
    private long timestamp;
    private String formatted;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public long getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(long gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public long getDstStart() {
        return dstStart;
    }

    public void setDstStart(long dstStart) {
        this.dstStart = dstStart;
    }

    public long getDstEnd() {
        return dstEnd;
    }

    public void setDstEnd(long dstEnd) {
        this.dstEnd = dstEnd;
    }

    public String getNextAbbreviation() {
        return nextAbbreviation;
    }

    public void setNextAbbreviation(String nextAbbreviation) {
        this.nextAbbreviation = nextAbbreviation;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }
}
