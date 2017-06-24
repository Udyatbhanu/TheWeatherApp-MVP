package weather.ubbs.home.com.theweatherapp.presenter;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import nucleus5.presenter.Factory;
import nucleus5.presenter.RxPresenter;

/**
 * Created by udyatbhanu-mac on 6/18/17.
 */

public class GridViewFragmentPresenter extends RxPresenter<GridViewFragmentPresenter.View> {


    private static final int REQUEST_ITEMS = 1;

    private List <String>strs = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);
    }



    public void downloadImages(){

        restartableFirst(REQUEST_ITEMS, new Factory<Observable<Integer>>() {
                    @Override
                    public Observable<Integer> create() {

                        return Observable.just(2);
                    }
                },
                new BiConsumer<View, Integer>() {
                    @Override
                    public void accept(View view, Integer columns) throws Exception {
                        view.loadView(columns);
                    }

                } );

        start(REQUEST_ITEMS);



    }
    public interface View{

        void loadView(int columns);
    }
}
