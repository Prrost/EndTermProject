package Controller;

import Controller.States.CircleState;
import Controller.States.CrossState;
import Controller.States.PlayerState;

public class TicTacToeController {
    private PlayerState state;

    public TicTacToeController( PlayerState state) {
        this.state = new CrossState();
    }

    public void setState(PlayerState state){
        this.state = state;
    }

    public void putSign(){
        state.putSign(this);
    }

    public void changePlayerState(){
        if (this.state instanceof CrossState){
            setState(new CircleState());
        }else {
            setState(new CrossState());
        }
    }
}