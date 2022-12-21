package com.example.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class HomeAdapterForPopular extends RecyclerView.Adapter<HomeAdapterForPopular.ViewHolder>{




    int[] images;
    Context context;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1 ,  textView2;
        ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            imageView = view.findViewById(R.id.imageOfDoc);
            textView1 = view.findViewById(R.id.nameOfDoc);
            textView2 = view.findViewById(R.id.docSpeciality);

        }

        public TextView getTextView1() {
            return textView1;
        }
        public TextView getTextView2() { return textView2; }
    }




    public HomeAdapterForPopular(Context context, int[] images) {
        this.context = context ;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.activity_home_recyler_popular, viewGroup, false);

        return new HomeAdapterForPopular.ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
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
