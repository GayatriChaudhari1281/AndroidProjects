package com.example.database;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class StudentRvAdapter extends RecyclerView.Adapter<StudentRvAdapter.ViewHolder> {

    // variable for our array list and context
    private ArrayList<Student> studentArrayList;
    private Context context;

    // constructor
    public StudentRvAdapter(ArrayList<Student> studentArrayList, Context context) {
        this.studentArrayList = studentArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        Student modal = studentArrayList.get(position);
        holder.RollNo.setText(modal.getRollNo());
        holder.SName.setText(modal.getName());
        holder.Saddress.setText(modal.getAddress());
        holder.SMarks.setText(modal.getMarks());
    }

    @Override
    public int getItemCount() {
        return studentArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our text views.
        private TextView RollNo, SName, Saddress, SMarks;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            RollNo= itemView.findViewById(R.id.idRollNo);
            SName = itemView.findViewById(R.id.idName);
            Saddress = itemView.findViewById(R.id.idAddress);
            SMarks = itemView.findViewById(R.id.idMarks);
        }
    }
}
