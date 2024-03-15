import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;

public class rectangle extends Applet {
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 400;
        int height = 200;
        g.drawRect(x, y, width, height);
    }
}


/*<html>
<body>
<applet code="rectangle.class" height="800" width="800"></applet>
</applet>
</body>
</html>*/

