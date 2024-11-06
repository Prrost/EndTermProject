//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToeView {
    int boardWight = 600;
    int BoardHeight = 650;
    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JButton[][] board = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String CurrentPlayer;

    public TicTacToeView() {
        this.CurrentPlayer = this.playerX;
        this.frame.setVisible(true);
        this.frame.setSize(this.boardWight, this.BoardHeight);
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
    }

    public void PlayerMove() {
        for(int r = 0; r < 3; ++r) {
            for(int c = 0; c < 3; ++c) {
                JButton tile = new JButton();
                this.board[r][c] = tile;
                this.boardPanel.add(tile);
                tile.setBackground(Color.GRAY);
                tile.setForeground(Color.white);
                tile.setFont(new Font("Arial", 1, 120));
                tile.setFocusable(false);
                tile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton tile = (JButton)e.getSource();
                        tile.setText(TicTacToeView.this.CurrentPlayer);
                    }
                });
            }
        }

    }
}
