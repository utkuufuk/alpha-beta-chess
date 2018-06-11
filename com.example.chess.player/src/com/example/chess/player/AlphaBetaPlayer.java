package com.example.chess.player;

import java.util.List;

import com.example.chess.core.model.Board;
import com.example.chess.core.model.ChessMove;
import com.example.chess.core.model.Side;

public class AlphaBetaPlayer extends ChessPlayer
{
    private static final int SEARCH_DEPTH = 5;
    private ChessMove bestMove;

    public AlphaBetaPlayer(Board board, Side side)
    {
        super(board, side);
    }

    @Override
    public ChessMove decideMove()
    {
        maximizer(SEARCH_DEPTH, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return bestMove;
    }

    private int maximizer(int depth, int alpha, int beta)
    {
        if (depth == 0)
        {
            return board.computeRating(Side.BLACK);
        }
        List<ChessMove> legalMoves = computeAllLegalMoves();

        for (ChessMove move : legalMoves)
        {
            makeMove(move);
            side = side.opposite();
            int rating = minimizer(depth - 1, alpha, beta);
            side = side.opposite();
            undoMove(move);

            if (rating > alpha)
            {
                alpha = rating;

                if (depth == SEARCH_DEPTH)
                {
                    bestMove = move;
                }
            }

            if (alpha >= beta)
            {
                return alpha;
            }
        }
        return alpha;
    }
    
    private int minimizer(int depth, int alpha, int beta)
    {
        if (depth == 0)
        {
            return board.computeRating(Side.BLACK);
        }
        List<ChessMove> legalMoves = computeAllLegalMoves();

        for (ChessMove move : legalMoves)
        {
            makeMove(move);
            side = side.opposite();
            int rating = maximizer(depth - 1, alpha, beta);
            side = side.opposite();
            undoMove(move); 

            if (rating <= beta)
            {
                beta = rating;
            }

            if (alpha >= beta)
            {
                return beta;
            }
        }
        return beta;
    }
}
