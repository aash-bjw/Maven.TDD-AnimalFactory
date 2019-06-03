package rocks.zipcodewilmington;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.Cat;
import org.junit.Test;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        CatHouse myCatHouse = new CatHouse();

        Cat expected = new Cat(null, null, 125);

        myCatHouse.add(expected);

        Cat actual = myCatHouse.getCatById(125);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        CatHouse myCatHouse = new CatHouse();

        Cat expected = new Cat(null, null, 125);

        myCatHouse.add(expected);

        Cat actual = myCatHouse.getCatById(125);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest(){
        CatHouse myCatHouse = new CatHouse();

        Cat unexpected = new Cat(null, null, 125);

        myCatHouse.remove(125);

        Cat expected = null;

        Cat actual = myCatHouse.getCatById(125);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest(){
        CatHouse myCatHouse = new CatHouse();

        Cat unexpected = new Cat(null, null, 125);

        myCatHouse.remove(unexpected);

        Cat expected = null;

        Cat actual = myCatHouse.getCatById(125);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()
    @Test
    public void getNumberOfCatsTest(){
        CatHouse myCatHouse = new CatHouse();
        Cat cat = new Cat(null, null, null);

        myCatHouse.add(cat);

        Integer expected = 1;

        Integer actual = myCatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
