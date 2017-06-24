package weather.ubbs.home.com.theweatherapp.presenter;

import android.os.Bundle;

import nucleus5.presenter.RxPresenter;
import weather.ubbs.home.com.theweatherapp.views.activities.MainActivity;

/**
 * Created by udyatbhanu-mac on 6/17/17.
 */

public class MainActivityPresenter extends RxPresenter<MainActivity> {


    private View view;
    @Override
    public void onTakeView(MainActivity view) {
        super.onTakeView(view);
    }


    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
    }



    public interface View{
        void publishResults();
    }
}
