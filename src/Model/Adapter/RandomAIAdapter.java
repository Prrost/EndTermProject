package Model.Adapter;


import Model.Proxy.RandomAIProxy;
import Model.RandomAI;
import View.TicTacToeView;
import javax.swing.*;

public class RandomAIAdapter {
    private RandomAIProxy aiProxy;

    public RandomAIAdapter() {
        this.aiProxy = new RandomAIProxy(new RandomAI());  // Прокси подключен к ИИ
    }

    public void makeMove(JButton[][] board, TicTacToeView view) {
        aiProxy.makeMove(board, view);  // Используем прокси для выполнения хода ИИ
    }
}
