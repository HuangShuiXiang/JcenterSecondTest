package com.hsx.jcentersecondtest;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/5/9 0009.
 */
public class ToastUtil {
    public static void toastShort(Context context, String content){
        Toast.makeText(context,content, Toast.LENGTH_SHORT).show();
    }
    public static void toastLong(Context context, String content){
        Toast.makeText(context,content, Toast.LENGTH_LONG).show();
    }
}
