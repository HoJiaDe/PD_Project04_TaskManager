package com.example.pd_project04_taskmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnEdit, btnDelete;
    ListView lvTask;
    ArrayAdapter aaTask;
    ArrayList<Task> alDailyGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper db = new DBHelper(MainActivity.this);

        db.getWritableDatabase();
        db.close();

        btnAdd = findViewById(R.id.buttonAdd);
        btnEdit = findViewById(R.id.buttonEdit);
        btnDelete = findViewById(R.id.buttonDelete);
        lvTask = findViewById(R.id.lvTask);


        ArrayList<Task> data = db.getAllTask();

        db.close();



//                String txt = "";
//                for (int i = 0; i < data.size(); i++) {
//                    Log.d("Database Content", i +". "+data.get(i));
//                    txt += i + ". " + data.get(i) + "\n";
//                }


//                tvResults.setText(txt);


        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aaTask = new TaskAdapter(MainActivity.this, R.layout.task_row, data);
        lvTask.setAdapter(aaTask);
    }
}
