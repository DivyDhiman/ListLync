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


public class ForSaleChildFragment extends Fragment {

    private RecyclerView forSaleList;
    private ArrayList<HashMap<String,Object>> data;
    private Adapter_all_view adapter_all_view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View forSaleChildFragmentView = inflater.inflate(R.layout.forsale_childfragment_layout, container, false);

        initialise_view(forSaleChildFragmentView);

        return forSaleChildFragmentView;
    }

    private void initialise_view(View root_view) {
        forSaleList = (RecyclerView) root_view.findViewById(R.id.for_sale_list);

        data = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(forSaleList.getContext(),LinearLayoutManager.VERTICAL,false);
        forSaleList.setLayoutManager(linearLayoutManager);
        adapter_all_view = new Adapter_all_view(forSaleList.getContext(),data,R.layout.sale_adapter_view,getString(R.string.forsale_childfragment_name));
        forSaleList.setAdapter(adapter_all_view);
    }
}