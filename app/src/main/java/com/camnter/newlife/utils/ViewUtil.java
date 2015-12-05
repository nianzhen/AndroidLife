package com.camnter.newlife.utils;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;

/**
 * Description：ViewUtil
 * Created by：CaMnter
 * Time：2015-12-04 22:33
 */
public class ViewUtil {
    /**
     * Set view alpha
     * 设置透明度
     *
     * @param view  view
     * @param alpha alpha value
     */
    public static void setAlpha(View view, int alpha) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            view.setAlpha(alpha / 255.0f);
        } else {
            Drawable drawable = view.getBackground();
            if (drawable != null) {
                drawable.setAlpha(alpha);
            }
        }
    }

    /**
     * 根据Android系统版本，调用版本API中的设置EditText背景的方法
     * According to the Android version, calls the Settings in the EditText background method of version API
     *
     * @param editText
     * @param drawable
     */
    public static void setEditTextBackgroundDrawable(EditText editText,Drawable drawable){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            editText.setBackground(drawable);
        } else {
            editText.setBackgroundDrawable(drawable);
        }
    }

}