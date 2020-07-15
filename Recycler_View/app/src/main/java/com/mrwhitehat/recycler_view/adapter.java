package com.mrwhitehat.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.MyAdapter> {

    int my_image[];
    String code_name[], version[], api_level[], date[];
    Context activity_main;

    public adapter(MainActivity mainActivity, int[] my_images, String[] code_names, String[] versions, String[] api_levels, String[] dates) {
        my_image = my_images;
        code_name = code_names;
        version = versions;
        api_level = api_levels;
        date = dates;
        activity_main = mainActivity;
    }

    @NonNull
    @Override
    public adapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity_main).inflate(R.layout.mydata, parent, false);
        MyAdapter viewHolder = new MyAdapter(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.MyAdapter holder, int position) {

        holder.image.setImageResource(my_image[position]);
        holder.code_name8.setText(code_name[position]);
        holder.version8.setText("Version: " + version[position]);
        holder.api_level8.setText("API: " + api_level[position]);
        holder.date8.setText("Released on: " + date[position]);

    }

    @Override
    public int getItemCount() {
        return my_image.length;
    }

    public class MyAdapter extends RecyclerView.ViewHolder {

        ImageView image;
        TextView code_name8, version8, api_level8, date8;

        public MyAdapter(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            code_name8 = itemView.findViewById(R.id.code_name8);
            version8 = itemView.findViewById(R.id.version8);
            api_level8 = itemView.findViewById(R.id.api_level8);
            date8 = itemView.findViewById(R.id.date8);

        }
    }
}
