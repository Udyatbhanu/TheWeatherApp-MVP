package weather.ubbs.home.com.theweatherapp.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import nucleus5.factory.RequiresPresenter;
import nucleus5.view.NucleusSupportFragment;
import weather.ubbs.home.com.theweatherapp.R;
import weather.ubbs.home.com.theweatherapp.presenter.GridViewFragmentPresenter;

/**
 * Created by udyatbhanu-mac on 6/17/17.
 */

@RequiresPresenter(GridViewFragmentPresenter.class)
public class GridViewFragment extends NucleusSupportFragment<GridViewFragmentPresenter> implements
        GridViewFragmentPresenter.View{


    RecyclerView rv;
    Button b;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_grid_view, container, false);


        rv = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        b = (Button) view.findViewById(R.id.button_images);


        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                getPresenter().downloadImages();

            }
        });
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public void loadView(int columns) {
        b.setVisibility(View.GONE);
        rv.setVisibility(View.VISIBLE);

        ContentAdapter adapter = new ContentAdapter();
        rv.setHasFixedSize(true);
        int tilePadding = getResources().getDimensionPixelSize(R.dimen.tile_padding);
        rv.setPadding(tilePadding, tilePadding, tilePadding, tilePadding);
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rv.setAdapter(adapter);
    }

    public static class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {


        private static final int LENGTH = 6;
        public ContentAdapter() {
            super();
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.grid_view_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.mTextView.setText("Test");
        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {

            public final View mView;
            public final TextView mTextView;


            public ViewHolder(View view) {
                super(view);
                mView = view;
                mTextView = (TextView) view.findViewById(R.id.grid_text);
            }
        }
    }
}
