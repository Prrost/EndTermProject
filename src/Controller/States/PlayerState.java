package Controller.States;

import Controller.TicTacToeController;
import View.TicTacToeView;

public interface PlayerState {
    void putSign(TicTacToeController controller, TicTacToeView view);

}
