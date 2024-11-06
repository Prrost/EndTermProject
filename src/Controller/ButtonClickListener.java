package Controller;

import Controller.States.CrossState;
import Controller.States.PlayerState;
import View.TicTacToeView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    private TicTacToeController controller;
    private TicTacToeView view;
    private JButton button;
    private JButton[][] board;

    public ButtonClickListener(TicTacToeController controller, TicTacToeView view, JButton button, JButton[][] board) {
        this.controller = controller;
        this.view = view;
        this.button = button;
        this.board = board;
    }

    public void actionPerformed(ActionEvent e) {
//        PlayerState state = controller.getState();
//        if (state instanceof CrossState){
//            view.CurrentPlayer = view.playerX;
//        }else {
//            view.CurrentPlayer = view.playerO;
//        }

        button.setText(view.CurrentPlayer);
        controller.putSign();
        randomAI();
        controller.putSign();
    }

    public void randomAI(){
        int minValue = 0;
        int maxValue = 2;
        int num1 = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int num2 = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        board[num1][num2].setText(view.playerO);
    }
}