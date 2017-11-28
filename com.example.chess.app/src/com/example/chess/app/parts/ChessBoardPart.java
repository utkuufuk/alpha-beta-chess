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
    private ChessRoom chessRoom;
    private Label[][] squares;

    public ChessBoardPart()
    {
	    chessRoom = new ChessRoom();
	    squares = new Label[Board.LENGTH][Board.LENGTH];
    }

	@PostConstruct
	public void createComposite(Composite parent) 
	{
	    parent.setLayout(new GridLayout(Board.LENGTH, true));
	    GridData gridData = new GridData(SWT.CENTER, SWT.CENTER, false, false);

	    for (int r = 0; r < Board.LENGTH; r++)
	    {
	        for (int c = 0; c < Board.LENGTH; c++)
	        {
	            squares[r][c] = new Label(parent, SWT.BORDER);
	            squares[r][c].setLayoutData(gridData);
                squares[r][c].setData(chessRoom.getBoard().getSquare(r, c));
                squares[r][c].setText("Square");
	        }
	    }
	}

	@Focus
	public void setFocus() 
	{
	
	}
}