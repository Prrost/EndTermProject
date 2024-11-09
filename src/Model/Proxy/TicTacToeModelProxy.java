// Proxy: TicTacToeModelProxy.java
package Model;

import View.TicTacToeView;

public class TicTacToeModelProxy {
    private final TicTacToeModel ticTacToeModel;
    private String cachedWinner = null;

    public TicTacToeModelProxy() {
        this.ticTacToeModel = new TicTacToeModel();
    }

    public String checkWinX(TicTacToeView view) {
        if (cachedWinner != null) {
            return cachedWinner;
        }
        ticTacToeModel.checkWinX(view);
        if (view.textLabel.getText().equals("X is the winner!")) {
            cachedWinner = "X is the winner!";
        }
        return cachedWinner;
    }

    public String checkWinO(TicTacToeView view) {
        if (cachedWinner != null) {
            return cachedWinner;
        }
        ticTacToeModel.checkWinO(view);
        if (view.textLabel.getText().equals("O is the winner!")) {
            cachedWinner = "O is the winner!";
        }
        return cachedWinner;
    }

    public void resetCache() {
        cachedWinner = null;
    }
}
