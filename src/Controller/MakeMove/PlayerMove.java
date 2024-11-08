package Controller.MakeMove;

import Controller.States.CircleState;
import Controller.TicTacToeController;
import Model.TicTacToeModel;
import View.TicTacToeView;

import javax.swing.*;

public class PlayerMove extends MakeMove{

    public PlayerMove(TicTacToeController controller, TicTacToeModel model) {
        super(controller, model);
    }

    @Override
    public void checkWin(TicTacToeView view) {
        model.checkWinX(view);
    }

    @Override
    public void changeState() {
        controller.setState(new CircleState());
    }
}
