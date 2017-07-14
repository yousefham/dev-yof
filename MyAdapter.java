package com.example.test2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by best tech on 7/13/2017.
 */

public class MyAdapter extends BaseAdapter {
    List <Employee> Employee ;
    int layout ;
    Context context ;

    public MyAdapter(Context context , List<com.example.test2.Employee> Employee , int layout ){
        this.context = context ;
        this.Employee = Employee ;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return Employee.size();
    }

    @Override
    public Object getItem(int position) {

        return Employee.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Employee emp = Employee.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);
            ImageView im = (ImageView) convertView.findViewById(R.id.im);
            TextView textname = (TextView) convertView.findViewById(R.id.textname);
            TextView textage = (TextView) convertView.findViewById(R.id.textage);
            Button delbtn = (Button)convertView.findViewById(R.id.delete_btn);
            delbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, emp.getName(), Toast.LENGTH_SHORT).show();
                    Employee.remove(position);
                    notifyDataSetChanged();

                }
            });
            Viewholder vh = new Viewholder();
            vh.im = im;
            vh.textage = textage;
            vh.textname = textname;
            convertView.setTag(vh);

        }
        Viewholder vh = (Viewholder)convertView.getTag();
        vh.im.setImageResource(emp.getImageid());
        vh.textname.setText(emp.getName());
        vh.textage.setText(emp.getAge() + "");
        return null;
    }
    class Viewholder{
        ImageView im ;
        TextView textname ;
        TextView textage ;
    }
}
