package weather.ubbs.home.com.theweatherapp.presenter;

import android.os.Bundle;

import nucleus5.presenter.RxPresenter;
import weather.ubbs.home.com.theweatherapp.views.activities.ImagesActivity;

/**
 * Created by udyatbhanu-mac on 6/17/17.
 */

public class ImagesActivityPresenter extends RxPresenter<ImagesActivity> {


    private static final int REQUEST_ITEMS = 1;


    @Override
    public void onTakeView(final ImagesActivity view) {
        super.onTakeView(view);

//        restartableLatestCache(REQUEST_ITEMS,
//                new Func0<Observable<RequestBuilder<Drawable>>>() {
//                    @Override
//                    public Observable<RequestBuilder<Drawable>> call() {
//                        return  Glide.with(view).load("https://pbs.twimg.com/profile_images/61655057/2425718692_1783fe0913_b.jpg");
//
//                    }
//                },
//                new Action2<MainActivity, ServerAPI.Response>() {
//                    @Override
//                    public void call(MainActivity activity, ServerAPI.Response response) {
//
//                    }
//                },
//                new Action2<MainActivity, Throwable>() {
//                    @Override
//                    public void call(MainActivity activity, Throwable throwable) {
//
//                    }
//                });
    }


    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);


    }




}
