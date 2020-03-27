
package cn.bmap.travelroute;

import android.os.Bundle;

import com.baidu.mapapi.map.MapView;
import io.flutter.app.FlutterActivity;
public class MainActivity extends FlutterActivity {

//    在MainActivity中实例化地图并组册以上添加的ViewRegistrant
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       // GeneratedPluginRegistrant.registerWith(this);
       MapView mapView = new MapView(this);
       ViewRegistrant.registerWith(this, mapView);
   }
}