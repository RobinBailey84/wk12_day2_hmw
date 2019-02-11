import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Ian Wright", "AF123456C", 30000.0);
    }

    @Test
    public void developerHasName() {
        assertEquals("Ian Wright", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("AF123456C", developer.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.0, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2.0);
        assertEquals(60000.0, developer.getSalary());
    }

    @Test
    public void canGetBonus() {
        assertEquals(300.0, developer.payBonus());
    }

    @Test
    public void canNotCreateNegSalaryIncrease() {
        developer.raiseSalary(-1.0);
        assertEquals(30000.0, developer.getSalary());
    }

    @Test
    public void canNotCreateZeroSalaryIncrease() {
        developer.raiseSalary(0.0);
        assertEquals(30000.0, developer.getSalary());
    }
}
