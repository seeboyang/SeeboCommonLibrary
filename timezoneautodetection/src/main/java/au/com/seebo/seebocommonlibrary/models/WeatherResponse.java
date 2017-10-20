package au.com.seebo.seebocommonlibrary.models;

/**
 * Created by yang on 20/12/16.
 */

public class WeatherResponse {


    private Weather[] weather;
    private Temperature main;
    private String name;
    private OWM_SYS sys;


    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public Temperature getMain() {
        return main;
    }

    public void setMain(Temperature main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OWM_SYS getSys() {
        return sys;
    }

    public void setSys(OWM_SYS sys) {
        this.sys = sys;
    }
}
