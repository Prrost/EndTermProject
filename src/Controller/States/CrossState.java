package Controller.States;

import Controller.MakeMove.MakeMove;
import Controller.MakeMove.PlayerMove;
import Controller.TicTacToeController;
import Model.TicTacToeModel;
import View.TicTacToeView;

public class CrossState implements PlayerState {
    public void putSign(TicTacToeController controller, TicTacToeView view){
        MakeMove move = new PlayerMove(controller, new TicTacToeModel());
        move.makeMove(view);
    }
}
