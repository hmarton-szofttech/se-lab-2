package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

  @Test
  void fire_Success(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(true, result);
  }

  @Test
  void fire_IllegalTorpedoNumber1(){
    TorpedoStore store = new TorpedoStore(1);
    IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {store.fire(0);});
    assertEquals(thrown.getClass(), IllegalArgumentException.class);
  }

  @Test
  void fire_IllegalTorpedoNumber2(){
    TorpedoStore store = new TorpedoStore(1);
    IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {store.fire(2);});
    assertEquals(thrown.getClass(), IllegalArgumentException.class);
  }

  @Test
  void get_TorpedoCount(){
    TorpedoStore store = new TorpedoStore(1);
    int result = store.getTorpedoCount();
    assertEquals(1, result);
  }

}
