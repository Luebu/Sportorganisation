import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    private JPanel root;
    private JPanel startfolie;
    private JButton startfolie_anmelden;
    private JButton startfolie_registrieren;
    private JPanel anmelden;
    private JTextField anmelden_benutzername;
    private JPasswordField anmelden_passwort;
    private JButton anmelden_zurück;
    private JButton anmelden_abbrechen;
    private JButton anmelden_weiter;
    private JPanel registrieren1;
    private JButton registrieren1_zurueck;
    private JButton registrieren1_abbrechen;
    private JButton registrieren1_weiter;
    private JLabel registrieren_aufforderung;
    private JTextField buchen1_hallennummer;
    private JPanel registrieren2;
    private JPasswordField registrieren_eingabe;
    private JPasswordField registrieren_bestaetigen;
    private JButton registrieren2_zurueck;
    private JButton registrieren2_abbrechen;
    private JButton registrieren2_weiter;
    private JPanel navigation;
    private JLabel navi_menu;
    private JButton navi_zurueck;
    private JButton navi_abmelden;
    private JButton navi_uebersicht;
    private JButton navi_buchen;
    private JLabel navi_rang;
    private JLabel navi_user;
    private JPanel ueberischt;
    private JButton uebersicht_zurueck;
    private JLabel uebersicht_liste;
    private JPanel buchen1;
    private JButton buchen1_zurueck;
    private JButton buchen1_abmelden;
    private JButton buchen1_weiter;
    private JLabel buchen1_liste;
    private JPanel buchen2;
    private JPanel buchen0;
    private JButton buchen0_zurueck;
    private JButton buchen0_abmelden;
    private JButton buchen0_weiter;
    private JCheckBox buchen0_fussball;
    private JCheckBox buchen0_basketball;
    private JCheckBox buchen0_handball;
    private JCheckBox buchen0_tennis;
    private JCheckBox buchen0_tischtennis;
    private JCheckBox buchen0_hockey;
    private JTextField buchen0_datum;
    private JPanel panel2;


    public Menu() {
        super();
        add(root);
        setVisible(true);
        root.setVisible(true);
        setSize(400, 400);
        startfolie.setVisible(true);
        panel2.setVisible(false);

      /*  try {
            PreparedStatement ps = Connector.getConn().prepareStatement("SELECT * FROM halle");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                textField1.setText(textField1.getText() + result.getString(2) + ", ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }*/

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
        startfolie = new JPanel();
        startfolie.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        root.add(startfolie, "Card1");
        registrierenButton = new JButton();
        registrierenButton.setText("Button1");
        startfolie.add(registrierenButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        root.add(panel2, "Card2");
        anmeldenButton = new JButton();
        anmeldenButton.setText("Button2");
        panel2.add(anmeldenButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return root;
    }

}
