//package com.example.hospital;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//
//import com.example.hospital.classes.Doctor;
//import com.example.hospital.classes.DoctorView;
//
//public class TestsAdapter  extends ArrayAdapter<String> {
//    Context context;
//    String [] arr = {"nasr","assem"};
//    String [] arr2 = {"nasr222","assem333"};
//    int[] images ;
//
//    public TestsAdapter(@NonNull Context context,int[] images) {
//        super(context, R.layout.testlistitem, R.id.tests_doctor_list);
//        this.context = context ;
//        this.images = images;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
//        View  singleItem = layoutInflater.inflate(R.layout.testlistitem,parent,false);
//
//
////        ImageView imageView = singleItem.findViewById(R.id.testimage);
//        TextView textView = singleItem.findViewById(R.id.testtext);
//        TextView textView2 = singleItem.findViewById(R.id.testtext2);
//
//
////        imageView.setImageResource(images[position]);
//        textView.setText(arr[position]);
//        textView.setText(arr2[position]);
//
//        return singleItem;
//    }
//}
