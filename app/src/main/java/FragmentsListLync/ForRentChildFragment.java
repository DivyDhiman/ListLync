package FragmentsListLync;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;

import AdaptersListLync.Adapter_all_view;
import simplesmartsolutions.com.listlync.R;


public class ForRentChildFragment extends Fragment {

    private RecyclerView forRentList;
    private ArrayList<HashMap<String,Object>> data;
    private Adapter_all_view adapter_all_view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View forRentChildFragmentView = inflater.inflate(R.layout.forrent_childfragment_layout, container, false);

        initialise_view(forRentChildFragmentView);

        return forRentChildFragmentView;
    }

    private void initialise_view(View root_view) {
     forRentList = (RecyclerView) root_view.findViewById(R.id.for_rent_list);

        data = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(forRentList.getContext(),LinearLayoutManager.VERTICAL,false);
        forRentList.setLayoutManager(linearLayoutManager);
        adapter_all_view = new Adapter_all_view(forRentList.getContext(),data,R.layout.rent_adapter_view,getString(R.string.forrent_childfragment_name));
        forRentList.setAdapter(adapter_all_view);
    }
}
