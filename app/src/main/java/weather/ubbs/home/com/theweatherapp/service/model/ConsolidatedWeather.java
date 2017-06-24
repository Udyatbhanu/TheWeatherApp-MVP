package weather.ubbs.home.com.theweatherapp.service.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsolidatedWeather implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("weather_state_name")
    @Expose
    private String weatherStateName;
    @SerializedName("weather_state_abbr")
    @Expose
    private String weatherStateAbbr;
    @SerializedName("wind_direction_compass")
    @Expose
    private String windDirectionCompass;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("applicable_date")
    @Expose
    private String applicableDate;
    @SerializedName("min_temp")
    @Expose
    private Double minTemp;
    @SerializedName("max_temp")
    @Expose
    private Double maxTemp;
    @SerializedName("the_temp")
    @Expose
    private Double theTemp;
    @SerializedName("wind_speed")
    @Expose
    private Double windSpeed;
    @SerializedName("wind_direction")
    @Expose
    private Double windDirection;
    @SerializedName("air_pressure")
    @Expose
    private Double airPressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("visibility")
    @Expose
    private Object visibility;
    @SerializedName("predictability")
    @Expose
    private Integer predictability;
    public final static Parcelable.Creator<ConsolidatedWeather> CREATOR = new Creator<ConsolidatedWeather>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ConsolidatedWeather createFromParcel(Parcel in) {
            ConsolidatedWeather instance = new ConsolidatedWeather();
            instance.id = ((Long) in.readValue((Long.class.getClassLoader())));
            instance.weatherStateName = ((String) in.readValue((String.class.getClassLoader())));
            instance.weatherStateAbbr = ((String) in.readValue((String.class.getClassLoader())));
            instance.windDirectionCompass = ((String) in.readValue((String.class.getClassLoader())));
            instance.created = ((String) in.readValue((String.class.getClassLoader())));
            instance.applicableDate = ((String) in.readValue((String.class.getClassLoader())));
            instance.minTemp = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.maxTemp = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.theTemp = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.windSpeed = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.windDirection = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.airPressure = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.humidity = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.visibility = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.predictability = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public ConsolidatedWeather[] newArray(int size) {
            return (new ConsolidatedWeather[size]);
        }

    }
            ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    public String getWeatherStateAbbr() {
        return weatherStateAbbr;
    }

    public void setWeatherStateAbbr(String weatherStateAbbr) {
        this.weatherStateAbbr = weatherStateAbbr;
    }

    public String getWindDirectionCompass() {
        return windDirectionCompass;
    }

    public void setWindDirectionCompass(String windDirectionCompass) {
        this.windDirectionCompass = windDirectionCompass;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getApplicableDate() {
        return applicableDate;
    }

    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Double getTheTemp() {
        return theTemp;
    }

    public void setTheTemp(Double theTemp) {
        this.theTemp = theTemp;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    public Double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Object getVisibility() {
        return visibility;
    }

    public void setVisibility(Object visibility) {
        this.visibility = visibility;
    }

    public Integer getPredictability() {
        return predictability;
    }

    public void setPredictability(Integer predictability) {
        this.predictability = predictability;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(weatherStateName);
        dest.writeValue(weatherStateAbbr);
        dest.writeValue(windDirectionCompass);
        dest.writeValue(created);
        dest.writeValue(applicableDate);
        dest.writeValue(minTemp);
        dest.writeValue(maxTemp);
        dest.writeValue(theTemp);
        dest.writeValue(windSpeed);
        dest.writeValue(windDirection);
        dest.writeValue(airPressure);
        dest.writeValue(humidity);
        dest.writeValue(visibility);
        dest.writeValue(predictability);
    }

    public int describeContents() {
        return 0;
    }

}