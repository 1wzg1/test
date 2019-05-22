/**
 * @author wangzhiguo
 * 
 * @date 2019年3月23日
 *
 * @TODO
 */
package package1;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

/**
 * @author wangzhiguo
 *
 * @date 2019年3月23日
 */
public class P1son {
	public static void main(String[] args) {
		while (true) {
		Point mousepoint = MouseInfo.getPointerInfo().getLocation();
		Robot r = null;
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r.getPixelColor(mousepoint.x, mousepoint.y));
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	}
}
