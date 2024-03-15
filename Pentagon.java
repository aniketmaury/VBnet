import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;

public class Pentagon extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {100, 200, 300, 250, 150};
        int[] yPoints = {200, 100, 200, 300, 300};
        Polygon pentagon = new Polygon(xPoints, yPoints, 5);
        g.fillPolygon(pentagon);
    }
}
/*<html>
<body>
<applet code="Pentagon.class" height="800" width="800"></applet>
</applet>
</body>
</html>*/