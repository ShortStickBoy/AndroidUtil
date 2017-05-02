package com.sunzn.utils.library;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sunzn on 2017/4/20.
 */

public class DrawableUtils {

    private DrawableUtils() {
        throw new RuntimeException("Stub!");
    }

    /**
     * ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：生成对应的 Drawable
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：context  上下文
     * ║ 参数：id       资源
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static Drawable getDrawable(@NonNull Context context, @DrawableRes int id) {
        return ContextCompat.getDrawable(context, id);
    }

    /**
     * ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：设置 TextView 的 DrawableLeft
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：context  上下文
     * ║ 参数：view     TextView
     * ║ 参数：id       资源
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static void setDrawableLeft(@NonNull Context context, @NonNull TextView view, @DrawableRes int id) {
        Drawable drawable = getDrawable(context, id);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        view.setCompoundDrawables(drawable, null, null, null);
    }

    /**
     * ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：设置 TextView 的 DrawableRight
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：context  上下文
     * ║ 参数：view     TextView
     * ║ 参数：id       资源
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static void setDrawableRight(@NonNull Context context, @NonNull TextView view, @DrawableRes int id) {
        Drawable drawable = getDrawable(context, id);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        view.setCompoundDrawables(null, null, drawable, null);
    }

    /**
     * ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：设置 TextView 的 DrawableTop
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：context  上下文
     * ║ 参数：view     TextView
     * ║ 参数：id       资源
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static void setDrawableTop(@NonNull Context context, @NonNull TextView view, @DrawableRes int id) {
        Drawable drawable = getDrawable(context, id);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        view.setCompoundDrawables(null, drawable, null, null);
    }

    /**
     * ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：设置 TextView 的 DrawableBottom
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：context  上下文
     * ║ 参数：view     TextView
     * ║ 参数：id       资源
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static void setDrawableBottom(@NonNull Context context, @NonNull TextView view, @DrawableRes int id) {
        Drawable drawable = getDrawable(context, id);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        view.setCompoundDrawables(null, null, null, drawable);
    }

    /**
     * ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：为 View 设置背景 Drawable
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：view      控件
     * ║ 参数：drawable  背景
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     */
    static void setBackground(@NonNull View view, @NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /**
     * ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：生成对应色彩的 NinePatchDrawable
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：context   上下文
     * ║ 参数：tintColor 颜色
     * ║ 参数：id        背景资源
     * ╟──────────────────────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static Drawable getTintNinePatchDrawable(@NonNull Context context, @ColorInt int tintColor, @DrawableRes int id) {
        final NinePatchDrawable drawable = (NinePatchDrawable) getDrawable(context, id);
        drawable.setColorFilter(new PorterDuffColorFilter(tintColor, PorterDuff.Mode.SRC_IN));
        return drawable;
    }

}