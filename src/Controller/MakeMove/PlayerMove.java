package Controller.MakeMove;

import Controller.States.CircleState;
import Controller.TicTacToeController;

public class PlayerMove extends MakeMove{

    public PlayerMove(TicTacToeController controller) {
        super(controller);
    }

    @Override
    public void changeState() {
        controller.setState(new CircleState());
    }
}
