package TicTacToe;

import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author willw6493
 */
class FraMain extends JFrame {

    PanComp pancomp = new PanComp();

    public FraMain() {
        setTitle("Tic Tac Toe");
        setSize(500, 500);
        PanComp pancomp = new PanComp();
        add(pancomp);
    }   //System.out.println(sWord);
}
