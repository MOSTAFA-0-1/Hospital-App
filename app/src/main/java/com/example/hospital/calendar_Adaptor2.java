package com.example.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;

public class calendar_Adaptor2 extends RecyclerView.Adapter<com.example.hospital.calendar_Adaptor2.ViewHolder> {

    int[] images;
    Context context;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        Button button;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            button= (Button) view.findViewById(R.id.Cbtn2);

        }

        public Button getButton() {
            return button;
        }



    }


    public calendar_Adaptor2(Context context,int[] images) {
        this.context = context ;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public com.example.hospital.calendar_Adaptor2.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.calender_item2, viewGroup, false);

        return new com.example.hospital.calendar_Adaptor2.ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(com.example.hospital.calendar_Adaptor2.ViewHolder viewHolder, final int position) {


        viewHolder.getButton().setText(provider.doctors.get(position).getAvailableTime());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return provider.doctors.size();
    }
}

