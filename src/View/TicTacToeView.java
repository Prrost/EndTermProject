package View;

import Controller.ButtonClickListener;
import Controller.States.CrossState;
import Controller.TicTacToeController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToeView {
    int boardWidth = 600;
    int boardHeight = 650;
    JFrame frame = new JFrame("Tic-Tac-Toe");
    public JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JPanel controlPanel = new JPanel();
    public JButton[][] board = new JButton[3][3];
    public String playerX = "X";
    public String playerO = "O";
    public String CurrentPlayer;
    private TicTacToeController controller;
    public int counter = 0;



    private static TicTacToeView instance;


    private TicTacToeView(TicTacToeController controller) {
        this.controller = controller;
        this.frame.setVisible(true);
        this.CurrentPlayer = playerX;
        this.frame.setSize(this.boardWidth, this.boardHeight);
        this.frame.setLocationRelativeTo((Component)null);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setLayout(new BorderLayout());

        this.textLabel.setBackground(Color.DARK_GRAY);
        this.textLabel.setForeground(Color.white);
        this.textLabel.setFont(new Font("Arial", 1, 50));
        this.textLabel.setHorizontalAlignment(0);
        this.textLabel.setText("Tic-Tac-Toe");
        this.textLabel.setOpaque(true);

        this.textPanel.setLayout(new BorderLayout());
        this.textPanel.add(this.textLabel);
        this.frame.add(this.textPanel, "North");

        this.boardPanel.setLayout(new GridLayout(3, 3));
        this.boardPanel.setBackground(Color.GRAY);
        this.frame.add(this.boardPanel);

        JButton resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", 1, 30));
        resetButton.setFocusable(false);
        resetButton.setBackground(Color.DARK_GRAY);
        resetButton.setForeground(Color.WHITE);
        resetButton.addActionListener(e -> resetGame());

        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(resetButton, BorderLayout.CENTER);
        this.frame.add(controlPanel, BorderLayout.SOUTH);
    }

    public static TicTacToeView getInstance(TicTacToeController controller) {
        if (instance == null) {
            instance = new TicTacToeView(controller);
        }
        return instance;
    }

    public void PlayerMove() {
        for (int r = 0; r < 3; ++r) {
            for (int c = 0; c < 3; ++c) {
                // Создаем кнопку с использованием фабричного метода
                JButton tile = createButton();
                this.board[r][c] = tile;
                this.boardPanel.add(tile);
            }
        }
    }

    private JButton createButton() {
        JButton button = new JButton();
        button.setBackground(Color.GRAY);
        button.setForeground(Color.white);
        button.setFont(new Font("Arial", 1, 120));
        button.setFocusable(false);
        button.addActionListener(new ButtonClickListener(controller, this, button, this.board));
        return button;
    }

    private void resetGame() {
        counter = 0;
        CurrentPlayer = playerX;

        for (int r = 0; r < 3; ++r) {
            for (int c = 0; c < 3; ++c) {
                board[r][c].setText("");
            }
        }

        controller.setState(new CrossState());

        textLabel.setText("Tic-Tac-Toe");
        System.out.println("Reset");
    }
}