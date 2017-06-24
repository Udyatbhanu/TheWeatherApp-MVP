package weather.ubbs.home.com.theweatherapp.service.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import weather.ubbs.home.com.theweatherapp.service.model.WeatherLocationResponse;

/**
 * Created by udyatbhanu-mac on 6/18/17.
 */

public interface WeatherLocationEndpointInterface {

//    @GET("api/location/{woeid}")
//    Call<WeatherLocation> getWeatherLocation(@Path("woeid") String woeid);


    @GET("api/location/{woeid}")
    Observable<WeatherLocationResponse> getWeatherLocation(@Path("woeid") String woeid);


}
