package weather.ubbs.home.com.theweatherapp.service.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parent implements Parcelable
{

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
    public final static Parcelable.Creator<Parent> CREATOR = new Creator<Parent>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Parent createFromParcel(Parcel in) {
            Parent instance = new Parent();
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.locationType = ((String) in.readValue((String.class.getClassLoader())));
            instance.woeid = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.lattLong = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Parent[] newArray(int size) {
            return (new Parent[size]);
        }

    }
            ;

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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(locationType);
        dest.writeValue(woeid);
        dest.writeValue(lattLong);
    }

    public int describeContents() {
        return 0;
    }

}