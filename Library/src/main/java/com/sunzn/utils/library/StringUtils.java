package com.sunzn.utils.library;

import com.sunzn.utils.library.port.Connector;

import java.util.List;
import java.util.Objects;

/**
 * Created by sunzn on 2016/12/7.
 */

public class StringUtils {

    public static final String NULL = "";

    private StringUtils() {
        throw new RuntimeException("Stub!");
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：校验字符串是否为 NULL
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：s
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：Boolean
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static boolean isNull(String s) {
        return s == null;
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：校验字符串是否为 NULL 的字符串
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：s
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：Boolean
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static boolean isNullStr(String s) {
        return "NULL".equalsIgnoreCase(s);
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：校验字符串是否为空
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：s
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：Boolean
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：校验多个字符串是否为空
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：strings
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：Boolean
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static boolean isEmpty(String... strings) {
        for (String str : strings) {
            if (isEmpty(str)) return true;
        }
        return false;
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：校验字符串是否相等
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：s,t
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：Boolean
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static boolean equals(String s, String t) {
        return Objects.equals(s, t);
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：当传入值为空时，返回指定默认值
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：s,defValue
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：String
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static String getString(String s, String defValue) {
        return isEmpty(s) ? defValue : s;
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：返回一个非空的String
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：s
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：String
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static String getNonNullString(String s) {
        return s == null ? NULL : s;
    }

    /**
     * ╔════════════════════════════════════════════════════════════════════════════════════════════
     * ║ 名称：返回一个用给定字符连接的String
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 参数：data,mark,connector
     * ╟────────────────────────────────────────────────────────────────────────────────────────────
     * ║ 返回：String
     * ╚════════════════════════════════════════════════════════════════════════════════════════════
     */
    public static <T> String connectString(List<T> data, String mark, Connector<T> connector) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < (data == null ? 0 : data.size()); i++) {
            builder.append(connector.getString(data.get(i)));
            builder.append(i == data.size() - 1 ? "" : mark);
        }
        return builder.toString();
    }

}
