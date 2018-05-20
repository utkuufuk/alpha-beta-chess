package com.example.chess.app.listener;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Label;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;
import com.example.chess.core.model.piece.Piece;

public class ChessMoveListener implements MouseListener
{
    private final Label label;
    private static Piece selectedPiece;
    private static boolean doubleClicked;

    public ChessMoveListener(Label label)
    {
        this.label = label;
    }

    @Override
    public void mouseDoubleClick(MouseEvent e)
    {
        Piece piece = ((Square) (label.getData())).getPiece();

        if (piece != null && piece.getSide() == Side.WHITE)
        {
            for (Square square : piece.computeLegalMoves())
            {
                square.setLegal(true);
            }
            selectedPiece = piece;
            doubleClicked = true;
        }
    }

    @Override
    public void mouseDown(MouseEvent e)
    {
        
    }

    @Override
    public void mouseUp(MouseEvent e)
    {
        
    }
}
