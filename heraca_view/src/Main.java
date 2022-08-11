import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JTextField textField1;
    private JButton okButton;
    private JPanel jPanel;

    private void showView(){
        this.setTitle("Main");
        this.setContentPane(new Main().jPanel);
        this.okButton.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main().showView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("foi");
        JDialog jd1 = new JDialog(this, "Atenção", true);
        jd1.setBounds(new Rectangle(200, 100));
        jd1.add(new JLabel("Olá Mundo"));
        jd1.setLocationRelativeTo(this);
        jd1.show();
    }
}
