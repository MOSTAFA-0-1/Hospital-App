package com.example.hospital;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.classes.RecAdapter;

public class popular_Adpter1 extends RecyclerView.Adapter<popular_Adpter1.ViewHolder>{




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
            imageView = view.findViewById(R.id.p1doc_photo);
            textView1 = (TextView) view.findViewById(R.id.p1doc_name);
            textView2 = (TextView) view.findViewById(R.id.p1_doc_spec);
            textView3 = (TextView) view.findViewById(R.id.p1_doc_stars);

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


    }


    public popular_Adpter1(Context context,int[] images) {
        this.context = context ;
        this.images = images;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public popular_Adpter1.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(context)
                .inflate(R.layout.popular_item1, viewGroup, false);

        return new popular_Adpter1.ViewHolder(view);
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(popular_Adpter1.ViewHolder viewHolder, final int position) {

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
