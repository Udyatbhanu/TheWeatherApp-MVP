package weather.ubbs.home.com.theweatherapp.views.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.IOException;

import nucleus5.factory.RequiresPresenter;
import nucleus5.view.NucleusActivity;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import weather.ubbs.home.com.theweatherapp.R;
import weather.ubbs.home.com.theweatherapp.presenter.ImagesActivityPresenter;

/**
 * Created by udyatbhanu-mac on 6/17/17.
 */


@RequiresPresenter(ImagesActivityPresenter.class)
public class ImagesActivity extends NucleusActivity<ImagesActivityPresenter> {


    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        mImageView = (ImageView) findViewById(R.id.weather_icon);


//        RequestBuilder requestBuilder = Glide.with(this)
//                .using(Glide.buildStreamModelLoader(Uri.class, mActivity), InputStream.class)
//                .from(Uri.class)
//                .as(SVG.class)
//                .transcode(new SvgDrawableTranscoder(), PictureDrawable.class)
//                .sourceEncoder(new StreamEncoder())
//                .cacheDecoder(new FileToStreamDecoder<SVG>(new SvgDecoder()))
//                .decoder(new SvgDecoder())
//                .placeholder(R.drawable.ic_facebook)
//                .error(R.drawable.ic_web)
//                .animate(android.R.anim.fade_in)
//                .listener(new SvgSoftwareLayerSetter<Uri>());


//        new DownloadImageTask(mImageView)
//                .execute("https://www.metaweather.com/static/img/weather/c.svg");



//        Glide.with(this).load("https://www.metaweather.com/static/img/weather/c.svg").into(mImageView);

        Glide.with(this).load("https://pbs.twimg.com/profile_images/61655057/2425718692_1783fe0913_b.jpg").into(mImageView);
//        new DownloadImageTask(mImageView)
//                .execute(" https://pbs.twimg.com/profile_images/61655057/2425718692_1783fe0913_b.jpg");


    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {

            final OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url(urls[0])
                    .build();

            Response response = null;
            Bitmap mIcon11 = null;
            try {
                response = client.newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (response.isSuccessful()) {
                try {

                    mIcon11 = BitmapFactory.decodeStream(response.body().byteStream());
                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }

            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }

}
