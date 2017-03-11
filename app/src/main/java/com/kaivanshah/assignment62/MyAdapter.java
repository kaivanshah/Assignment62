package com.kaivanshah.assignment62;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.kaivanshah.assignment62.Fragements.ListFragment;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by kaivanrasiklal.s on 10-03-2017.
 */

public class MyAdapter extends BaseAdapter {

    int TotalCount;
    Context oContext;
    ArrayList<String> oList;
    com.kaivanshah.assignment62.Fragements.ListFragment.OnCustomItemSelectedListener mCallback;

    public MyAdapter(int Count, Context context, ArrayList<String> list)
    {
        TotalCount = Count;
        oContext = context;
        oList = list;
        mCallback = (ListFragment.OnCustomItemSelectedListener) oContext;
    }

    @Override
    public int getCount() {
        return TotalCount;
    }

    @Override
    public Object getItem(int position) {
        return oList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(oContext);
            row = inflater.inflate(R.layout.row_list, parent, false);
        }
        Button btn_Layout = (Button) (row.findViewById(R.id.btn_Layout));
        btn_Layout.setText(getItem(position).toString());

        final String posValue = getItem(position).toString();

        btn_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallback.onCustomItemSelected(posValue);
            }
        });

        return  row;
    }
}
