package com.example;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

@GlideModule
public class GlideConfigModule extends AppGlideModule {
    /*int diskSize = 1024 * 1024 * 100;
    int memorySize = (int) (Runtime.getRuntime().maxMemory()) / 8;  // 取1/8最大内存作为最大缓存
*/
    /*@Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
        // 定义缓存大小和位置
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, diskSize));  // 内存中
        // builder.setDiskCache(new ExternalCacheDiskCacheFactory(context, "cache", diskSize)); // sd卡中

        // 默认内存和图片池大小
        // MemorySizeCalculator calculator = new MemorySizeCalculator(context);
        // int defaultMemoryCacheSize = calculator.getMemoryCacheSize(); // 默认内存大小
        // int defaultBitmapPoolSize = calculator.getBitmapPoolSize(); // 默认图片池大小
        // builder.setMemoryCache(new LruResourceCache(defaultMemoryCacheSize));
        // builder.setBitmapPool(new LruBitmapPool(defaultBitmapPoolSize));

        // 自定义内存和图片池大小
        builder.setMemoryCache(new LruResourceCache(memorySize)); // 自定义内存大小
        builder.setBitmapPool(new LruBitmapPool(memorySize)); // 自定义图片池大小

        // 定义图片格式
        // builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
        //builder.setDecodeFormat(DecodeFormat.PREFER_RGB_565); // 默认
    }*/
}
