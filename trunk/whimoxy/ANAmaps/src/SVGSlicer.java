//package com.ajaxian.amaps;
import org.apache.batik.apps.rasterizer.DestinationType;
import org.apache.batik.apps.rasterizer.SVGConverter;
import java.io.File;
public class SVGSlicer {
private static final String BASE_DIR = "resources/";
public static void main(String[] args) throws Exception {
SVGConverter converter = new SVGConverter();
// width in pixels; height auto-calculated
converter.setWidth(2000);
converter.setSources(new String[] { BASE_DIR + "svg/mapSpain.svg" });
converter.setDst(new File(BASE_DIR + "tiles/mapSpain.jpg"));
converter.setDestinationType(DestinationType.JPEG);
converter.execute();
converter.setWidth(1500);
converter.setDst(new File(BASE_DIR + "tiles/mapSpain-smaller.jpg"));
converter.execute();
}
}