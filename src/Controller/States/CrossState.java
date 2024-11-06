package Controller.States;

import Controller.MakeMove.MakeMove;
import Controller.MakeMove.PlayerMove;
import Controller.TicTacToeController;

public class CrossState implements PlayerState {
    public void putSign(TicTacToeController controller){
        MakeMove move = new PlayerMove(controller);
        move.makeMove();
    }
}
