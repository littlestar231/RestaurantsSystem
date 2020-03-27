package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;

public class Order extends JFrame {

    private JPanel contentPane;
    private JPanel contentPane2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Order frame = new Order();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Order() {

        setTitle("Welcome xxx!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 549, 398);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        //主页面
        JPanel panel_N = new JPanel();
        panel_N.setBorder(new LineBorder(new Color(0, 0, 0)));
        contentPane.add(panel_N, BorderLayout.NORTH);
        panel_N.setLayout(new BorderLayout(0, 0));
        //上部的pane
        JButton btnBack = new JButton("Back");
        btnBack.setHorizontalAlignment(SwingConstants.LEFT);
        panel_N.add(btnBack, BorderLayout.WEST);
        //返回键
        JLabel lblStamp = new JLabel("stamps:");
        lblStamp.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_N.add(lblStamp, BorderLayout.CENTER);

        JLabel lblStampNum = new JLabel("0");
        panel_N.add(lblStampNum, BorderLayout.EAST);
        //用户的虚拟邮票信息
        JPanel panel_S = new JPanel();
        contentPane.add(panel_S, BorderLayout.SOUTH);
        panel_S.setLayout(new BorderLayout(0, 0));
        //下部的pane
        JLabel lblTotal = new JLabel("Total");
        lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
        panel_S.add(lblTotal, BorderLayout.WEST);
        //消费的总价格信息
        JButton btnCheck = new JButton("Check");
        panel_S.add(btnCheck, BorderLayout.EAST);

        JLabel lbl_Total_Price = new JLabel("0");
        lbl_Total_Price.setHorizontalAlignment(SwingConstants.CENTER);
        panel_S.add(lbl_Total_Price, BorderLayout.CENTER);
        //查看已点的菜的信息
        JPanel panel_C = new JPanel();
        contentPane.add(panel_C, BorderLayout.CENTER);
        panel_C.setLayout(new GridLayout(2, 1, 0, 0));
        //中部的pane
        JPanel panel_NW = new JPanel();
        panel_NW.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_C.add(panel_NW);
        panel_NW.setLayout(new BorderLayout(0, 0));
        //single dish表所在的pane
        JLabel lblSingle = new JLabel("Single Dish");
        lblSingle.setHorizontalAlignment(SwingConstants.CENTER);
        panel_NW.add(lblSingle, BorderLayout.NORTH);
        //写着single dish的label
        JPanel panel_dish = new JPanel();
        panel_NW.add(panel_dish, BorderLayout.CENTER);
        panel_dish.setLayout(new GridLayout(3, 1, 0, 5));
        //装有具体single dish菜单的pane
        JPanel panel_food1 = new JPanel();
        panel_food1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_dish.add(panel_food1);
        panel_food1.setLayout(new BorderLayout(0, 0));
        //装有food1的pane
        JPanel panel_dish1price = new JPanel();
        panel_food1.add(panel_dish1price, BorderLayout.CENTER);
        //装有food1价格的pane
        JLabel lbl_food1 = new JLabel("food1 price:");
        panel_dish1price.add(lbl_food1);

        JLabel lbl_D1_Price = new JLabel("0");
        panel_dish1price.add(lbl_D1_Price);
        //food1的价格
        JPanel panel_dish1NUm = new JPanel();
        panel_food1.add(panel_dish1NUm, BorderLayout.EAST);
        //food1点菜区域的pane
        JButton btnAddD1 = new JButton("Add");
        panel_dish1NUm.add(btnAddD1);

        JLabel lbl_D1_Num = new JLabel("0");
        lbl_D1_Num.setBorder(BorderFactory.createLineBorder(Color.black));
        panel_dish1NUm.add(lbl_D1_Num);
        //food1的数量
        JButton btnReduceD1 = new JButton("Reduce");
        panel_dish1NUm.add(btnReduceD1);
        //减少food1的按钮
        JPanel panel_adds_on = new JPanel();
        panel_adds_on.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_C.add(panel_adds_on);
        panel_adds_on.setLayout(new BorderLayout(0, 0));
        //装有adds_on的pane
        JLabel lblAdds_on = new JLabel("Adds-on");
        lblAdds_on.setHorizontalAlignment(SwingConstants.CENTER);
        panel_adds_on.add(lblAdds_on, BorderLayout.NORTH);
        //标签
        JPanel panel_adds = new JPanel();
        panel_adds_on.add(panel_adds, BorderLayout.CENTER);
        panel_adds.setLayout(new GridLayout(3, 1, 0, 5));
        //具体adds_on的菜单
        JPanel panel_Adds1 = new JPanel();
        panel_Adds1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_adds.add(panel_Adds1);
        panel_Adds1.setLayout(new BorderLayout(0, 0));
        //第一个adds on的pane
        JPanel panel_adds1price = new JPanel();
        panel_Adds1.add(panel_adds1price, BorderLayout.CENTER);
        //price标签的pane
        JLabel lblAddsPrice = new JLabel("Adds1 price:");
        panel_adds1price.add(lblAddsPrice);

        JLabel lbl_A1_Price = new JLabel("0");
        panel_adds1price.add(lbl_A1_Price);
        //price
        JPanel panel_adds1Num = new JPanel();
        panel_Adds1.add(panel_adds1Num, BorderLayout.EAST);
        //点菜的pane
        JButton btnAddA1 = new JButton("Add");
        panel_adds1Num.add(btnAddA1);

        JLabel lbl_A1_Num = new JLabel("0");
        lbl_A1_Num.setBorder(BorderFactory.createLineBorder(Color.black));
        panel_adds1Num.add(lbl_A1_Num);
        //数量
        JButton btnReduceA1 = new JButton("Reduce");
        panel_adds1Num.add(btnReduceA1);
        //减少
    }

}
