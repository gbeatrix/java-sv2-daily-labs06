package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {
    @Test
    void testProductWithPiece(){
        ProductWithPiece productWithPiece = new ProductWithPiece(Type.FROZEN);

        productWithPiece.incrementCount();
        productWithPiece.incrementCount();

        assertEquals(3, productWithPiece.getCount());
        assertEquals(Type.FROZEN, productWithPiece.getType());
    }
}