import Model.Facade.TicTacToeFacade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
