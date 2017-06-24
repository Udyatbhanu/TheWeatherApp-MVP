package weather.ubbs.home.com.theweatherapp.service.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherLocationResponse implements Parcelable
{

    @SerializedName("consolidated_weather")
    @Expose
    private List<ConsolidatedWeather> consolidatedWeather = null;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("sun_rise")
    @Expose
    private String sunRise;
    @SerializedName("sun_set")
    @Expose
    private String sunSet;
    @SerializedName("timezone_name")
    @Expose
    private String timezoneName;
    @SerializedName("parent")
    @Expose
    private Parent parent;
    @SerializedName("sources")
    @Expose
    private List<Source> sources = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("location_type")
    @Expose
    private String locationType;
    @SerializedName("woeid")
    @Expose
    private Integer woeid;
    @SerializedName("latt_long")
    @Expose
    private String lattLong;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    public final static Parcelable.Creator<WeatherLocationResponse> CREATOR = new Creator<WeatherLocationResponse>() {


        @SuppressWarnings({
                "unchecked"
        })
        public WeatherLocationResponse createFromParcel(Parcel in) {
            WeatherLocationResponse instance = new WeatherLocationResponse();
            in.readList(instance.consolidatedWeather, (weather.ubbs.home.com.theweatherapp.service.model.ConsolidatedWeather.class.getClassLoader()));
            instance.time = ((String) in.readValue((String.class.getClassLoader())));
            instance.sunRise = ((String) in.readValue((String.class.getClassLoader())));
            instance.sunSet = ((String) in.readValue((String.class.getClassLoader())));
            instance.timezoneName = ((String) in.readValue((String.class.getClassLoader())));
            instance.parent = ((Parent) in.readValue((Parent.class.getClassLoader())));
            in.readList(instance.sources, (weather.ubbs.home.com.theweatherapp.service.model.Source.class.getClassLoader()));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.locationType = ((String) in.readValue((String.class.getClassLoader())));
            instance.woeid = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.lattLong = ((String) in.readValue((String.class.getClassLoader())));
            instance.timezone = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public WeatherLocationResponse[] newArray(int size) {
            return (new WeatherLocationResponse[size]);
        }

    }
            ;

    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSunRise() {
        return sunRise;
    }

    public void setSunRise(String sunRise) {
        this.sunRise = sunRise;
    }

    public String getSunSet() {
        return sunSet;
    }

    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    public String getTimezoneName() {
        return timezoneName;
    }

    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Integer getWoeid() {
        return woeid;
    }

    public void setWoeid(Integer woeid) {
        this.woeid = woeid;
    }

    public String getLattLong() {
        return lattLong;
    }

    public void setLattLong(String lattLong) {
        this.lattLong = lattLong;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(consolidatedWeather);
        dest.writeValue(time);
        dest.writeValue(sunRise);
        dest.writeValue(sunSet);
        dest.writeValue(timezoneName);
        dest.writeValue(parent);
        dest.writeList(sources);
        dest.writeValue(title);
        dest.writeValue(locationType);
        dest.writeValue(woeid);
        dest.writeValue(lattLong);
        dest.writeValue(timezone);
    }

    public int describeContents() {
        return 0;
    }

}