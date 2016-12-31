package com.androidlokomedia.jsonparsingusegsondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ahmad on 23/12/2016.
 */
public class CustomAdapter extends BaseAdapter{
    private List<Response.MoviesBean> mMoviesBeen;
    private Context context;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, List<Response.MoviesBean> mMoviesBeen) {
        this.context = context;
        this.mMoviesBeen = mMoviesBeen;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return mMoviesBeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.each_list_item, parent, false);

        Response.MoviesBean item = (Response.MoviesBean) getItem(position);

        ImageView thumbnail = (ImageView) rowView.findViewById(R.id.thumbnail);
        TextView title = (TextView) rowView.findViewById(R.id.title);
        TextView rating = (TextView) rowView.findViewById(R.id.rating);

        String imageUrl = item.getImage();
        Picasso.with(context).load(imageUrl).into(thumbnail);
        title.setText(item.getMovie());
        rating.setText((int) item.getRating());


        return rowView;
    }
}
