package top.lizhengxian.drawable.drawable.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import top.lizhengxian.drawable.drawable.R;

/**
 * Created by zhengxianlzx on 17-9-7.
 */

public class CircleImageView extends AppCompatImageView {
    private int mStrokeColor;
    private float mStrokeWidth;
    private Paint mPaint;

    public CircleImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CircleImageView);
        mStrokeColor = typedArray.getColor(R.styleable.CircleImageView_strokeColor, Color.BLUE);
        mStrokeWidth = typedArray.getDimension(R.styleable.CircleImageView_strokeWidth, 0);
        mPaint = new Paint();
        mPaint.setColor(mStrokeColor);
        mPaint.setStrokeWidth(mStrokeWidth);
        typedArray.recycle();
    }
}
