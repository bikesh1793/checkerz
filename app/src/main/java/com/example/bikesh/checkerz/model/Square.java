package com.example.bikesh.checkerz.model;

public class Square {
    private Piece piece;
    private final Position position; //Should never be updated

    public Square(Position position, Piece startingPiece) {
        this.position = position;
        this.piece = startingPiece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isEmpty() {
        return this.piece == null ? true : false;
    }
}
