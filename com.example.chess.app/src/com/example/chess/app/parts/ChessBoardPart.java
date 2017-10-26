package com.example.chess.app.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;

import com.example.chess.app.room.ChessRoom;
import com.example.chess.core.model.Board;

public class ChessBoardPart 
{
    private ChessRoom chessRoom;

	@PostConstruct
	public void createComposite(Composite parent) 
	{
	    chessRoom = new ChessRoom();
	    Board board = chessRoom.getBoard();
	    board.display();
	}

	@Focus
	public void setFocus() 
	{
	
	}
}