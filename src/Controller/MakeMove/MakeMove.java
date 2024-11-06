package Controller.MakeMove;

import Controller.TicTacToeController;

public abstract class MakeMove {
    TicTacToeController controller;

    public void makeMove(){
        put();
        checkWin();
        changeState();
    }

    public MakeMove(TicTacToeController controller) {
        this.controller = controller;
    }

    public void checkWin(){
        //TODO реализовать проверку победы
    }

    public abstract void put();

    public void changeState(){
        controller.changePlayerState();
    }
}
