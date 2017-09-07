package top.lizhengxian.drawable.drawable;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {
    private Drawer mDrawer;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        AccountHeader accountHeader = new AccountHeaderBuilder().withTranslucentStatusBar(true)
                .addProfiles(new ProfileDrawerItem().withIcon(R.drawable.ic_home_tab_market_selector).withName("hello"))
                .withDividerBelowHeader(false)
                .withActivity(this)
                .build();
        mDrawer = new DrawerBuilder()
                .withToolbar(toolbar)
                .withActivity(this)
                .inflateMenu(R.menu.drawer)
                .withTranslucentStatusBar(true)
                .withAccountHeader(accountHeader)
                .withMultiSelect(false)
                .withSelectedItemByPosition(-1)
                .build();
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen()) {
            mDrawer.closeDrawer();
        } else {
            super.onBackPressed();
        }
    }
}
