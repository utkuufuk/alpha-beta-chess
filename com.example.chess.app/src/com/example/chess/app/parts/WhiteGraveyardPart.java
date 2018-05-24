package com.example.chess.app.parts;

import com.example.chess.core.model.Side;

public class WhiteGraveyardPart extends GraveyardPart
{
    public WhiteGraveyardPart()
    {
        side = Side.WHITE;
        PartRefresher.setWhiteGraveyardPart(this);
    }
}
