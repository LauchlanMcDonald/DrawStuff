/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Lauchlan
 */
class DrawEnvironment extends Environment {
    
    public DrawEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Silver_Transparent.png");
        
        this.setBackground(Color.white);
    }
    
    Image logo;
    
    @Override
    public void initializeEnvironment() {
    }
    
    @Override
    public void timerTaskHandler() {
    }
    
    @Override
    public void keyPressedHandler(KeyEvent e) {
    }
    
    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }
    
    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }
    
    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.drawOval(0, 0, 30, 30);
        graphics.setColor(Color.red);
        graphics.drawOval(20, 0, 30, 30);
        graphics.setColor(Color.BLUE);
        graphics.drawOval(40, 0, 30, 30);
        graphics.setColor(Color.yellow);
        graphics.drawOval(30, 25, 30, 30);
        graphics.setColor(Color.green);
        graphics.drawOval(10, 25, 30, 30);
        
        graphics.setColor(new Color(0, 255, 195));
        graphics.fillOval(70, 70, 100, 70);
        
        graphics.setColor(new Color(45, 45, 45));
        graphics.fillOval(200, 200, 40, 40);
        graphics.setColor(new Color(100, 100, 100));
        graphics.fillOval(210, 200, 40, 40);
        
        graphics.setColor(Color.BLUE);
        graphics.setFont(new Font("Calibri", Font.ITALIC, 35));
        graphics.drawString("Colin is very strong, don't mess with him", 200, 100);
        
        if (logo != null) {
            graphics.drawImage(logo, 400, 150, 150, 150, this);
            
        }
        
    }
    
}
