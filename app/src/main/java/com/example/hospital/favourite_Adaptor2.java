package com.example.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class favourite_Adaptor2 extends RecyclerView.Adapter<favourite_Adaptor2.ViewHolder>{




    int[] images;
    Context context;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            imageView = view.findViewById(R.id.imgfdoc2);
            textView = (TextView) view.findViewById(R.id.namefdoc);
            textView2 = (TextView) view.findViewById(R.id.pricefdoc);

        }

        public TextView getTextView() {
            return textView;
        }
        public TextView getTextView2() {
            return textView2;
        }
    }


    public favourite_Adaptor2(Context context,int[] images) {
        this.context = context ;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.favourite_item2, viewGroup, false);

        return new ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        viewHolder.getTextView().setText(provider.doctors.get(position).getFirstName() + provider.doctors.get(position).getLastName());
        viewHolder.getTextView2().setText(provider.doctors.get(position).getPrice());
        viewHolder.imageView.setImageResource(images[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return provider.doctors.size();
    }
}

