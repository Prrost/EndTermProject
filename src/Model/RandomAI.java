package Model;


import View.TicTacToeView;

import javax.swing.*;
import java.sql.SQLOutput;

public class RandomAI {
    public void randomAI(JButton[][] board, TicTacToeView view) {
        int minValue = 0;
        int maxValue = 2;
        int num1 = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        int num2 = minValue + (int) (Math.random() * (maxValue - minValue + 1));

        while (true) {
            if (board[num1][num2].getText().equals("X") || (board[num1][num2].getText().equals("O"))) {
                System.out.println("заглушка для ИИ");
                num1 = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                num2 = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                continue;
            }
            else if(view.textLabel.getText().equals("X is the winner!") || view.textLabel.getText().equals("O is the winner!")){
                break;
            }
            else {
                board[num1][num2].setText(view.playerO);
                break;
            }
        }
    }

}
