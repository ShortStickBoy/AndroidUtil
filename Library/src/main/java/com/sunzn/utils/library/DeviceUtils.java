package com.sunzn.utils.library;

import android.os.Build;

/**
 * Created by sunzn on 2016/12/7.
 */

public class DeviceUtils {

    private DeviceUtils() {
        throw new RuntimeException("Stub!");
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：获取设备系统版本号
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：int
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static int getSDKVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：获取设备厂商
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：String
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

}
