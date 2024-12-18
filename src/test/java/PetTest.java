import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    public void canGetPetName() {
        // Arrange
            Pet p = new Pet("Tessa", 13, "Hond");

        // Act
            String petName = p.getName();

        // Assert
            assertEquals("Tessa", petName);
    }

    @Test
    public void canGetPetAge() {
        // Arrange
        Pet p = new Pet("Tessa", 13, "Hond");

        // Act
        int petAge = p.getAge();

        // Assert
        assertEquals(13 , petAge);
    }

    @Test
    public void canGetPetSpecies() {
        // Arrange
        Pet p = new Pet("Tessa", 13, "Hond");

        // Act
        String petSpecies = p.getSpecies();

        // Assert
        assertEquals("Hond", petSpecies);
    }
    @Test
    public void canGetAndSetPetowner() {
        // Arrange
        Pet p = new Pet("Tessa", 13, "Hond");
        Person owner = new Person("Stijn", "van der Meer", "male", 22);
        p.setOwner(owner);

        // Act
        String ownerName = p.getOwner().getName();

        // Assert
        assertEquals("Stijn", ownerName);
    }
    @Test
    public void canSetPetName() {
        // Arrange
        Pet p = new Pet("Pasja", 13, "Hond");

        // Act
        p.setName("Tessa");

        // Assert
        assertEquals("Tessa", p.getName());
    }
    @Test
    public void canSetPetAge() {
        // Arrange
        Pet p = new Pet("Pasja", 13, "Hond");

        // Act
        p.setAge(14);

        // Assert
        assertEquals(14 , p.getAge());
    }
    @Test
    public void canSetPetSpecies() {
        // Arrange
        Pet p = new Pet("Pasja", 13, "Kat");

        // Act
        p.setSpecies("Hond");

        // Assert
        assertEquals("Hond", p.getSpecies());
    }

}