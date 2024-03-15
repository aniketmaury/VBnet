import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;

public class SmileFace extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 50, 200, 200); 
        g.fillOval(100, 100, 20, 20);
        g.fillOval(180, 100, 20, 20);   
        g.drawArc(100, 120, 100, 100, 180, 180);
    }
}

/*<html>
<body>
<applet code="SmileFace.class" height="800" width="800"></applet>
</applet>
</body>
</html>*/