package lab5_3Collected;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
    

   
public class WindowBorder implements Border {
        private Color color;
        public WindowBorder(Color color) {
            this.color = color;
        }
        public void paintBorder(Component component, Graphics g, int x, int y, int width, int height) {
            Insets insets = getBorderInsets(component);
            g.setColor(color);
            g.fillRect(x,y,3,height);
            g.fillRect(x,y,width,3);
            g.setColor(color.darker());
            g.fillRect(x+width-insets.right, y, 3, height);
            g.fillRect(x,y+height-insets.bottom, width, 3);
        }
        public Insets getBorderInsets(Component component) {
            return new Insets(3,3,3,3);
        }
        public boolean isBorderOpaque() {
            return false;
        }
    }
