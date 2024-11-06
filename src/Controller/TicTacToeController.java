package Controller;

import Controller.States.CircleState;
import Controller.States.CrossState;
import Controller.States.PlayerState;

public class TicTacToeController {
    private PlayerState state;

    public TicTacToeController() {
        this.state = new CrossState();
    }

    public void setState(PlayerState state){
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }

    public void putSign(){
        state.putSign(this);
    }

}