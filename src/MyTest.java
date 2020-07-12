public class MyTest {

    @BeforeSuite
    public static void testB() {
        System.out.println("testBefore");
    }

    @BeforeSuite
    public static void test1() {
        System.out.println("test1");
    }

    @BeforeSuite
    public static void test2() {
        System.out.println("test2");
    }

    @BeforeSuite
    public static void test3() {
        System.out.println("test3");
    }

    @BeforeSuite
    public static void test4() {
        System.out.println("test4");
    }

    @AfterSuite
    public static void testA() {
        System.out.println("testAfter ");
    }
}
