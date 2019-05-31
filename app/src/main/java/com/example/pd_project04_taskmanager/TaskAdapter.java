package com.example.pd_project04_taskmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter {

    private ArrayList<Task> alTask;
    private Context context;
    private TextView tvTitle;
    private TextView tvDate;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);
        // Store the data that is passed to this adapter
        alTask = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.task_row, parent, false);

        // Get the TextView object
        tvTitle = rowView.findViewById(R.id.task_name);
        tvDate = rowView.findViewById(R.id.task_date);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Task current = alTask.get(position);
        // Set the TextView to show the food

        tvTitle.setText(current.getName());
        tvDate.setText(current.getDate());

        // Return the nicely done up View to the ListView
        return rowView;
    }

}
