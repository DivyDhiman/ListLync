package FragmentsListLync;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import AdaptersListLync.ViewPagerAdapter_home;
import simplesmartsolutions.com.listlync.R;



public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View homeFragmentView =  inflater.inflate(R.layout.home_fragment_layout,container,false);

        initialise_view(homeFragmentView);

        return homeFragmentView;
    }


    private void initialise_view(View root_view) {
        ViewPager viewPager = (ViewPager) root_view.findViewById(R.id.viewPager);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout) root_view.findViewById(R.id.tab_layout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter_home view_pager_home = new ViewPagerAdapter_home(getChildFragmentManager());
        view_pager_home.addFrag(new ForSaleChildFragment(), getString(R.string.forsale_childfragment_name));
        view_pager_home.addFrag(new ForRentChildFragment(), getString(R.string.forrent_childfragment_name));
        viewPager.setAdapter(view_pager_home);
    }

}
