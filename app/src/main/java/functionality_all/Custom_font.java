package functionality_all;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by brahmasys on 1/11/2017.
 */

public class Custom_font {

    public void font_normal(TextView v, Context c) {
        Typeface face = Typeface.createFromAsset(c.getAssets(), "fonts/calibri.ttf");
        v.setTypeface(face);
    }

    public void font_bold(TextView v, Context c) {
        Typeface face = Typeface.createFromAsset(c.getAssets(), "fonts/calibrib.ttf");
        v.setTypeface(face);
    }

    public void font_light(TextView v, Context c) {
        Typeface face = Typeface.createFromAsset(c.getAssets(), "fonts/calibril.ttf");
        v.setTypeface(face);
    }

    }

