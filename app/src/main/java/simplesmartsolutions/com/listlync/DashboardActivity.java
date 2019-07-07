package simplesmartsolutions.com.listlync;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import FragmentsListLync.FilterFragment;
import FragmentsListLync.HomeFragment;
import FragmentsListLync.SavedFragment;
import controller_all.Controller;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;
    private Controller controller;
    private LinearLayout homeParent, savedParent, filterParent, sortParent;
    private TextView homeTextView, savedTextView, filterTextView, sortTextView;
    private ImageView homeImageView, savedImageView, filterImageView, sortImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        context = this;
        controller = new Controller();

        setCustomActionBar();

        initializeViewElements();

        replaceFragment(new HomeFragment());


    }


    public void initializeViewElements() {

        homeParent = (LinearLayout) findViewById(R.id.home_parent);
        savedParent = (LinearLayout) findViewById(R.id.saved_parent);
        filterParent = (LinearLayout) findViewById(R.id.filter_parent);
        sortParent = (LinearLayout) findViewById(R.id.sort_parent);


        homeTextView = (TextView) findViewById(R.id.home_textview);
        savedTextView = (TextView) findViewById(R.id.saved_textview);
        filterTextView = (TextView) findViewById(R.id.filter_textview);
        sortTextView = (TextView) findViewById(R.id.sort_textview);


        homeImageView = (ImageView) findViewById(R.id.home_imageview);
        savedImageView = (ImageView) findViewById(R.id.saved_imageview);
        filterImageView = (ImageView) findViewById(R.id.filter_imageview);
        sortImageView = (ImageView) findViewById(R.id.sort_imageview);


        homeParent.setOnClickListener(this);
        savedParent.setOnClickListener(this);
        filterParent.setOnClickListener(this);
        sortParent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.home_parent:
                selectChanger(R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                        R.color.color_blue, R.color.default_text_color, R.color.default_text_color, R.color.default_text_color);
                replaceFragment(new HomeFragment());
                break;

            case R.id.saved_parent:
                selectChanger(R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                        R.color.default_text_color, R.color.color_blue, R.color.default_text_color, R.color.default_text_color);
                replaceFragment(new SavedFragment());
                break;

            case R.id.filter_parent:
                selectChanger(R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                        R.color.default_text_color, R.color.default_text_color, R.color.color_blue, R.color.default_text_color);
                replaceFragment(new FilterFragment());
                break;

            case R.id.sort_parent:
                selectChanger(R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                        R.color.default_text_color, R.color.default_text_color, R.color.default_text_color, R.color.color_blue);
                break;

            case R.id.notification_icon:
                break;

            case R.id.user_profile:
                break;
        }
    }


    private void selectChanger(Object... args) {
        int imageHome, imageSaved, imageFilter, imageSort, textHome, textSaved, textFilter, textSort;

        imageHome = (int) args[0];
        imageSaved = (int) args[1];
        imageFilter = (int) args[2];
        imageSort = (int) args[3];

        textHome = (int) args[4];
        textSaved = (int) args[5];
        textFilter = (int) args[6];
        textSort = (int) args[7];

        controller.imageBackgroundChange(homeImageView, imageHome);
        controller.imageBackgroundChange(savedImageView, imageSaved);
        controller.imageBackgroundChange(filterImageView, imageFilter);
        controller.imageBackgroundChange(sortImageView, imageSort);

        controller.textColorChange(homeTextView, textHome, context);
        controller.textColorChange(savedTextView, textSaved, context);
        controller.textColorChange(filterTextView, textFilter, context);
        controller.textColorChange(sortTextView, textSort, context);

    }

private void replaceFragment(Fragment fragment)
{

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    fragmentTransaction.replace(R.id.replace_container,fragment);
    try {
        fragmentTransaction.commit();
    }
    catch (Exception e)
    {}

}


    private void setCustomActionBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton notificationIconImageButton,userProfileImageButton;

        notificationIconImageButton = (ImageButton) toolbar.findViewById(R.id.notification_icon);
        userProfileImageButton = (ImageButton) toolbar.findViewById(R.id.user_profile);


        notificationIconImageButton.setOnClickListener(this);
        userProfileImageButton.setOnClickListener(this);
    }

}
