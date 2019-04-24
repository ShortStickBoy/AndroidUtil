package com.sunzn.utils.library;

import android.view.View;
import android.widget.TextView;

public class ViewUtils {

    private ViewUtils() {
        throw new RuntimeException("Stub!");
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：设置 View 显示状态
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：view
     * ║ 参数：visibility
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static void setVisibility(View view, int visibility) {
        if (view != null) view.setVisibility(visibility);
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：绑定 TextView
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：view
     * ║ 参数：text
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：void
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static void bindTextView(TextView view, String text) {
        if (view != null) view.setText(text == null ? "" : text);
    }

}
