package top.lizhengxian.drawable.drawable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import top.lizhengxian.butterfork.annotation.BindLayout;
import top.lizhengxian.butterfork.annotation.BindView;
import top.lizhengxian.multifragments.BaseActivity;

@BindLayout(R.layout.activity_home)
public class HomeActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    protected Toolbar mToolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(getDrawable(R.drawable.ic_vector_menu));
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.title_bar,menu);
        return true;
    }
}
