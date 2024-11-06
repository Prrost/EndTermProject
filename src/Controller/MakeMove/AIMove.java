package Controller.MakeMove;

import Controller.States.CrossState;
import Controller.TicTacToeController;

public class AIMove extends MakeMove{
    public AIMove(TicTacToeController controller) {
        super(controller);
    }

    @Override
    public void changeState() {
        controller.setState(new CrossState());
    }


}
