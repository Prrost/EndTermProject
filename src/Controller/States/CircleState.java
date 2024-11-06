package Controller.States;

import Controller.MakeMove.*;
import Controller.TicTacToeController;

public class CircleState implements PlayerState {
    public void putSign(TicTacToeController controller){
        MakeMove move = new AIMove(controller);
        move.makeMove();
    }
}
