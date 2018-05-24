package com.example.chess.app.parts;

import com.example.chess.core.model.Side;

public class BlackGraveyardPart extends GraveyardPart
{
    public BlackGraveyardPart()
    {
        side = Side.BLACK;
        PartRefresher.setBlackGraveyardPart(this);
    }
}
