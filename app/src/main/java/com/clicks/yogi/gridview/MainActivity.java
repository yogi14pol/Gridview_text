package com.clicks.yogi.gridview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView MyGrid;
    ArrayAdapter<String> MyArrayList;
    String[] PRO = {"KOTLIN","JAVA","PYTHON",
            "NODE.JS","C","C++","PHP","HTML","JAVA SCRIPT",
            "C#","ANGULAR JS","CSS","RUBY","SWIFT","VISUAL BASIC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyGrid = findViewById(R.id.MyGridID);

        MyArrayList = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1,PRO);
        MyGrid.setAdapter(MyArrayList);

    }
}
