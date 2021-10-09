import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Renk {
    JFrame frame;
    public Renk() {
        frame = new JFrame("RENK");
        frame.setBounds(300,300,300,200);
        frame.setLayout(new FlowLayout());
        BilesenleriEkle(frame.getContentPane());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void BilesenleriEkle(Container contentPane) {
        JPanel solPanel = new JPanel();
        JPanel sagPanel = new JPanel();
        JButton red = new JButton("RED");
        JButton green = new JButton("GREEN");
        JButton blue = new JButton("BLUE");
        JTextArea area = new JTextArea(5, 10);
        area.setBackground(Color.BLACK);
        area.setEditable(false);
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                area.setBackground(Color.RED);
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                area.setBackground(Color.GREEN);
            }
        });

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                area.setBackground(Color.BLUE);
            }
        });
        solPanel.add(red);
        solPanel.add(green);
        solPanel.add(blue);
        sagPanel.add(area);
        frame.add(solPanel);
        frame.add(sagPanel);

    }
    public static void main(String[] args) {
        new Renk();
    }
}