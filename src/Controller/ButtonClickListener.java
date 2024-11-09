package Controller;


import View.TicTacToeView;
import Model.RandomAI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    private TicTacToeController controller;
    private TicTacToeView view;
    private JButton button;
    private JButton[][] board;
    private RandomAI ai;



    public ButtonClickListener(TicTacToeController controller, TicTacToeView view, JButton button, JButton[][] board) {
        this.controller = controller;
        this.view = view;
        this.button = button;
        this.board = board;
        this.ai = new RandomAI(view);
    }

    public void actionPerformed(ActionEvent e) {

        if (button.getText().equals("X") || button.getText().equals("O") || view.textLabel.getText().equals("X is the winner!")
                || view.textLabel.getText().equals("O is the winner!")) {
            System.out.println("Заглушка");
        } else {
            button.setText(view.CurrentPlayer);
            controller.putSign();
            if (view.textLabel.getText().equals("X is the winner!")){
                System.out.println("X is the winner!");
            } else {
                view.counter++;
                if (view.counter != 9) {
                    ai.mainLoop(board);
                    controller.putSign();
                    view.counter++;
                } else {
                    view.textLabel.setText("Tie!");
                }
            }
        }
    }

}