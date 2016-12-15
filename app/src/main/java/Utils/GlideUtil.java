package Utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.cgw.custom.myapp.R;

/**
 * Author 陈国武
 * Time 2016/12/14.
 */

public class GlideUtil {

    public static void showImage(Context context, String url, ImageView v){
        Glide.with(context).load(url)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .into(v);
    }

}
