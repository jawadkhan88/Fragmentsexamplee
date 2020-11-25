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
public class FifthtFragment extends Fragment {
    String mytext="";

    public FifthtFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(this.getArguments()!=null)
        {
            //to get data in mytext
            mytext = this.getArguments().getString("DATA");
            //for viewing DATA
            //inflate to expand data
            View inflatedView = inflater.inflate(R.layout.fragment_fiftht, container, false);
            TextView tview = inflatedView.findViewById(R.id.textview);
            tview.setText("This is fifth fragment " + mytext);
            return inflatedView;
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fiftht, container, false);
    }

}
