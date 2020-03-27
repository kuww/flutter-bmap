
package cn.bmap.travelroute;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

import io.flutter.app.FlutterApplication;

public class MainApplication extends FlutterApplication {
   @Override
   public  void onCreate(){
       //重写oncreate函数 让在application的时候初始化百度的sdk
       super.onCreate();
       SDKInitializer.initialize(this);
       SDKInitializer.setCoordType(CoordType.BD09LL);
   }
}

