package FragmentsListLync;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import simplesmartsolutions.com.listlync.R;



public class SavedFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View savedFragmentView =  inflater.inflate(R.layout.saved_fragment_layout,container,false);

        return savedFragmentView;
    }
}
