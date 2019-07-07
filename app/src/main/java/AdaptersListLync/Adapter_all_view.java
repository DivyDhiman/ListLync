package AdaptersListLync;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.HashMap;

import simplesmartsolutions.com.listlync.R;


public class Adapter_all_view extends RecyclerView.Adapter<Adapter_all_view.ViewHolder> {

    private Context context;
    private ArrayList<HashMap<String, Object>> data;
    private HashMap<String, Object> data_sub;
    private ArrayList<String> click_data = new ArrayList<>();
    private String type;
    private int layout_pass;


    public Adapter_all_view(Context context, ArrayList<HashMap<String, Object>> data,int layout_pass, String type) {
        this.context = context;
        this.data = data;
        this.type = type;
        this.layout_pass = layout_pass;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(layout_pass, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
//        data_sub = data.get(position);

        if (type.equals(context.getString(R.string.forsale_childfragment_name))) {
            call_method(1, holder);
        } else if (type.equals(context.getString(R.string.forrent_childfragment_name))) {
            call_method(2, holder);
        }
    }

    private void call_method(int i, ViewHolder holder) {
        switch (i) {
            case 1:
                break;

            case 2:
                break;

        }
    }


    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View view) {
            super(view);
            if (type.equals(context.getString(R.string.forsale_childfragment_name))) {

            } else if (type.equals(context.getString(R.string.forrent_childfragment_name))) {

            }
        }
    }
}