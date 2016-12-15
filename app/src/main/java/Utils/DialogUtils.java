package Utils;

import android.app.Dialog;
import android.content.Context;

import com.cgw.custom.myapp.R;

/**
 * des: 弹窗工具
 * Author 陈国武
 * Time 2016/12/14.
 */

public class DialogUtils {
    private void DialogUtils(){}
    private static DialogUtils instance ;
    public static DialogUtils getI(){
        if (null == instance)instance = new DialogUtils();
        return instance;
    }

    private Dialog dl ;
    private void getDialog(Context context){
        if (null == dl){
            dl = new Dialog(context);
            dl.setContentView(R.layout.activity_main);
        }
    }

    public void show(Context context){
        getDialog(context);
            dl.show();
    }






}
