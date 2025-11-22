package com.tripian.trpfoundationkit;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * Created by Tripian on 16.09.2018
 */
public class Util {

    private Util(){
        // do not initialize
    }

    public static String toStringFromIdsArray(Integer[] ids) {
        String result = "";

        if (ids.length > 0){
            StringBuilder sb = new StringBuilder();

            for (int id: ids){
                sb.append(id).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }

        return "id:" + result;
    }

    public static String toStringFromIdListArray(Integer[] ids) {
        String result = "";

        if (ids.length > 0){
            StringBuilder sb = new StringBuilder();

            for (int id: ids){
                sb.append(id).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }

        return result;
    }

    public static String toStringFromIdListArray(List<Integer> ids) {
        String result = "";

        if (ids.size() > 0){
            StringBuilder sb = new StringBuilder();

            for (int id: ids){
                sb.append(id).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }

        return result;
    }

    public static String toStringFromTagListArray(List<String> tags) {
        String result = "";

        if (tags.size() > 0){
            StringBuilder sb = new StringBuilder();

            for (String tag: tags){
                sb.append(tag).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }

        return result;
    }

    public static String createUrlWithParams(String url, Map<String, Object> params) {
        StringBuilder builder = new StringBuilder();
        for (String key : params.keySet()) {
            Object value = params.get(key);
            if (value != null) {
                try {
                    value = URLEncoder.encode(String.valueOf(value), "UTF-8");
                    if (builder.length() > 0)
                        builder.append("&");
                    builder.append(key).append("=").append(value);
                }
                catch (UnsupportedEncodingException e) {
                    TRPLogger.debug(e.getMessage());
                }
            }
        }

        return url + ("?" + builder.toString());
    }
}
