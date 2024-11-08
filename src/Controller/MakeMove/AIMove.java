package Controller.MakeMove;

import Controller.States.CrossState;
import Controller.TicTacToeController;
import Model.TicTacToeModel;
import View.TicTacToeView;

import javax.swing.*;

public class AIMove extends MakeMove{
    public AIMove(TicTacToeController controller, TicTacToeModel model) {
        super(controller, model);
    }

    @Override
    public void checkWin(TicTacToeView view) {
        model.checkWinO(view);
    }

    @Override
    public void changeState() {
        controller.setState(new CrossState());
    }


}
