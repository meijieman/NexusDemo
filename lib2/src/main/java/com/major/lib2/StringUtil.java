package com.major.lib2;

import android.content.Context;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2018/7/29 22:42
 */
public class StringUtil {

    public static String getRes(Context ctx) {
        return ctx.getResources().getString(R.string.app_name) + " 快照+2";
    }
}
