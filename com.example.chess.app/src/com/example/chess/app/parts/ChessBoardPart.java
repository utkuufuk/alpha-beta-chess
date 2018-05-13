package com.example.chess.app.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.example.chess.app.room.ChessRoom;
import com.example.chess.core.model.Board;

public class ChessBoardPart
{
    private static final String[] COL_LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private ChessRoom chessRoom;
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

        for (int r = 0; r < Board.LENGTH; r++)
        {
            squares[r][0] = new Label(parent, SWT.NONE);
            squares[r][0].setLayoutData(tagGridData);
            squares[r][0].setText(String.format("%s", r + 1));

            for (int c = 0; c < Board.LENGTH; c++)
            {
                squares[r][c] = new Label(parent, SWT.BORDER);
                squares[r][c].setLayoutData(squareGridData);
                squares[r][c].setData(chessRoom.getBoard().getSquare(r, c));
                squares[r][c].setText(squares[r][c].getData().toString().substring(35));
            }
        }
        new Label(parent, SWT.NONE);
        
        for (int c = 0; c < Board.LENGTH; c++)
        {
            squares[Board.LENGTH][c + 1] = new Label(parent, SWT.NONE);
            squares[Board.LENGTH][c + 1].setText(COL_LETTERS[c]);
            squares[Board.LENGTH][c + 1].setLayoutData(tagGridData);
        }
    }

    @Focus
    public void setFocus()
    {

    }
}
