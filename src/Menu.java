import eu.cr4zyfl1x.logger.LogType;
import eu.cr4zyfl1x.logger.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel root;
    private JPanel panel1;
    private JPanel panel2;
    private JButton buttonpanel1;
    private JButton buttonpanel2;

    public Menu() {
        super();
        setVisible(true);
        setSize(500, 500);
        add(root);

        buttonpanel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel2.setVisible(true);
                Logger.log(LogType.SYSTEM, "Button 1 clicked");
            }

        });
        buttonpanel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(false);
                Logger.log(LogType.SYSTEM, "Button 2 clicked");
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        root = new JPanel();
        root.setLayout(new CardLayout(0, 0));
        panel1 = new JPanel();
        panel1.setLayout(new CardLayout(0, 0));
        root.add(panel1, "Card1");
        buttonpanel1 = new JButton();
        buttonpanel1.setText("Panel1Button");
        panel1.add(buttonpanel1, "Card1");
        panel2 = new JPanel();
        panel2.setLayout(new CardLayout(0, 0));
        root.add(panel2, "Card2");
        buttonpanel2 = new JButton();
        buttonpanel2.setText("Panel2Button");
        panel2.add(buttonpanel2, "Card1");
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return root;
    }
}
