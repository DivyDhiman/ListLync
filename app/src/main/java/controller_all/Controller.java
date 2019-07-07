package controller_all;

import android.app.Application;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import functionality_all.Check_all;
import functionality_all.Custom_font;
import functionality_all.Toast_all;
import functionality_all.ViewsChanges;


//Controller centralized call calling in whole application extended Application
public class Controller extends Application {

    private Check_all checkAll = new Check_all();
    private Toast_all toast_all = new Toast_all();
    private Custom_font custom = new Custom_font();
    private ViewsChanges viewsChanges = new ViewsChanges();


    public void imageBackgroundChange(ImageView imageView, int res){
        viewsChanges.imageBackgroundChange(imageView,res);
    }

    public void textColorChange(TextView textView, int color, Context context){
        viewsChanges.textColorChange(textView,color,context);
    }


    //Check if Edit Text has empty value or not by calling class CheckAll method Empty_CHeck from controller class
    public boolean Check_all_empty(EditText editText) {
        return checkAll.EmptyCheck_edittext(editText);
    }


    //Check if Edit Text has email formate like "@ etc value or not by calling class CheckAll method Email_edittext from controller class
    public boolean Check_all_email(EditText editText) {
        return checkAll.Email_edittext(editText);
    }

    //Check if Edit Text password nad confirm password value are matches or not by calling class CheckAll method Check_all_confirmpassword from controller class
    public boolean Check_all_matches(EditText editText, String match) {
        return checkAll.Matches_edittext(editText, match);
    }


    public boolean Password_length(EditText editText, int start, int end) {
        return checkAll.Password_length(editText, start, end);
    }


    //Check Internet connections
    public boolean InternetCheck(Context context) {
        return checkAll.isNetWorkStatusAvialable(context);
    }

    public void Toast_show(Context context, String message) {
        toast_all.Toast_show(context, message);
    }


    public void font_normal(TextView v, Context c) {
        custom.font_normal(v, c);
    }

    public void font_bold(TextView v, Context c) {
        custom.font_bold(v, c);
    }

    public void font_light(TextView v, Context c) {
        custom.font_light(v, c);
    }

}