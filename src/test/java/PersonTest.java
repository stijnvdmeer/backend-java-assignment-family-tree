import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void canGetPersonName() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        // Act
        String personName = p.getName();

        // Assert
        assertEquals("Stijn", personName);
    }

    @Test
    public void canGetPersonMiddleName() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        // Act
        String personMiddleName = p.getMiddleName();

        // Assert
        assertEquals("SmallS", personMiddleName);
    }

    @Test
    public void canGetPersonLastName() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        // Act
        String personLastName = p.getLastName();

        // Assert
        assertEquals("van der Meer", personLastName);
    }
    @Test
    public void canGetPersonSex() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        // Act
        String personSex = p.getSex();

        // Assert
        assertEquals("male", personSex);
    }
    @Test
    public void canGetPersonAge() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        // Act
        int personAge = p.getAge();

        // Assert
        assertEquals(22, personAge);
    }
    @Test
    public void canSetPersonName() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);

        // Act
        p.setName("Daan");

        // Assert
        assertEquals("Daan", p.getName());
    }
    @Test
    public void canSetPersonMiddleName() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);

        // Act
        p.setMiddleName("Casper");

        // Assert
        assertEquals("Casper", p.getMiddleName());
    }
    @Test
    public void canSetPersonLastName() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);

        // Act
        p.setLastName("Groot");

        // Assert
        assertEquals("Groot", p.getLastName());
    }
    @Test
    public void canSetPersonSex() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);

        // Act
        p.setSex("female");

        // Assert
        assertEquals("female", p.getSex());
    }
    @Test
    public void canSetPersonAge() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);

        // Act
        p.setAge(23);

        // Assert
        assertEquals(23, p.getAge());
    }

    @Test
    public void canSetAndGetMother() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        Person mama = new Person("Anja", "Groot", "female", 55);

        // Act
        p.setMother(mama);
        String MotherName = p.getMother().getName();

        // Assert
        assertEquals("Anja", MotherName);
    }
    @Test
    public void canSetAndGetFather() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        Person papa = new Person("Bauke", "van der Meer", "male", 60);

        // Act
        p.setFather(papa);
        String fatherName = p.getFather().getName();

        // Assert
        assertEquals("Bauke", fatherName);
    }
    @Test
    public void canSetAndGetSiblings() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        Person b1 = new Person("Daan", "van der Meer", "male", 26);
        Person b2 = new Person("Jelle", "van der Meer", "male", 30);

        // Act
        p.addSibling(b1);
        p.addSibling(b2);
        String siblingName = p.getSiblings().get(0).getName();

        // Assert
        assertEquals("Daan", siblingName);
    }
    @Test
    public void canSetAndGetChildren() {
        // Arrange
        Person p = new Person("Bauke", "Hendrik", "van der Meer", "male", 60);
        Person c1 = new Person("Stijn", "van der Meer", "male", 22);
        Person c2 = new Person("Jelle", "van der Meer", "male", 30);

        // Act
        p.addChild(c1);
        p.addChild(c2);
        String childName = p.getChildren().get(0).getName();

        // Assert
        assertEquals("Stijn", childName);
    }
    @Test
    public void canSetAndGetPets() {
        // Arrange
        Person p = new Person("Stijn", "SmallS", "van der Meer", "male", 22);
        Pet a1 = new Pet("Tessa", 13, "Hond");
        Pet a2 = new Pet("Lotje", 6, "Kat");

        // Act
        p.addPet(a1);
        p.addPet(a2);
        String petName = p.getPets().get(0).getName();

        // Assert
        assertEquals("Tessa", petName);
    }
}