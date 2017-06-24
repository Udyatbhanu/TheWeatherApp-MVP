package weather.ubbs.home.com.theweatherapp.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import nucleus5.factory.RequiresPresenter;
import nucleus5.view.NucleusActivity;
import weather.ubbs.home.com.theweatherapp.R;
import weather.ubbs.home.com.theweatherapp.presenter.MainActivityPresenter;


@RequiresPresenter(MainActivityPresenter.class)
public class MainActivity extends NucleusActivity<MainActivityPresenter> implements MainActivityPresenter.View {


    Button getImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getImageButton = (Button) findViewById(R.id.weather_icon_button);
        getImageButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NavigationActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void publishResults() {

    }




}
