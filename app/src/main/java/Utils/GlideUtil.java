package Utils;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.cgw.custom.myapp.R;


/**
 * Author 陈国武
 * Time 2016/12/14.
 * 默认缓存路径/data/data/your_package_name/image_manager_disk_cache/
 */

public class GlideUtil {

    /**
     * Des：在activity里显示图片 Glide会根据activity生命周期对图片的引用
     * Author：陈国武
     * Time：2016/12/15 9:46
     */
    
    public static void displayImageFromAct(Activity activity, String url, ImageView v){
        Glide.with(activity).load(url)
                //图片居中裁剪
                .centerCrop()
                //加载失败的示例图
                .placeholder(R.mipmap.ic_launcher)
                //Glide的缓存机制是根据imageview不同大小会从网络加载不同大小的图片存储 下面的这个设置
                //是只加载一张图片 当imageview不同时 从下载好的图片去读取 根据imageview大小是适配
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                //图片手动适配大小
//                .override(50,50)
                //图片变换
//                .transform()
                .crossFade()
                .into(v);
    }

    /**
     * Des：加载gif图不能有.centerCrop()
     * Author：陈国武
     * Time：2016/12/15 10:25
     */
    
    public static void displayGif(Context context,String url,ImageView v){
        Glide.with(context)
                .load(url)
//                .listener(new RequestListener<String, GlideDrawable>() {
//                    @Override
//                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
//                        Log.e("onException","--------------");
//                        return false;
//                    }
//
//                    @Override
//                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
//
//                        Log.e("onResourceReady","--------------");
//                        return false;
//                    }
//                })
                //加载失败的示例图
                .placeholder(R.mipmap.ic_launcher)
                //Glide的缓存机制是根据imageview不同大小会从网络加载不同大小的图片存储 下面的这个设置
                //是只加载一张图片 当imageview不同时 从下载好的图片去读取 根据imageview大小是适配
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                //图片手动适配大小
//                .override(50,50)
                //添加动画()
//                .animate();
                .crossFade()
                .into(v);
    }

}
