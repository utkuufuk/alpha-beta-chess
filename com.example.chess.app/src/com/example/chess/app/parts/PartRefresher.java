package com.example.chess.app.parts;

public class PartRefresher
{
    private static ChessBoardPart chessBoardPart;

    public static void refresh()
    {
        chessBoardPart.setFocus();
    }

    public static void setChessBoardPart(ChessBoardPart chessBoardPart)
    {
        PartRefresher.chessBoardPart = chessBoardPart;
    }
}
