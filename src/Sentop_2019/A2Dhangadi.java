/*
 Write down the code to print simple hello world applet program and write HTML page to embedded
website
 */
package Sentop_2019;
import java.applet.*;
import java.awt.*;
//<APPLET CODE=A2Dhangadi HEIGHT=400 WIDTH=400></APPLET>
public class A2Dhangadi extends Applet {
    public void paint(Graphics g){
        g.drawString("Hello World", 100,100);
    }
    
}
