package com.example.hospital.classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.R;
import com.example.hospital.provider;

import java.security.Provider;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder>{




        int[] images;
        Context context;

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        public static class ViewHolder extends RecyclerView.ViewHolder {
              TextView textView;
            ImageView imageView;
            public ViewHolder(View view) {
                super(view);
                // Define click listener for the ViewHolder's View
                imageView = view.findViewById(R.id.testsdoc);
                textView = (TextView) view.findViewById(R.id.TestsPrice);
            }

            public TextView getTextView() {
                return textView;
            }
        }


        public RecAdapter(Context context,int[] images) {
            this.context = context ;
            this.images = images;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            // Create a new view, which defines the UI of the list item
            View view = LayoutInflater.from(context)
                    .inflate(R.layout.tests_single_item, viewGroup, false);

            return new ViewHolder(view);
        }
 


    // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {

//            viewHolder.getTextView().setText(provider.doctors.get(position).getFirstName() + provider.doctors.get(position).getLastName());
            viewHolder.imageView.setImageResource(images[position]);
            viewHolder.textView.setText(provider.doctors.get(position).getFirstName());
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return provider.doctors.size();
        }
    }



