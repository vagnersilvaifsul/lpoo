import javax.swing.*;

public class Qualquer {
    private JTextField textField1;
    private JButton button1;
    private JPanel jpanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Qualquer");
        frame.setContentPane(new Qualquer().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
