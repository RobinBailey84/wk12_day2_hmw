import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("David Dein", "AF456789C", 100000.0, 50.0);
    }


    @Test
    public void developerHasName() {
        assertEquals("David Dein", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("AF456789C", director.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.0, director.getSalary());
    }

    @Test
    public void hasBudget() {
        assertEquals(50.0, director.getBudget());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.5);
        assertEquals(150000.0, director.getSalary());
    }

    @Test
    public void canGetBonus() {
        assertEquals(2000.0, director.payBonus());
    }

    @Test
    public void canChangeName() {
        director.setName("Stan Kroenke");
        assertEquals("Stan Kroenke", director.getName());
    }

    @Test
    public void canNotChangeNameToNull() {
        director.setName(null);
        assertEquals("David Dein", director.getName());
    }
}
