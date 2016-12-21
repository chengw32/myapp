package MyApplication;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import Utils.LogUtil;
import Utils.MyUtils;

/**
 * Author 陈国武
 * Time 2016/12/14.
 */

public class MyApp extends Application {
    //记录当前栈里所有activity
    private List<Activity> activities = new ArrayList<Activity>();
    private static MyApp instance ;

    @Override
    public void onCreate() {
        this.instance = this ;
        MyUtils.init(this);
    }

    public static MyApp getI(){
        return instance;
    }
    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    public void finishActivity(Activity activity) {
        if (activity != null && activities.contains(activity)) {
            LogUtil.e("MyApp",activity.getClass().getName());
            this.activities.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    /**
     * 应用退出，结束所有的activity
     */
    public void exit() {
        for (Activity activity : activities) {
            if (activity != null) {
                activity.finish();
            }
        }
        System.exit(0);
    }
}
