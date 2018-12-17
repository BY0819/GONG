package com.example.vmfld.gonggumi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vmfld.gonggumi.ApiData.officialM_used_mData;
import com.example.vmfld.gonggumi.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<officialM_used_mData> Ms;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<officialM_used_mData> Ms) {
        this.c = c;
        this.Ms = Ms;
    }

    @Override
    public int getCount() {
        return Ms.size();
    }

    @Override
    public Object getItem(int position) {
        return Ms.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.list_model_layout,parent,false);
        }

        TextView nameTxt= (TextView) convertView.findViewById(R.id.txt_list_date);
        TextView useName = (TextView)convertView.findViewById(R.id.txt_use_name1);
        TextView usePrice = (TextView)convertView.findViewById(R.id.txt_use_price1);
        TextView useName2 = (TextView)convertView.findViewById(R.id.txt_use_name2);
        TextView usePrice2 = (TextView)convertView.findViewById(R.id.txt_use_price2);


        final String name=Ms.get(position).getName();
        final String use_name = Ms.get(position).getTxt_use_name1();
        final String use_price= Ms.get(position).getTxt_use_price1();
        final String use_name2 = Ms.get(position).getTxt_use_name2();
        final String use_price2= Ms.get(position).getTxt_use_price2();


        nameTxt.setText(name);
        useName.setText(use_name);
        usePrice.setText(use_price);
        if(use_name2==null){
            useName2.setText("");
        }else
        {
            useName2.setText(use_name2);
        }
        if(use_price2==null){
            usePrice2.setText("");
        }else
        {
            usePrice2.setText(use_price2);
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }


}
