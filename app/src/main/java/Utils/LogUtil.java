package Utils;

import android.util.Log;

/**
 * Author 陈国武
 * Time 2016/12/21.
 * Des:
 */

public class LogUtil {

    private boolean isOpenLog = true;
    public static void e(String tag,String message){
        Log.e(tag,message);
    }

}
