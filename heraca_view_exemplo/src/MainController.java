import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController extends JFrame implements Runnable, ActionListener{

    public void run() {
        // Invoked on the event dispatching thread.
        // Construct and show GUI.
        JPanel jp1 = new JPanel();
        jp1.setBackground(new Color(255, 255, 0));
        jp1.add(new JLabel("Nome:"));
        JTextField tf1 = new JTextField("Digite o nome");
        tf1.setBounds(new Rectangle(400,20));
        jp1.add(tf1);
        JButton jb1 = new JButton("Ok");
        jp1.add(jb1);
        jb1.addActionListener(this);
        this.add(jp1);
        this.setBounds(new Rectangle(600, 400));
        this.show();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MainController());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog jd1 = new JDialog(this, "Atenção", true);
        jd1.setBounds(new Rectangle(200, 100));
        jd1.add(new JLabel("Olá Mundo"));
        jd1.setLocationRelativeTo(this);
        jd1.show();
    }
}
