import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Simple 4-button calculator: 1 + 2 = 3
public class CalculatorSimple extends JFrame implements ActionListener {

    private final JTextField display;   // shows the expression / result
    private String expr = "";           // holds the current expression (like "1+2")

    public CalculatorSimple() {
        setTitle("Simple Calc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 180);
        setLocationRelativeTo(null); // centre on screen

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("SansSerif", Font.BOLD, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        // panel for buttons  (2 rows x 2 columns)
        JPanel panel = new JPanel(new GridLayout(2, 2, 8, 8));
        String[] labels = {"1", "+", "2", "="};
        for (String s : labels) {
            JButton b = new JButton(s);
            b.setFont(new Font("SansSerif", Font.BOLD, 22));
            b.addActionListener(this);   // this class will handle clicks
            panel.add(b);
        }

        setLayout(new BorderLayout(8, 8));
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    // ActionListener method -> called when any button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand(); // the button text ("1", "+", "2", "=")

        if (cmd.equals("=")) {
            // evaluate only the exact expression "1+2" (simple evaluator)
            if (expr.equals("1+2")) {
                display.setText("3");
            } else {
                display.setText("Err");
            }
            expr = ""; // reset after showing result
        } else {
            // append button label to expression and update display
            expr += cmd;
            display.setText(expr);
        }
    }

    public static void main(String[] args) {
        // Launch GUI on Event Dispatch Thread (standard Swing practice)
        SwingUtilities.invokeLater(() -> new CalculatorSimple());
    }
}
