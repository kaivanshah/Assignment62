package com.kaivanshah.assignment62.Fragements;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kaivanshah.assignment62.MyAdapter;
import com.kaivanshah.assignment62.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    ListView lv_Items;
    OnCustomItemSelectedListener mCallback;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnCustomItemSelectedListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_list, container, false);
        lv_Items = (ListView)(view.findViewById(R.id.lv_Items));
        ArrayList<String> oList = new ArrayList<String>();
        oList.add(0, "Layout1");
        oList.add(1, "Layout2");
        oList.add(2, "Layout3");
        oList.add(3, "Layout4");
        oList.add(4, "Layout5");
        MyAdapter oAdapter = new MyAdapter(oList.size(), getContext(), oList);
        lv_Items.setAdapter(oAdapter);
        return view;
    }


    // Container Activity must implement this interface
    public interface OnCustomItemSelectedListener {
        public void onCustomItemSelected(String positionValue);
    }

}
