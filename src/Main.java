
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import View.TicTacToeView;
import javax.swing.UIManager;
import java.util.Scanner;
import Model.Facade.TicTacToeFacade;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        TicTacToeView ticTacToe = new TicTacToeView();
        ticTacToe.PlayerMove();

        TicTacToeFacade game = new TicTacToeFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру Крестики-Нолики!");
        gameLoop(game, scanner);
    }

    private static void gameLoop(TicTacToeFacade game, Scanner scanner) {
        boolean gameEnded = false;

        while (!gameEnded) {
            game.printBoard(); // Печать состояния поля

            // Ход игрока
            System.out.println("Ваш ход (введите строку и столбец через пробел): ");
            int playerRow = scanner.nextInt();
            int playerCol = scanner.nextInt();

            String result = game.makeMove(playerRow, playerCol);
            if (result != null) {
                System.out.println(result); // Результат хода
                gameEnded = true; // Игра завершена
            }
        }

        scanner.close();
    }
}
