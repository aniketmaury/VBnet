import java.applet.*;
import java.awt.*;

public class SmileyFaceApplet extends Applet {
		public void paint(Graphics g) {
    
    			g.setColor(Color.YELLOW);
    			g.fillOval(50, 50, 200, 200);
   	 
    			g.setColor(Color.BLACK);
    			g.fillOval(100, 100, 30, 30);
    			g.fillOval(180, 100, 30, 30);
   	 
   			g.fillArc(100, 120, 110, 100, 180, 180);
		}
}
/* <applet code="circle.class" height="800" width="800">
</applet>*/