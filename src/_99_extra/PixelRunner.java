package _99_extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty PixelParty = new PixelParty();
	PixelParty.getRandomColor();
	PixelParty.drawCircle(100, 250, 50);
	PixelParty.drawRectangle(155,375,50,75);
	PixelParty.drawLine(450, 210, 25, 175);
	PixelParty.drawTriangle(50, 500, 175, 300, 40, 100);
	PixelParty.saveImage();
	PixelParty.displayImage();
	
	}
}
