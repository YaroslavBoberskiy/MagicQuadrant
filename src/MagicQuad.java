import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by YB on 08.01.2016.
 */
public class MagicQuad extends JFrame implements ActionListener {

    private JPanel quadrantPanel;
    private JPanel buttonPanel;
    private JButton button;

    MagicQuad () {
        super("Magic quadrant");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(500, 100);
        setResizable(false);
        this.setLayout(new BorderLayout());
        quadrantPanel = new JPanel();
        quadrantPanel.setBackground(new Color(255, 255, 0));
        buttonPanel = new JPanel();
        button = new JButton("New Color");
        button.addActionListener(this);
        buttonPanel.add(button);
        this.add(quadrantPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random randomGenerator = new Random();
        Color color = new Color(randomGenerator.nextInt(255), randomGenerator.nextInt(255), randomGenerator.nextInt(255));
        quadrantPanel.setBackground(color);
    }
}
