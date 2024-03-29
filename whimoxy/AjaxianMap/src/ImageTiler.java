
import org.apache.batik.apps.rasterizer.DestinationType;
import org.apache.batik.apps.rasterizer.SVGConverter;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.*;
import java.awt.image.BufferedImage;
public class ImageTiler {
private static final String BASE_DIR = "C:\\Users\\Anupam\\Documents\\Batik\\batik-1.7\\samples";
private static final int TILE_WIDTH = 100;
private static final int TILE_HEIGHT = 100;
public static void main(String[] args) throws Exception {
	// create the tiles
	String[][] sources = { { "tiles\\mapSpain.jpg", "0" },
	{"tiles\\mapSpain-smaller.jpg", "1"} };
	for (int i = 0; i < sources.length; i++) {
	String[] source = sources[i];
	BufferedImage bi = ImageIO.read(new File(BASE_DIR + source[0]));
	int columns = bi.getWidth() / TILE_WIDTH;
	int rows = bi.getHeight() / TILE_HEIGHT;
	for (int x = 0; x < columns; x++) {
	for (int y = 0; y < rows; y++) {
	BufferedImage img = new BufferedImage(TILE_WIDTH, TILE_HEIGHT,
	bi.getType());
	Graphics2D newGraphics = (Graphics2D) img.getGraphics();
	newGraphics.drawImage(bi, 0, 0, TILE_WIDTH, TILE_HEIGHT,
	TILE_WIDTH * x, TILE_HEIGHT * y,
	TILE_WIDTH * x + TILE_WIDTH,
	TILE_HEIGHT * y + TILE_HEIGHT,
	null);
	ImageIO.write(img, "JPG", new File(BASE_DIR + "tiles\\" +
	"x" + x + "y" + y + "z" + source[1] + ".jpg"));
	}
	}
 }
}
}