//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import View.TicTacToeView;
import javax.swing.UIManager;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        TicTacToeView ticTacToe = new TicTacToeView();
        ticTacToe.PlayerMove();
    }
}
