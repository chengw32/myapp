package Utils;

import android.widget.Toast;

import MyApplication.MyApp;

/**
 *
 * Author 陈国武
 * Time 2016/12/14.
 */

public class ToastUtils {
    private void ToastUtils(){}
    private static Toast toast;
    private static void init(){
            if (null == toast){
                toast = Toast.makeText(MyApp.getI(),"",Toast.LENGTH_SHORT);}
    }


    public static void show(String message){
        init();
        toast.setText(message);
        toast.show();
    }

}
