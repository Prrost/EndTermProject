
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Controller.TicTacToeController;
import View.TicTacToeView;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        TicTacToeController controller = new TicTacToeController();
        TicTacToeView view = new TicTacToeView(controller);

        controller.setView(view);

        view.PlayerMove();

    }
}
