package com.example.hospital;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;



public class calender_Adaptor extends RecyclerView.Adapter<com.example.hospital.calender_Adaptor.ViewHolder>{



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
            button= (Button) view.findViewById(R.id.Cbtn);

        }

        public Button getButton() {
            return button;
        }



    }


    public calender_Adaptor(Context context) {
        this.context = context ;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public com.example.hospital.calender_Adaptor.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.calender_item, viewGroup, false);

        return new com.example.hospital.calender_Adaptor.ViewHolder(view);

    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(com.example.hospital.calender_Adaptor.ViewHolder viewHolder, final int position) {


        viewHolder.getButton().setText(provider.doctors.get(0).getFreeTime().get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override

    public int getItemCount() {
        return provider.doctors.get(0).getFreeTime().size();
    }
}

