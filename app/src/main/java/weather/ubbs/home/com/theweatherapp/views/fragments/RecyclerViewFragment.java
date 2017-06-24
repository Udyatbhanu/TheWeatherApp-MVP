package weather.ubbs.home.com.theweatherapp.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nucleus5.factory.RequiresPresenter;
import nucleus5.view.NucleusSupportFragment;
import weather.ubbs.home.com.theweatherapp.R;
import weather.ubbs.home.com.theweatherapp.presenter.RecyclerViewFragmentPresenter;
import weather.ubbs.home.com.theweatherapp.service.model.WeatherLocationResponse;

/**
 * Created by udyatbhanu-mac on 6/17/17.
 */

@RequiresPresenter(RecyclerViewFragmentPresenter.class)
public class RecyclerViewFragment  extends NucleusSupportFragment<RecyclerViewFragmentPresenter> implements RecyclerViewFragmentPresenter.View{


    public static final String BASE_URL = "https://www.metaweather.com/api/location/2487956/";


    View view;
    RecyclerView rv;
    ProgressBar progressBar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(
                R.layout.fragment_recycler_view, container, false);

        rv = (RecyclerView) view.findViewById(R.id.recyclerview);

        progressBar = (ProgressBar) view.findViewById(R.id.progressBar1);
        if(savedInstanceState == null){
            showLoading();
        }


        /* This works - Hurray! */
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//
//        WeatherLocationEndpointInterface apiService =
//                retrofit.create(WeatherLocationEndpointInterface.class);
//
//        String woeid = "2487956";
//        Call<WeatherLocation> call = apiService.getWeatherLocation(woeid);
//        call.enqueue(new Callback<WeatherLocation>() {
//            @Override
//            public void onResponse(Call<WeatherLocation> call, Response<WeatherLocation> response) {
//                int statusCode = response.code();
//                WeatherLocation user = response.body();
//            }
//
//            @Override
//            public void onFailure(Call<WeatherLocation> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);


    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(getActivity(),
                setUpData()));

    }

    private List <String> setUpData(){
        List <String>items = new ArrayList<>();
        items.add("First Item");
        items.add("Second Item");
        items.add("Third Item");
        items.add("Fourth Item");

        return items;
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void loadView(WeatherLocationResponse response) {
        hideLoading();
        setupRecyclerView(rv);
    }

    public static class SimpleStringRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {

        private List<String> mValues;

        public SimpleStringRecyclerViewAdapter(Context context, List<String> items) {
            mValues = items;
        }


        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {

            holder.mTextView.setText(mValues.get(position));
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public String mBoundString;

            public final View mView;
            public final TextView mTextView;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mTextView = (TextView) view.findViewById(R.id.text1);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + mTextView.getText();
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout_recycle_view_item, parent, false);
            return new ViewHolder(view);
        }



        @Override
        public int getItemCount() {
            return mValues.size();
        }

    }
}
