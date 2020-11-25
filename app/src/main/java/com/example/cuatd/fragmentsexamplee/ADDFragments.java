package com.example.cuatd.fragmentsexamplee;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ADDFragments extends Fragment {

int receiveNum=0;
    public ADDFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(this.getArguments()!=null)
        {
            receiveNum=this.getArguments().getInt("NUM");
            View inflatedView=inflater.inflate(R.layout.fragment_addfragments,container,false);
            TextView tview=inflatedView.findViewById(R.id.TextViewADD);
            tview.setText("The Square of Number "+receiveNum+"is"+ receiveNum*receiveNum);
        return  inflatedView;
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_addfragments, container, false);
    }

}
