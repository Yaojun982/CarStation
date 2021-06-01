package car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanl;
    private JTextField textField1;
    private JButton button1;
    private JPanel northpanel;
    String name;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanl);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}