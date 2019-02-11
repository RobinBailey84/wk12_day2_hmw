import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Arsene Wenger", "JT123456N", 25000, "Recruitment");
    }

    @Test
    public void managerHasName() {
        assertEquals("Arsene Wenger", manager.getName());
    }

    @Test
    public void managerHasNInumb() {
        assertEquals("JT123456N", manager.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.0, manager.getSalary());
    }

    @Test
    public void hasDept() {
        assertEquals("Recruitment", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2.0);
        assertEquals(50000.0, manager.getSalary());
    }

    @Test
    public void canGetBonus() {
        assertEquals(250.0, manager.payBonus());
    }
}
