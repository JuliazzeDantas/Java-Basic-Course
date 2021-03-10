package screensize;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenSize {
	
	public static void main(String[] args) {
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		System.out.println("The screen size is: " + dimension.width + "x" + dimension.height);
	}
}
