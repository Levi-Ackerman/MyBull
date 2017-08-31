package top.lizhengxian.drawable.drawable;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;

public class HomeActivity extends Activity {
    NavigationTabBar mNavigationTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mNavigationTabBar = (NavigationTabBar) findViewById(R.id.navigation);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.icon_chevron),
                Color.RED).title("heart").build()
        );
        models.add(new NavigationTabBar.Model.Builder(getResources().getDrawable(R.drawable.icon_switch_checked), Color.YELLOW).build());
        mNavigationTabBar.setModels(models);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpage);
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view.equals(object);
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View view = new View(HomeActivity.this);
                if (position == 0)
                    view.setBackgroundColor(Color.GREEN);
                if (position == 1)
                    view.setBackgroundColor(Color.BLUE);
                container.addView(view);
                return view;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                ((ViewGroup) container).removeViewAt(position);
            }
        });
        mNavigationTabBar.setViewPager(viewPager);
    }
}
