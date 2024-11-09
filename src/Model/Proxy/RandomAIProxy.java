package Model.Proxy;


import Model.RandomAI;
import View.TicTacToeView;
import javax.swing.*;

public class RandomAIProxy {
    private RandomAI ai;
    private boolean gameFinished = false;

    public RandomAIProxy(RandomAI ai) {
        this.ai = ai;
    }

    public void makeMove(JButton[][] board, TicTacToeView view) {
        // Проверка завершения игры перед тем, как ИИ выполнит ход
        if (view.textLabel.getText().equals("X is the winner!") || view.textLabel.getText().equals("O is the winner!")) {
            gameFinished = true;
        }

        if (!gameFinished) {
            ai.randomAI(board, view);  // Выполняем ход ИИ через оригинальный класс
        }
    }
}
