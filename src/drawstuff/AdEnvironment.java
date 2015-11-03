/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Lauchlan
 */
public class AdEnvironment extends Environment {

    Image logo;
    
    public AdEnvironment() {
        this.setBackground(Color.WHITE);
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Silver_Transparent.png");
    }

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

        graphics.setColor(new Color(0, 255, 255));
        graphics.fillOval(50, 50, 70, 70);
        graphics.setColor(new Color(240, 128, 128));
        graphics.fillOval(500, 500, 70, 70);
        graphics.setColor(new Color(255, 165, 0));
        graphics.fillOval(300, 180, 70, 70);
        graphics.setColor(new Color(50, 205, 50));
        graphics.fillOval(50, 400, 70, 70);
        graphics.setColor(new Color(0, 0, 255));
        graphics.fillOval(400, 50, 70, 70);
        graphics.setColor(new Color(255, 0, 0));
        graphics.fillOval(40, 600, 70, 70);
        graphics.setColor(new Color(148, 0, 211));
        graphics.fillOval(90, 300, 70, 70);
        graphics.setColor(new Color(112, 128, 144));
        graphics.fillOval(400, 300, 70, 70);
        graphics.setColor(new Color(0, 100, 0));
        graphics.fillOval(600, 70, 70, 70);
        graphics.setColor(new Color(255, 140, 0));
        graphics.fillOval(700, 100, 70, 70);
        graphics.setColor(new Color(255, 69, 0));
        graphics.fillOval(800, 200, 70, 70);
        graphics.setColor(new Color(255, 255, 0));
        graphics.fillOval(600, 100, 70, 70);
        graphics.setColor(new Color(0, 255, 255));
        graphics.fillOval(500, 200, 70, 70);
        graphics.setColor(new Color(112, 128, 144));
        graphics.fillOval(500, 500, 70, 70);
        graphics.setColor(new Color(255, 0, 0));
        graphics.fillOval(700, 550, 70, 70);
        graphics.setColor(new Color(0, 128, 0));
        graphics.fillOval(300, 550, 70, 70);
        graphics.setColor(new Color(30, 144, 255));
        graphics.fillOval(200, 100, 70, 70);
        graphics.setColor(new Color(255, 105, 180, 180));
        graphics.fillOval(200, 500, 70, 70);
        graphics.setColor(new Color(176, 196, 222, 200));
        graphics.fillOval(350, 600, 70, 70);
        graphics.setColor(new Color(0, 0, 255, 150));
        graphics.fillOval(530, 470, 70, 70);
        graphics.setColor(new Color(0, 100, 0, 200));
        graphics.fillOval(500, 300, 70, 70);
        graphics.setColor(new Color(255, 140, 0, 140));
        graphics.fillOval(470, 470, 70, 70);
        graphics.setColor(new Color(255, 105, 180, 180));
        graphics.fillOval(90, 400, 70, 70);
        graphics.setColor(new Color(112, 128, 144, 100));
        graphics.fillOval(100, 330, 70, 70);
        graphics.setColor(new Color(50, 205, 50, 180));
        graphics.fillOval(600, 400, 70, 70);
        graphics.setColor(new Color(0, 100, 0, 200));
        graphics.fillOval(700, 300, 70, 70);
        graphics.setColor(new Color(0, 255, 255, 200));
        graphics.fillOval(200, 400, 70, 70);
        graphics.setColor(new Color(0, 255, 255, 180));
        graphics.fillOval(200, 440, 70, 70);
        graphics.setColor(new Color(50, 205, 50, 200));
        graphics.fillOval(70, 230, 70, 70);
        graphics.setColor(new Color(0, 100, 0, 150));
        graphics.fillOval(700, 90, 70, 70);
        graphics.setColor(new Color(255, 255, 0, 150));
        graphics.fillOval(200, 320, 70, 70);
        graphics.setColor(new Color(112, 128, 144, 220));
        graphics.fillOval(700, 600, 70, 70);

        if (logo != null) {
            graphics.drawImage(logo, 360, 200, 150, 175, this);
        }

    }
}
