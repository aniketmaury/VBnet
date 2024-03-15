import java.io.*;
import java.applet.Applet;
import java.awt.*;

public class hello extends Applet
{
    public void paint(Graphics a)
     {
        a.drawString("Hello World", 20, 20);
     }
}
/*
<html>
<body>
<applet code="hello.class" height="200" width="200">
</applet>
</body>
</html>
 */
