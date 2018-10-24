package com.chess.engine.pieces;

import com.chess.engine.Allience;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.Tile;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {

    private final static int[] CANDIDATE_MOVE_COORDINATES = {-17,-15,-10,-6,6,10,15,17};

    Knight(final int piecePosition, final Allience pieceAllience) {
        super(piecePosition, pieceAllience);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        int candidateDestinationCoordinate;

        final List<Move> legalMoves = new ArrayList<>();

        for (final int currentCoordinate: CANDIDATE_MOVE_COORDINATES) {

            candidateDestinationCoordinate = this.piecePosition + currentCoordinate;

            if (true /*isValidTileCoordinate */) {

                final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

                if (!candidateDestinationTile.isTileOccupied()) {
                    legalMoves.add(new Move());
                } else {
                    final Piece pieceAtDestination = candidateDestinationTile.getPiece();
                    final Allience pieceAllience = pieceAtDestination.getPieceAllience();

                    if (this.pieceAllience != pieceAllience) {
                        legalMoves.add(new Move());
                    }
                }
            }
        }

        return ImmutableList.copyOf(legalMoves);
    }


}
