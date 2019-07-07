package functionality_all;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import simplesmartsolutions.com.listlync.R;

public class ViewsChanges {

    public void imageBackgroundChange(ImageView imageView, int res){
        imageView.setBackgroundResource(res);
    }

    public void textColorChange(TextView textView, int color, Context context){
        textView.setTextColor(ContextCompat.getColor(context, color));
    }

}
