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
        TicTacToeView view = TicTacToeView.getInstance(controller);

        controller.setView(view);

        view.PlayerMove();

    }
}
