import view.Begin;
import javax.swing.*;
import java.awt.*;

public class RestaurantsSystem {
    public static void main(String[] args){
        try{
            String systemLookAndFeel = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(systemLookAndFeel);
        }
        catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException e){
            System.out.println("Error: " + e);
        }
        EventQueue.invokeLater(()->{
            Begin begin = new Begin();
            begin.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            begin.setVisible(true);
        });
    }
}
