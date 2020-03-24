package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Begin extends JFrame{
    private static final long serialVersionUID = 1L;
    JPanel contentPane;
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
        /*
        StaffRegister
         */
        JButton btnStaffRegister = new JButton("Staff Register");
        btnStaffRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        btnStaffRegister.setBackground(new Color(255,255,255));
        btnStaffRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnStaffRegisterActionPerformed(actionEvent);
            }
        });
        /*
        CustomerRegister
         */
        JButton btnCustomerRegister = new JButton("Customer Register");
        btnCustomerRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        btnCustomerRegister.setBackground(new Color(255,255,255));
        btnCustomerRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnCustomerRegisterActionPerformed(actionEvent);
            }
        });
        /*
        Exit
         */
        JButton btnExit = new JButton("Exit");
        btnExit.setFont(new Font("Eras Bold ITC", Font.PLAIN, 18));
        btnExit.setBackground(new Color(255, 255, 240));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(ChooseService))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(51)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnExit)
                                                        .addComponent(WelcomeToRestaurant)))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(205)
                                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnStaffLoginIn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnCustomerLoginIn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnStaffRegister, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnCustomerRegister, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(101, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(42)
                                .addComponent(WelcomeToRestaurant)
                                .addGap(18)
                                .addComponent(ChooseService)
                                .addGap(18)
                                .addComponent(btnStaffLoginIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26)
                                .addComponent(btnCustomerLoginIn)
                                .addGap(27)
                                .addComponent(btnStaffRegister)
                                .addGap(29)
                                .addComponent(btnCustomerRegister)
                                .addGap(32)
                                .addComponent(btnExit)
                                .addGap(35))
        );
        contentPane.setLayout(gl_contentPane);
    }

    private void btnCustomerRegisterActionPerformed(ActionEvent actionEvent) {
    }

    private void btnStaffRegisterActionPerformed(ActionEvent actionEvent) {
    }

    private void btnCustomerLoginInActionPerformed(ActionEvent evt) {
    }

    private void btnStaffLoginInActionPerformed(ActionEvent evt) {
    }

    private void btnExitActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

}
