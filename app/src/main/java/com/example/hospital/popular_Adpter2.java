package com.example.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.classes.RecAdapter;

public class popular_Adpter2 extends RecyclerView.Adapter<popular_Adpter2.ViewHolder>{




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
        TextView textView4;
        TextView textView5;
        ImageView imageView;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            imageView = view.findViewById(R.id.docPhoto);
            textView1 = (TextView) view.findViewById(R.id.docName);
            textView2 = (TextView) view.findViewById(R.id.docSpec);
            textView3 = (TextView) view.findViewById(R.id.stars);
            textView4 = (TextView) view.findViewById(R.id.rate);
            textView5 = (TextView) view.findViewById(R.id.views);
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
        public TextView getTextView4() {
            return textView4;
        }
        public TextView getTextView5() {
            return textView5;
        }

    }


    public popular_Adpter2(Context context,int[] images) {
        this.context = context ;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public popular_Adpter2.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.popular_item2, viewGroup, false);

        return new popular_Adpter2.ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(popular_Adpter2.ViewHolder viewHolder, final int position) {

        viewHolder.getTextView1().setText(provider.doctors.get(position).getFirstName() + provider.doctors.get(position).getLastName());
        viewHolder.getTextView2().setText(provider.doctors.get(position).getSpecialty());
        viewHolder.imageView.setImageResource(images[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return provider.doctors.size();
    }
}
