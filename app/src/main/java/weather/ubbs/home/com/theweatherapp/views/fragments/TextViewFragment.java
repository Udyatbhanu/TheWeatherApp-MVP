package weather.ubbs.home.com.theweatherapp.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nucleus5.view.NucleusSupportFragment;
import weather.ubbs.home.com.theweatherapp.R;

/**
 * Created by udyatbhanu-mac on 6/17/17.
 */

public class TextViewFragment extends NucleusSupportFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rv = (View) inflater.inflate(
                R.layout.fragment_textview, container, false);
        return rv;
    }
}
