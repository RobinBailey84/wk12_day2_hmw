import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Marc Overmars", "AF234567C", 20000.0);
    }


    @Test
    public void developerHasName() {
        assertEquals("Marc Overmars", databaseAdmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("AF234567C", databaseAdmin.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000.0, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2.0);
        assertEquals(40000.0, databaseAdmin.getSalary());
    }

    @Test
    public void canGetBonus() {
        assertEquals(200.0, databaseAdmin.payBonus());
    }

}
