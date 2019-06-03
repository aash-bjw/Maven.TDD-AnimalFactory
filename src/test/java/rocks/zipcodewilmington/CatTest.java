package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {

        String expected = "Simba";

        Cat myCat = new Cat(null, null, null);

        myCat.setName(expected);

        Assert.assertEquals(expected, myCat.getName());
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {

        String expected = "meow";

        Cat myCat = new Cat(null, null, null);

        String actual = myCat.speak();

        Assert.assertEquals(expected, actual);


    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void  setBirthDateTest(){

        Date expected =new Date("11/08/05");

        Cat myCat = new Cat(null, null, null);

        myCat.setBirthDate(expected);

        Date actual = myCat.getBirthDate();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){

        Integer expected = 1;

        Cat myCat = new Cat(null, null, null);

        myCat.eat(null);

        Integer actual = myCat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Integer expected = 12;

        Cat myCat = new Cat(null, null, expected);

        Integer actual = myCat.getId();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animInherTest(){
        Cat myCat = new Cat(null, null, null);

        Boolean expected = true;

        Boolean actual = myCat instanceof Animal;

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mamInherTest(){
        Cat myCat = new Cat(null, null, null);

        Boolean expected = true;

        Boolean actual = myCat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }
}
