package com.example.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list1 = (ListView)findViewById(R.id.list1);
        final List<Employee> Employee = new ArrayList<Employee>();
        Employee e1 = new Employee();
        e1.setName("ahmed");
        e1.setAge(12);
        Employee.add(e1);

        Employee e2 = new Employee();
        e1.setName("yousef");
        e1.setAge(22);
        Employee.add(e2);

        Employee e3 = new Employee();
        e1.setName("mah");
        e1.setAge(30);
        Employee.add(e3);

        Employee e4 = new Employee();
        e1.setName("Ramy");
        e1.setAge(21);
        Employee.add(e2);


        MyAdapter Adapter = new MyAdapter(getApplicationContext(),Employee,R.layout.listview);



    }
}
