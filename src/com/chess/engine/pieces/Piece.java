package com.chess.engine.pieces;

import com.chess.engine.Allience;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.List;

public abstract class Piece {

    protected final int piecePosition;
    protected final Allience pieceAllience;

    Piece(final int piecePosition, final Allience pieceAllience) {
        this.piecePosition = piecePosition;
        this.pieceAllience = pieceAllience;
    }

    public Allience getPieceAllience() {
        return this.pieceAllience;
    }

    public abstract List<Move> calculateLegalMoves(final Board board);
}