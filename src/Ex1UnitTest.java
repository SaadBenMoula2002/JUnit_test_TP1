import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex1UnitTest
{
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before ");
    }
    @After
    public void tearDown () throws Exception
    {
        System.out.println("After ");
    }
    @Test
    public void equalString() {
        System.out.println("Je developpeur Mobile");
        String str1 ="Je developpeur Mobile";
        assertEquals("Je developpeur Mobile", str1);
    }
}

