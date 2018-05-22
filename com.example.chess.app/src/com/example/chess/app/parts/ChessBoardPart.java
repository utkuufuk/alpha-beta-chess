package com.example.chess.app.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import com.example.chess.app.listener.ChessMoveListener;
import com.example.chess.app.room.ChessRoom;
import com.example.chess.core.icon.IconHandler;
import com.example.chess.core.model.Board;
import com.example.chess.core.model.Square;
import com.example.chess.core.model.piece.Piece;

public class ChessBoardPart
{
    private static final String[] COL_LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private static ChessRoom chessRoom;
    private Label[][] squares;

    public ChessBoardPart()
    {
        chessRoom = new ChessRoom();
        squares = new Label[Board.LENGTH + 1][Board.LENGTH + 1];
    }

    @PostConstruct
    public void createComposite(Composite parent)
    {
        parent.setLayout(new GridLayout(Board.LENGTH + 1, false));
        GridData tagGridData = new GridData(SWT.CENTER, SWT.CENTER, true, false);
        GridData squareGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);

        for (int r = Board.LENGTH - 1; r >= 0; r--)
        {
            squares[r][0] = new Label(parent, SWT.NONE);
            squares[r][0].setLayoutData(tagGridData);
            squares[r][0].setText(String.format("%s", r + 1));

            for (int c = 0; c < Board.LENGTH; c++)
            {
                squares[r][c + 1] = new Label(parent, SWT.BORDER);
                squares[r][c + 1].setLayoutData(squareGridData);
                squares[r][c + 1].setData(chessRoom.getBoard().getSquare(r, c));
                squares[r][c + 1].addMouseListener(new ChessMoveListener(squares[r][c + 1]));
            }
        }
        new Label(parent, SWT.NONE);
        
        for (int c = 0; c < Board.LENGTH; c++)
        {
            squares[Board.LENGTH][c + 1] = new Label(parent, SWT.NONE);
            squares[Board.LENGTH][c + 1].setText(COL_LETTERS[c]);
            squares[Board.LENGTH][c + 1].setLayoutData(tagGridData);
        }
        setFocus();
        PartRefresher.setChessBoardPart(this);
    }

    @Focus
    public void setFocus()
    {
        for (int r = Board.LENGTH - 1; r >= 0; r--)
        {
            for (int c = 0; c < Board.LENGTH; c++)
            {
                if ((r + c) % 2 == 0)
                {
                    squares[r][c + 1].setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
                }
                else
                {
                    squares[r][c + 1].setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
                }

                if (((Square) squares[r][c + 1].getData()).isLegal())
                {
                    squares[r][c + 1].setBackground(new Color(Display.getDefault(), 145, 185, 255));
                }

                Piece piece = ((Square) squares[r][c + 1].getData()).getPiece();

                if (piece == null)
                {
                    squares[r][c + 1].setImage(IconHandler.getBlankIcon());
                }
                else
                {
                    squares[r][c + 1].setImage(piece.getIcon());
                }
            }
        }
    }

    public static ChessRoom getChessRoom()
    {
        return chessRoom;
    }
}
