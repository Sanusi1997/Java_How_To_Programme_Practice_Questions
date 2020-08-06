package chapter7.knightTour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {
    private Knight myKnight;
    private Movement lMove;
    private ChessBoard game;

    @BeforeEach
    void setUp() {
        myKnight = new Knight();
        lMove = new Movement();
        game =  new ChessBoard();
    }

    @Test
    void KnightExistsTest() {
        assertNotNull(myKnight);
    }
    @Test
    void MoveExistsTest() {
        assertNotNull(lMove);
    }
    @Test
    void knightMoveExistIsNotNull() {
        myKnight.setKnightMovement(lMove);
        assertNotNull(myKnight.getKnightMovement());
    }
    @Test
    void KnightDefaultCoordinatesIsAtZero() {
        assertEquals(0, myKnight.getRow());
        assertEquals(0, myKnight.getRow());
    }
    @Test
    void ChessBoardObjectisNotNull() {
        assertNotNull(game);
    }
    @Test
    void ChessBoardHasABoard() {
        assertNotNull(game.getBoard());
    }
    @Test
    void KnightPositionIsAtZero() {
        assertEquals(0, myKnight.getColumn());
        assertEquals(0, myKnight.getRow());
    }
    @Test
    void KnightPositio() {
        assertEquals(0, myKnight.getColumn());
        assertEquals(0, myKnight.getRow());
    }
}

