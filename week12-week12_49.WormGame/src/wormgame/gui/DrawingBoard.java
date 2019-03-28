package wormgame.gui;

import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel implements Updatable{
    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength){
        this.pieceLength = pieceLength;
        this.wormGame = wormGame;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for(Piece p: wormGame.getWorm().getPieces()){
            g.fill3DRect(p.getX() * pieceLength,p.getY() * pieceLength,pieceLength,pieceLength,true);
        }
        g.setColor(Color.RED);
        Apple apple = wormGame.getApple();
        g.fillOval(apple.getX() * pieceLength, apple.getY() * pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        super.repaint();
    }
}
