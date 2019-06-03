package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        DogHouse myDogHouse = new DogHouse();

        Dog expected = new Dog(null, null, 125);

        myDogHouse.add(expected);

        Dog actual = myDogHouse.getDogById(125);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void getDogByIdTest() {
        DogHouse myDogHouse = new DogHouse();

        Dog expected = new Dog(null, null, 125);

        myDogHouse.add(expected);

        Dog actual = myDogHouse.getDogById(125);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeTest(){
        DogHouse myDogHouse = new DogHouse();

        Dog unexpected = new Dog(null, null, 125);

        myDogHouse.remove(125);

        Dog expected = null;

        Dog actual = myDogHouse.getDogById(125);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void removeDogTest(){
        DogHouse myDogHouse = new DogHouse();

        Dog unexpected = new Dog(null, null, 125);

        myDogHouse.remove(unexpected);

        Dog expected = null;

        Dog actual = myDogHouse.getDogById(125);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
        DogHouse myDogHouse = new DogHouse();
        Dog dog = new Dog(null, null, null);

        myDogHouse.add(dog);

        Integer expected = 1;

        Integer actual = myDogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
}
