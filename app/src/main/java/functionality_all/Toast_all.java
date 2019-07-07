package functionality_all;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Toast_all {

    public void Toast_show(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

//    public void show_snack_bar(CoordinatorLayout coordinatorLayout,String message) {
//        Snackbar snackbar = Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_LONG);
//        View view = snackbar.getView();
//        CoordinatorLayout.LayoutParams  params= (CoordinatorLayout.LayoutParams) view.getLayoutParams();
//        params.gravity = Gravity.TOP;
//        view.setLayoutParams(params);
//        snackbar.show();
//    }
}