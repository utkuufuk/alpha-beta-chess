package com.example.chess.app.parts;

public class PartRefresher
{
    private static ChessBoardPart chessBoardPart;
    private static GraveyardPart whiteGraveyardPart, blackGraveyardPart;

    public static void refresh()
    {
        if (chessBoardPart == null || whiteGraveyardPart == null || blackGraveyardPart == null)
        {
            return;
        }
        chessBoardPart.setFocus();
        whiteGraveyardPart.setFocus();
        blackGraveyardPart.setFocus();
    }

    public static void setChessBoardPart(ChessBoardPart chessBoardPart)
    {
        PartRefresher.chessBoardPart = chessBoardPart;
    }

    public static void setWhiteGraveyardPart(GraveyardPart whiteGraveyardPart)
    {
        PartRefresher.whiteGraveyardPart = whiteGraveyardPart;
    }

    public static void setBlackGraveyardPart(GraveyardPart blackGraveyardPart)
    {
        PartRefresher.blackGraveyardPart = blackGraveyardPart;
    }
}
