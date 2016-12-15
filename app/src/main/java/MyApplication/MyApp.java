package MyApplication;

import android.app.Application;

import Utils.MyUtils;

/**
 * Author 陈国武
 * Time 2016/12/14.
 */

public class MyApp extends Application {

    private static MyApp instance ;

    @Override
    public void onCreate() {
        this.instance = this ;
        MyUtils.init(this);
    }

    public static MyApp getI(){
        return instance;
    }

}
