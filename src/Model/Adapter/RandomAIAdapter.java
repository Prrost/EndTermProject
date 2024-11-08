package Model.Adapter;

import Model.RandomAI;
import View.TicTacToeView;

public class RandomAIAdapter {
    private RandomAI randomAI;

    // Конструктор
    public RandomAIAdapter() {
        this.randomAI = new RandomAI(); // создаем объект RandomAI
    }

    // Метод адаптера
    public void makeMove(TicTacToeView view) {
        randomAI.randomAI(view.board, view); // вызываем метод randomAI из RandomAI
    }
}