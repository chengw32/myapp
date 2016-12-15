package Utils;

import android.content.Context;

import java.io.File;

import Constants.AppConstant;

/**
 * Des：各种工具
 * Author：陈国武
 * Time：2016/12/14 9:31
 */

public class MyUtils {


    private void MyUtils(){}
    private static MyUtils instance ;
    private static Context ctx ;
    public static void init(Context context){
        ctx = context;
        initInstance();
        instance.initAppFolder();
    }

    /**
     * Des：MyUtils 单例
     * Author：陈国武
     * Time：2016/12/14 9:54
     */
    private static void initInstance(){
        if (null == instance)instance = new MyUtils();
    }

    /**
     * Des：创建app存储文件的路径
     * Author：陈国武
     * Time：2016/12/14 10:51
     */

    private void initAppFolder(){
        File appPath = new File(AppConstant.APPDIR);
        if (!appPath.isDirectory())appPath.mkdirs();
    }

}
