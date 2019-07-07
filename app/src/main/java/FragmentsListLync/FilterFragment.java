package FragmentsListLync;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import simplesmartsolutions.com.listlync.R;

public class FilterFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View filterFragmentView =  inflater.inflate(R.layout.filter_fragment_layout,container,false);

        return filterFragmentView;
    }
}
