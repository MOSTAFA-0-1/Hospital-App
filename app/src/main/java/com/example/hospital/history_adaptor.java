package com.example.hospital;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.RecAdapter;

public class history_adaptor extends RecyclerView.Adapter<history_adaptor.ViewHolder>{




    int[] images;
    Context context;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView textView2;
        TextView textView3;
        ImageView imageView;


        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            imageView = view.findViewById(R.id.hdoc_img);
            textView1 = (TextView) view.findViewById(R.id.hdoc_name);
            textView2 = (TextView) view.findViewById(R.id.hDoc_spec);
            textView3 = (TextView) view.findViewById(R.id.hDoc_time);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    provider.intentTo(view.getContext(),doctor_details.class,getLayoutPosition());
                    System.out.println(getLayoutPosition());
                }
            });

        }

        public TextView getTextView1() {
            return textView1;
        }
        public TextView getTextView2() {
            return textView2;
        }
        public TextView getTextView3() {
            return textView3;
        }
        public ImageView getImageView(){return imageView;}


    }


    public history_adaptor(Context context,int[] images) {
        this.context = context ;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public history_adaptor.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.history_item, viewGroup, false);

        return new history_adaptor.ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(history_adaptor.ViewHolder viewHolder, final int position) {

        viewHolder.getTextView1().setText(provider.doctors.get(position).getFirstName() + provider.doctors.get(position).getLastName());
        viewHolder.getTextView2().setText(provider.doctors.get(position).getSpecialty());
        viewHolder.getTextView3().setText(provider.doctors.get(position).getAvailableTime());
//        viewHolder.imageView.setImageResource(Integer.parseInt(provider.doctors.get(position).getUrl()));
        viewHolder.imageView.setImageResource(images[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return provider.doctors.size();
    }

}
