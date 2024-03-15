import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;

public class TriangleApp extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {300, 350, 400};
        int[] yPoints = {400, 300, 400};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}

/*<html>
<body>
<applet code="TriangleApp.class" height="800" width="800"></applet>
</applet>
</body>
</html>*/

