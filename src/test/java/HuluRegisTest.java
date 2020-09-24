import static org.junit.Assert.*;
import org.junit.Test;

public class HuluRegisTest {

    @Test
    public void TestEmail() {
        String false1 = "fault@";
        String false2 = "@";
        String false3 = "";
        String correct1 = "yes@email";
        String correct2 = "flexon@gmail.edu";

        HuluRegistration test1 = new HuluRegistration();
        test1.setEmail(false1);
        assertNull(test1.getEmail());

        HuluRegistration test2 = new HuluRegistration();
        test2.setEmail(false2);
        assertNull(test2.getEmail());

        HuluRegistration test3 = new HuluRegistration();
        test3.setEmail(false3);
        assertNull(test3.getEmail());

        HuluRegistration test4 = new HuluRegistration();
        test4.setEmail(correct1);
        assertEquals(correct1,test4.getEmail());

        HuluRegistration test5 = new HuluRegistration();
        test5.setEmail(correct2);
        assertEquals(correct2,test5.getEmail());

        System.out.println("Test for email success");
    }

    @Test
    public void TestPassword() {
        String tooShort = "aa";
        String goodPW = "GoAwayHacker";

        HuluRegistration test1 = new HuluRegistration();
        test1.setPassword(tooShort);
        assertNull(test1.getPassword());

        HuluRegistration test2 = new HuluRegistration();
        test2.setPassword(goodPW);
        assertEquals(goodPW,test2.getPassword());

        System.out.println("Test for password success");
    }

    @Test
    public void TestName() {
        String noName = "";
        String goodName = "Harry";

        HuluRegistration test1 = new HuluRegistration();
        test1.setName(noName);
        assertNull(test1.getName());

        HuluRegistration test2 = new HuluRegistration();
        test2.setName(goodName);
        assertEquals(goodName,test2.getName());

        System.out.println("Test for name success");
    }

    @Test
    public void TestBirthDay() {
        HuluRegistration test1 = new HuluRegistration();
        test1.setBirthDate(21);
        test1.setBirthMonth(3);
        test1.setBirthYear(1000);
        assertEquals(-1, test1.getBirthYear());
        assertEquals(3, test1.getBirthMonth());
        assertEquals(21, test1.getBirthDate());

        HuluRegistration test2 = new HuluRegistration();
        test2.setBirthDate(0);
        test2.setBirthMonth(13);
        test2.setBirthYear(2000);
        assertEquals(2000, test2.getBirthYear());
        assertEquals(-1, test2.getBirthMonth());
        assertEquals(-1, test2.getBirthDate());

        System.out.println("Test for birthday success");
    }


    @Test
    public void TestGender() {
        HuluRegistration test1 = new HuluRegistration();
        test1.setGender("Male");
        assertEquals("Male", test1.getGender());

        HuluRegistration test2 = new HuluRegistration();
        test2.setGender("Prefer not to say");
        assertEquals("Prefer not to say", test2.getGender());

        HuluRegistration test3 = new HuluRegistration();
        test3.setGender("Transgender");
        assertNull(test1.getGender());

        System.out.println("Test for gender success");
    }

}
