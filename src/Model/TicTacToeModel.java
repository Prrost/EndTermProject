package Model;

import View.TicTacToeView;


public class TicTacToeModel {


    // Проверка победы
    public void checkWinO(TicTacToeView view) {
        for (int i = 0; i < 3; i++) {
            if (view.board[i][0] != null && view.board[i][0].getText().equals("O") &&
                    view.board[i][1] != null && view.board[i][1].getText().equals("O") &&
                    view.board[i][2] != null && view.board[i][2].getText().equals("O")) {
                view.textLabel.setText(o());
            }
        }
        for (int i = 0; i < 3; i++) {
            if (view.board[0][i] != null && view.board[0][i].getText().equals("O") &&
                    view.board[1][i] != null && view.board[1][i].getText().equals("O") &&
                    view.board[2][i] != null && view.board[2][i].getText().equals("O")) {
                view.textLabel.setText(o());
            }
        }
        if (view.board[0][0] != null && view.board[0][0].getText().equals("O") &&
                view.board[1][1] != null && view.board[1][1].getText().equals("O") &&
                view.board[2][2] != null && view.board[2][2].getText().equals("O")) {
            view.textLabel.setText(o());
        }
        if (view.board[0][2] != null && view.board[0][2].getText().equals("O") &&
                view.board[1][1] != null && view.board[1][1].getText().equals("O") &&
                view.board[2][0] != null && view.board[2][0].getText().equals("O")) {
            view.textLabel.setText(o());
        }
    }

    public void checkWinX(TicTacToeView view) {
        for (int i = 0; i < 3; i++) {
            if (view.board[i][0] != null && view.board[i][0].getText().equals("X") &&
                    view.board[i][1] != null && view.board[i][1].getText().equals("X") &&
                    view.board[i][2] != null && view.board[i][2].getText().equals("X")) {
                view.textLabel.setText(x());
            }
        }
        for (int i = 0; i < 3; i++) {
            if (view.board[0][i] != null && view.board[0][i].getText().equals("X") &&
                    view.board[1][i] != null && view.board[1][i].getText().equals("X") &&
                    view.board[2][i] != null && view.board[2][i].getText().equals("X")) {
                view.textLabel.setText(x());
            }
        }
        if (view.board[0][0] != null && view.board[0][0].getText().equals("X") &&
                view.board[1][1] != null && view.board[1][1].getText().equals("X") &&
                view.board[2][2] != null && view.board[2][2].getText().equals("X")) {
            view.textLabel.setText(x());
        }
        if (view.board[0][2] != null && view.board[0][2].getText().equals("X") &&
                view.board[1][1] != null && view.board[1][1].getText().equals("X") &&
                view.board[2][0] != null && view.board[2][0].getText().equals("X")) {
            view.textLabel.setText(x());
        }
    }

    public String x(){
        return "X is the winner!";
    }

    public String o(){
        return "O is the winner!";
    }

}


