package top.lizhengxian.multifragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import top.lizhengxian.butterfork.ButterFork;

/**
 * Created by zhengxianlzx on 17-9-24.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterFork.bind(this);
    }
}
