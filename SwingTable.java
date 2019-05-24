import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingTable {
    private JPanel mainFrame;
    private JTextField inputField;
    private JTextField outputField;
    private JButton test;
    private JTextField Resultat;

    public SwingTable() {
        test.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String wordTest = inputField.getText();
                outputField.setText(Reverse(wordTest));
                if (outputField.getText().equals(inputField.getText())) {
                    Resultat.setText("This word is a palindrome, neat!");
                } else {
                    Resultat.setText("This is just a normal word.");
                }
            }
        });
    }
    public static String Reverse(String aRaw) {
        String A = aRaw.replaceAll("[\\W]", "");
        String B = "";
        int lengthA = A.length();
        for (int i = lengthA - 1; i >= 0; i--) {
            B = B + A.charAt(i);
        }
        return B;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Palindromes");
        frame.setContentPane(new SwingTable().mainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 300);
        frame.pack();
        frame.setVisible(true);
    }
}
