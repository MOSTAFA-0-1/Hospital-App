package com.example.hospital.classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.R;
import com.example.hospital.provider;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeAdapterForFeature extends RecyclerView.Adapter<HomeAdapterForFeature.ViewHolder>{

    int[] images;
    Context context;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1 ,  textView2;
        CircleImageView imageView;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            imageView = view.findViewById(R.id.imageOfDocFeatured);
            textView1 = view.findViewById(R.id.nameOfDocFeatured);
            textView2 = view.findViewById(R.id.SpecialityOfDocFeatured);

        }

        public TextView getTextView1() {
            return textView1;
        }
        public TextView getTextView2() { return textView2; }
    }

    public HomeAdapterForFeature(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.activity_home_recyler_feature, viewGroup, false);
        return new HomeAdapterForFeature.ViewHolder(view);
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
