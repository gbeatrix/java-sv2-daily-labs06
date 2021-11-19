package day05;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    @Test
    void testStore() {
        Store store = new Store();

        store.addProduct(new Product("Mirelit borsó", Type.FROZEN, 500));
        store.addProduct(new Product("Jégkrém", Type.FROZEN, 800));
        store.addProduct(new Product("Kenyér", Type.BAKERY, 300));
        store.addProduct(new Product("Pontyszelet", Type.FROZEN, 1500));
        store.addProduct(new Product("Kifli", Type.BAKERY, 30));
        store.addProduct(new Product("Zsemle", Type.BAKERY, 30));
        store.addProduct(new Product("Szeletelt kenyér", Type.BAKERY, 350));

        List<ProductWithPiece> res = store.numberOfProductsByType();
        assertEquals(Type.FROZEN, res.get(0).getType());
        assertEquals(3, res.get(0).getCount());
        assertEquals(Type.BAKERY, res.get(1).getType());
        assertEquals(4, res.get(1).getCount());
    }
}