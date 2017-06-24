package weather.ubbs.home.com.theweatherapp.service.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source implements Parcelable
{

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("crawl_rate")
    @Expose
    private Integer crawlRate;
    public final static Parcelable.Creator<Source> CREATOR = new Creator<Source>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Source createFromParcel(Parcel in) {
            Source instance = new Source();
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.slug = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.crawlRate = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public Source[] newArray(int size) {
            return (new Source[size]);
        }

    }
            ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCrawlRate() {
        return crawlRate;
    }

    public void setCrawlRate(Integer crawlRate) {
        this.crawlRate = crawlRate;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(slug);
        dest.writeValue(url);
        dest.writeValue(crawlRate);
    }

    public int describeContents() {
        return 0;
    }

}