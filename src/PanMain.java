
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willw6493
 */
class PanMain extends JPanel implements ActionListener {

    JLabel lblName = new JLabel();
    JLabel lblOut = new JLabel();
    JTextField txtNameOUT = new JTextField();
    JButton btnUpdate = new JButton();
    JTextField txtName = new JTextField();
    Scanner sin = new Scanner(System.in);
    String sName;

    public PanMain() {
        lblName.setText("Enter Your Name:");
        lblName.setForeground(Color.YELLOW);
        add(lblName);
        txtName.setPreferredSize(new Dimension(100, 20));
        add(txtName);
        btnUpdate.setPreferredSize(new Dimension(100, 20));
        btnUpdate.setText("Click Pls");
        add(btnUpdate);
        btnUpdate.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        sName = txtName.getText();
        lblOut.setText("Hey, " + sName + "!");
        add(lblOut);
        System.out.println("OUTPUT(S)");
        System.out.println("---------------------");
        System.out.println("Hey, " + sName + "!");

    }
}