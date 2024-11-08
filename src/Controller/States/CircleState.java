package Controller.States;

import Controller.MakeMove.*;
import Controller.TicTacToeController;
import Model.TicTacToeModel;
import View.TicTacToeView;

public class CircleState implements PlayerState {
    public void putSign(TicTacToeController controller, TicTacToeView view){
        MakeMove move = new AIMove(controller, new TicTacToeModel());
        move.makeMove(view);
    }
}
