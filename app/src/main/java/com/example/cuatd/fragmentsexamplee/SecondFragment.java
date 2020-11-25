package com.example.cuatd.fragmentsexamplee;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    String mytext="";
    //String[] AndroidOS = new String[] { "Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream SandWich","Jelly Bean","KitKat" };
    //String[] Version = new String[]{"1.5","1.6","2.0-2.1","2.2","2.3","3.0-3.2","4.0","4.1-4.3","4.4"};
    public SecondFragment() {
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
            View inflatedView = inflater.inflate(R.layout.fragment_second, container, false);
            TextView tview = inflatedView.findViewById(R.id.textview);
            tview.setText("This is second fragment " + mytext);
            return inflatedView;
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    private void setListAdapter(ArrayAdapter<String> adapter) {

    }

   }
