package Controller.MakeMove;

import Controller.TicTacToeController;
import Model.TicTacToeModel;
import View.TicTacToeView;

import javax.swing.*;

public abstract class MakeMove {
    TicTacToeController controller;
    TicTacToeModel model;



    public void makeMove(TicTacToeView view){
        checkWin(view);
        changeState();
    }

    public MakeMove(TicTacToeController controller, TicTacToeModel model) {
        this.controller = controller;
        this.model = model;
    }

    public abstract void checkWin(TicTacToeView view);

    public abstract void changeState();
}
