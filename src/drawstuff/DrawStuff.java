/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.ApplicationStarter;

/**
 *
 * @author Lauchlan
 */
public class DrawStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startUp();
    }

    private static void startUp() {
        ApplicationStarter.run("Apple Advertisement", new AdEnvironment());
//        ApplicationStarter.run("Frist Drawing", new DrawEnvironment());
//        ApplicationStarter.run("Frist Drawing", new DrawEnvironment());

    }

}
