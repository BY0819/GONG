package com.example.vmfld.gonggumi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vmfld.gonggumi.ApiData.Divide_used_mData;
import com.example.vmfld.gonggumi.ApiData.officialM_used_mData;
import com.example.vmfld.gonggumi.R;

import java.util.ArrayList;

public class DivideCustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<Divide_used_mData> Ms;
    LayoutInflater inflater;

    public DivideCustomAdapter(Context c, ArrayList<Divide_used_mData> Ms) {
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
            convertView=inflater.inflate(R.layout.content_divide,parent,false);
        }

        TextView nameTxt= (TextView) convertView.findViewById(R.id.str_i_name);
        TextView usePrice = (TextView)convertView.findViewById(R.id.str_i_publicprice);
        TextView Left = (TextView)convertView.findViewById(R.id.str_i_leftprice);
        TextView usePrice2 = (TextView)convertView.findViewById(R.id.str_i_personalprice);


        final String name=Ms.get(position).getName();
        final String use_price= Ms.get(position).getTxt_use_price1();
        final String left = Ms.get(position).getTxt_left();
        final String use_price2= Ms.get(position).getTxt_use_price2();


        nameTxt.setText(name);
        usePrice.setText(use_price);
        usePrice2.setText(use_price2);
        Left.setText(left);


        return convertView;
    }


}
