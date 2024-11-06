package Model;

import Model.Flyweight.Cell;
import Model.Flyweight.CellFactory;
import Model.Flyweight.CellFlyweight;

import java.util.Random;

public class TicTacToeModel {
    private Cell[][] board;
    private CellFactory cellFactory;
    private Random random;

    public TicTacToeModel() {
        board = new Cell[3][3];
        cellFactory = new CellFactory();
        random = new Random();
    }

    // Ход игрока
    public boolean makePlayerMove(int row, int col) {
        if (board[row][col] == null) {
            // Получаем объект CellFlyweight для крестика (X)
            CellFlyweight flyweight = cellFactory.getCellFlyweight("X");
            // Создаём клетку с использованием полученного CellFlyweight
            board[row][col] = new Cell(flyweight);
            return true; // Ход игрока успешно сделан
        }
        return false; // Если клетка занята, ход невозможен
    }

    // Ход компьютера
    public void makeComputerMove() {
        while (true) {
            // Выбираем случайную пустую клетку
            int row = random.nextInt(3);
            int col = random.nextInt(3);

            if (board[row][col] == null) {
                // Получаем объект CellFlyweight для нолика (O)
                CellFlyweight flyweight = cellFactory.getCellFlyweight("O");
                // Создаём клетку с использованием полученного CellFlyweight
                board[row][col] = new Cell(flyweight);
                break; // Ход компьютера сделан, выходим из цикла
            }
        }
    }

    // Проверка победы
    public boolean checkWin(String state) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != null && board[i][0].getState().equals(state) &&
                    board[i][1] != null && board[i][1].getState().equals(state) &&
                    board[i][2] != null && board[i][2].getState().equals(state)) {
                return true; // Победа по горизонтали
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != null && board[0][i].getState().equals(state) &&
                    board[1][i] != null && board[1][i].getState().equals(state) &&
                    board[2][i] != null && board[2][i].getState().equals(state)) {
                return true; // Победа по вертикали
            }
        }
        if (board[0][0] != null && board[0][0].getState().equals(state) &&
                board[1][1] != null && board[1][1].getState().equals(state) &&
                board[2][2] != null && board[2][2].getState().equals(state)) {
            return true; // Победа по диагонали (левая верхняя - правая нижняя)
        }
        if (board[0][2] != null && board[0][2].getState().equals(state) &&
                board[1][1] != null && board[1][1].getState().equals(state) &&
                board[2][0] != null && board[2][0].getState().equals(state)) {
            return true; // Победа по диагонали (правая верхняя - левая нижняя)
        }
        return false; // Победы нет
    }

    // Проверка на ничью
    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    return false;  // Если есть пустые клетки, ничья невозможна
                }
            }
        }
        return true;  // Если все клетки заняты, то ничья
    }

    // Получение состояния клетки
    public String getCellState(int row, int col) {
        return board[row][col] != null ? board[row][col].getState() : "Empty";
    }
}
