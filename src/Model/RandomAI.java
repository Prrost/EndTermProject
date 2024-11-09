package Model;

import View.TicTacToeView;

import javax.swing.*;

public class RandomAI {

    private TicTacToeView view;
    private GameModelAdapter modelAdapter;  // Адаптер для модели

    public RandomAI(TicTacToeView view) {
        this.view = view;
        this.modelAdapter = new GameModelAdapter(this.view);  // Создаем адаптер с использованием View
    }

    // Фасад: главный метод игры, который обрабатывает ход ИИ
    public void mainLoop(JButton[][] board) {
        int[] arr = randomNums();

        while (true) {
            if (modelAdapter.isTakenTile(board, arr)) {
                System.out.println("Клетка занята, генерируем новые координаты");
                arr = randomNums();
                continue;
            } else if (modelAdapter.isGameEnded()) {
                break;  // Завершаем цикл, если игра закончена
            } else {
                modelAdapter.setSign(board, arr);
                break;  // Завершаем цикл после хода
            }
        }
    }

    private int[] randomNums() {
        int[] arr = new int[2];
        int minValue = 0;
        int maxValue = 2;
        arr[0] = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        arr[1] = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return arr;
    }

    // Адаптер: проверяем, занята ли клетка
    private class GameModelAdapter {
        private TicTacToeView view;

        public GameModelAdapter(TicTacToeView view) {
            this.view = view;
        }

        // Проверка, занята ли клетка
        public boolean isTakenTile(JButton[][] board, int[] arr) {
            return board[arr[0]][arr[1]].getText().equals("X") || board[arr[0]][arr[1]].getText().equals("O");
        }

        // Проверка, завершена ли игра
        public boolean isGameEnded() {
            return view.textLabel.getText().equals("X is the winner!") || view.textLabel.getText().equals("O is the winner!");
        }

        public void setSign(JButton[][] board, int[] arr) {
            board[arr[0]][arr[1]].setText(view.playerO);
        }
    }
}
