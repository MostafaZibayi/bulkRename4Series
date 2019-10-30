/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulkrenameformovie;


import java.awt.Toolkit;
import javax.swing.*;

public class win {

    public void setLoc(JFrame jf) {

        double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        
//        jf.setSize(Integer.MAX_VALUE, Integer.MAX_VALUE);

        width = (width - jf.getWidth()) / 2;
        height = (height - jf.getHeight()) / 2;
        jf.setLocation((int) width, (int) height);

    }

    public void setStyle(JFrame jframe) {

        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            SwingUtilities.updateComponentTreeUI(jframe);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "WindowsStyle", 0);
        }
    }

}
