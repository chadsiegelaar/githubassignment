package za.ac.cput.githubAssignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Chad Siegelaar - 218340982
 */
public class CustomerTest {

    private Customer James;
    private Customer Katy;
    private Customer Will;

    @BeforeEach
    public void setUp() {
        James = new Customer();
        Katy = new Customer();
        Will = James;
    }

    @Test
    void ObjectIdentity () {
        assertSame(Will, James);
    }

    @Test
    void ObjectEquality () {
        assertEquals(Will, James);
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void failingTest () { fail("The test case is a prototype.");
        System.out.println("getName");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Customer.
     */
    @Test
    @Disabled
    public void disablingTest() {
        System.out.println("setName");
        String name = "";
        Customer instance = new Customer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerGender method, of class Customer.
     */
    @Test
    @Disabled
    public void testGetCustGender() {
        System.out.println("getCustGender");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerGender method, of class Customer.
     */
    @Test
    @Disabled
    public void testCustGender() {
        System.out.println("setCustGender");
        String custGender = "";
        Customer instance = new Customer();
        instance.setCustGender(custGender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    @Disabled
    public void testGetCustId() {
        System.out.println("getCustId");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.getCustId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerId method, of class Customer.
     */
    @Test
    @Disabled
    public void testSetId() {
        System.out.println("setCustId");
        int id = 0;
        Customer instance = new Customer();
        instance.setCustId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    @Disabled
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}