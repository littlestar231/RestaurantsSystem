package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class Begin extends JFrame{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Begin frame = new Begin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame
     */
    public Begin(){
        setTitle("Restaurants System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,701,545);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(223,237,255));
        contentPane.setForeground(new Color(255, 179, 111));
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        JLabel WelcomeToRestaurant = new JLabel("Welcome to restaurant!");
        WelcomeToRestaurant.setFont(new Font("Times New Roman", Font.BOLD, 40));
    }



    public void addWindowListener(WindowAdapter windowAdapter) {
    }

    public void setVisible(boolean b) {
    }
}
