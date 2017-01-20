package com.example.welook.slideapp_pidgy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Welook on 1/20/2017.
 */

public class HwFragment extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.hwfragment,container,false);
        TextView textView= (TextView)view.findViewById(R.id.textView2);
        Bundle bundle = getArguments();
        String message = Integer.toString(bundle.getInt("count"));
        textView.setText("this is the count" + message + "swipe");
        return view;
    }
}
