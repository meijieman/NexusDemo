package com.major.lib1;

import android.util.Log;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2018/7/28 7:55
 */
public class PrintUtil {

    public static final String VERSION = "2018年7月28日 20:19:41";
    public static final int VERSION_CODE = 3;

    public static void print(String msg) {
        Log.w("tag_pu", msg);
    }

    public static String getValue(String msg) {
        return "the val: " + msg +"snapshot 2";
    }
}
