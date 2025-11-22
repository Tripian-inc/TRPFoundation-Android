package com.tripian.trpfoundationkit;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

public class TRPLogger {

    public static final String TAG = "TRPLogger";
    private static boolean isDebug = true;

    private TRPLogger() {
        // not initialize
    }

    public static void toast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }

    public static void setIsDebug(boolean isDebug) {
        TRPLogger.isDebug = isDebug;
    }

    public static void debug(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void debug(String prefix, Class cls, String functionName, String msg) {
        if (isDebug) {
            Log.d("[" + prefix + "]" + " " + "[" + cls.getSimpleName() + "/" + functionName + "]", msg);
        }
    }

    public static void debug(String msg) {
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }

    public static void verbose(String msg) {
        if (isDebug) {
            Log.v(TAG, msg);
        }
    }

    public static void verbose(String prefix, Class cls, String functionName, String msg) {
        if (isDebug) {
            Log.v("[" + prefix + "]" + " " + "[" + cls.getSimpleName() + "/" + functionName + "]", msg);
        }
    }

    public static void error(String tag, String error) {

        if (isDebug) {

            Log.e(tag, error);
        }
    }

    public static void error(String error) {

        if (isDebug) {

            Log.e(TAG, error);
        }
    }

    public static void error(String prefix, Class cls, String functionName, String msg) {
        if (isDebug) {
            Log.e("[" + prefix + "]" + " " + "[" + cls.getSimpleName() + "/" + functionName + "]", msg);
        }
    }

    public static void isMainThread() {
        if (isDebug) {
            Log.e(TAG, "---isMainThread：" + (Thread.currentThread() == Looper.getMainLooper().getThread()));
        }
    }

    public static void logRequest(String msg) {
        if (isDebug) {
            Log.d("VolleyNetwork: URL", msg);
        }
    }


    public static void logJson(String tag, String msg) {
        if (isDebug) {
            Log.d("VolleyNetwork: " + tag, msg);
        }
    }

    public static void logHeader(String tag, String msg) {
        if (isDebug) {
            Log.d("VolleyNetwork: " + tag, msg);
        }
    }
}