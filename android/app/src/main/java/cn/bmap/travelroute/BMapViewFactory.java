package cn.bmap.travelroute;

import android.content.Context;
import android.view.View;

import com.baidu.mapapi.map.MapView;

import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class BMapViewFactory extends PlatformViewFactory {
   private MapView mapView;

   public BMapViewFactory(MessageCodec<Object> createArgsCodec, MapView mapView) {
       super(createArgsCodec);
       this.mapView = mapView;
   }
    //重写platformViewFactory platformViewFactory的主要任务就是在create的时候创建一个view并把他传给flutter

    @Override
   public PlatformView create(final Context context, int i, Object o) {
       return new PlatformView() {
           @Override
           public View getView() {
               return mapView;
           }

           @Override
           public void dispose() {

           }
       };
   }
}