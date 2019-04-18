/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surveyval;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author m.gaertner
 */
public class Surveyval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*JFrame meinFrame = new JFrame("Beispiel JFrame");
        meinFrame.setSize(640, 480);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        meinFrame.setLocation(dim.width/2-meinFrame.getSize().width/2, dim.height/2-meinFrame.getSize().height/2);
        meinFrame.setVisible(true);*/
        MainFrame mainFrame = new MainFrame();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setLocation(dim.width/2-mainFrame.getSize().width/2, dim.height/2-mainFrame.getSize().height/2);
        mainFrame.setVisible(true);
    }
}
