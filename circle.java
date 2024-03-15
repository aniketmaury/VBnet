import java.io.*;
import java.applet.Applet;
import java.awt.*;

public class circle extends Applet {
    public void paint(Graphics g) {
        int x = 200;
        int y = 200;
        int diameter = 200;
        g.drawOval(x, y, diameter, diameter);
    }
}

/*<html>
<body>
<applet code="circle.class" height="800" width="800"></applet>
</applet>
</body>
</html>*/
