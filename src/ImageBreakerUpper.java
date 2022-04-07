import javax.imageio.ImageIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageBreakerUpper {
	
	public static final int PICTURES = 95;
	
	private static BufferedImage input;
	
	//this is horizontal
	public static void main(String[] args) throws IOException {
		input = ImageIO.read(new File("input.png"));
		
		int imagePartWidth = input.getWidth()/PICTURES;
		
		for (int i = 0; i < PICTURES; i++) {
			File create = new File("results/" + i +".png");
	        if (!create.exists()) {
	        	create.createNewFile();
	        }
	        BufferedImage image = input.getSubimage(i*imagePartWidth, 0, imagePartWidth, input.getHeight());
	        
	        ImageIO.write(image, "png", create);
		}
	}
}
