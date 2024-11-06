package Model.Facade;

import Model.TicTacToeModel;

public class TicTacToeFacade {
    private TicTacToeModel model;

    public TicTacToeFacade() {
        model = new TicTacToeModel();
    }

    // Метод для выполнения хода
    public String makeMove(int row, int col) {
        // Если ход игрока был успешным
        if (model.makePlayerMove(row, col)) {
            if (model.checkWin("X")) {
                return "Вы победили!";
            }
            if (model.isDraw()) {
                return "Ничья!";
            }

            // Ход компьютера
            model.makeComputerMove();
            if (model.checkWin("O")) {
                return "Компьютер победил!";
            }
            if (model.isDraw()) {
                return "Ничья!";
            }
        } else {
            return "Эта клетка уже занята! Попробуйте снова.";
        }
        return null; // Игра продолжается
    }

    // Метод для получения состояния клетки
    public String getCellState(int row, int col) {
        return model.getCellState(row, col);
    }

    // Метод для печати поля
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(getCellState(i, j) + " ");
            }
            System.out.println();
        }
    }
}
