package com.example.chess.app.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.example.chess.core.model.Army;
import com.example.chess.core.model.Board;
import com.example.chess.core.model.Side;

public class GraveyardPart
{
    protected Side side;
    private Label[] deadPieces;

    public GraveyardPart()
    {
        deadPieces = new Label[Board.LENGTH * 2];
    }

    @PostConstruct
    public void createComposite(Composite parent)
    {
        parent.setLayout(new GridLayout(2, false));
        GridData gridData = new GridData(SWT.CENTER, SWT.CENTER, true, false);
        gridData.widthHint = 50;
        gridData.heightHint = 50;

        for (int p = 0; p < Board.LENGTH * 2; p++)
        {
            deadPieces[p] = new Label(parent, SWT.NONE);
            deadPieces[p].setLayoutData(gridData);
        }
        PartRefresher.refresh();
    }

    @Focus
    public void setFocus()
    {
        Army army = ChessBoardPart.getChessRoom().getBoard().getArmy(side);

        for (int p = 0; p < army.getDeadPieces().size(); p++)
        {
            deadPieces[p].setImage(army.getDeadPieces().get(p).getIcon());
        }
    }
}
