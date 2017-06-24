package weather.ubbs.home.com.theweatherapp.presenter;

import android.os.Bundle;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiConsumer;
import nucleus5.presenter.Factory;
import nucleus5.presenter.RxPresenter;
import weather.ubbs.home.com.theweatherapp.service.api.ServiceManager;
import weather.ubbs.home.com.theweatherapp.service.model.WeatherLocationResponse;


/**
 * Created by udyatbhanu-mac on 6/18/17.
 */

public class RecyclerViewFragmentPresenter extends RxPresenter<RecyclerViewFragmentPresenter.View> {

    private static final int REQUEST_ITEMS = 1;

    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);





        restartableLatestCache(REQUEST_ITEMS,
                new Factory<Observable<WeatherLocationResponse>>() {
                    @Override
                    public Observable<WeatherLocationResponse> create() {
                        return ServiceManager.getApi().getWeatherLocation("2487956").
                                observeOn(AndroidSchedulers.mainThread());
                    }
                },
                new BiConsumer<View, WeatherLocationResponse>() {
                    @Override
                    public void accept(View view, WeatherLocationResponse weatherLocationResponse) throws Exception {
                        view.loadView(weatherLocationResponse);
                    }

                },
                new BiConsumer<View, Throwable>() {
                    @Override
                    public void accept(View view, Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }

                });

        if (savedState == null){

            start(REQUEST_ITEMS);
        }

    }

    @Override
    public void onTakeView(View view){
        super.onTakeView(view);

    }


    public interface View{

        void showLoading();

        void hideLoading();

        void loadView(WeatherLocationResponse response);

    }



}
