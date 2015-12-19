package Project2;


import java.awt.Color;
import javax.swing.*;

public class PanScore extends JPanel // scoreboard
{

    private static JLabel lblScore;
    int nScore;
    String sScore;

    public PanScore() {
        lblScore = new JLabel("0");
        add(lblScore);
        this.setBackground(Color.white); //Score panel colour
    }

    public void UpdateScoreLabel(int _nScore) {
        nScore = _nScore;
        sScore = Integer.toString(nScore);
        lblScore.setText(sScore);
    }
}