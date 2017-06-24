package weather.ubbs.home.com.theweatherapp.service.api;


import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by udyatbhanu-mac on 6/18/17.
 */

public class ServiceManager {


    private static ServiceManager INSTANCE;
    private static WeatherLocationEndpointInterface apiService;

    private ServiceManager(){

    }

    static{
        RxJava2CallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.metaweather.com/api/location/2487956/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(rxAdapter)
                .build();

        apiService = retrofit.create(WeatherLocationEndpointInterface.class);
    }

    /**
     *
     * @return
     */
    public static ServiceManager getInstance(){
        if(null != INSTANCE){
            return INSTANCE;
        } else {
            INSTANCE = new ServiceManager();
        }

        return INSTANCE;
    }


    public static WeatherLocationEndpointInterface getApi(){

        if(apiService != null){
            return apiService;
        } else {
            RxJava2CallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.metaweather.com/api/location/2487956/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(rxAdapter)
                    .build();

            apiService = retrofit.create(WeatherLocationEndpointInterface.class);
        }
       return apiService;
    }
}
