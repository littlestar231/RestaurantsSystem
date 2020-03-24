package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        /*
        Welcome To Restaurant
         */
        JLabel WelcomeToRestaurant = new JLabel("Welcome to restaurant!");
        WelcomeToRestaurant.setFont(new Font("Times New Roman", Font.BOLD, 40));
        /*
        Choose Service
         */
        JLabel ChooseService = new JLabel("Please choose the service:");
        ChooseService.setFont(new Font("Times New Roman", Font.BOLD, 18));
        /*
        StaffLoginIn
         */
        JButton btnStaffLoginIn = new JButton("Staff Login In");
        btnStaffLoginIn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        btnStaffLoginIn.setForeground(new Color(0, 0, 0));
        btnStaffLoginIn.setBackground(new Color(255, 255, 255));
        btnStaffLoginIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnStaffLoginInActionPerformed(actionEvent);
            }
        });
        /*
        CustomerLoginIn
         */
        JButton btnCustomerLoginIn = new JButton("Customer Login In");
        btnCustomerLoginIn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        btnCustomerLoginIn.setBackground(new Color(255, 255, 255));
        btnCustomerLoginIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnCustomerLoginInActionPerformed(actionEvent);
            }
       
        });
        JButton btnStaffRegister = new JButton("Staff Register");
        btnStaffRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        btnStaffRegister.setBackground(new Color(255,255,255));
        btnStaffRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnStaffRegisterActionPerformed(actionEvent);
            }
        });
    }

    private void btnStaffRegisterActionPerformed(ActionEvent actionEvent) {
    }

    private void btnCustomerLoginInActionPerformed(ActionEvent evt) {
    }

    private void btnStaffLoginInActionPerformed(ActionEvent evt) {
    }


    public void addWindowListener(WindowAdapter windowAdapter) {
    }

    public void setVisible(boolean b) {
    }
}
