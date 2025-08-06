package OOPS;

public class Test1 {
    static {
        System.out.println("Static block in Test1");
        m3();
        new Test1().m1();
        new Test1().m2();
        // Note: Static blocks are executed when the class is loaded, before main method.
        // The methods m1 and m2 will be called on a new instance of Test1


    }
    public static void main(String[] args) {
       Test1 t1 = new Test1();
         t1.m2();
        Test2 t2 = new Test1().new Test2();
        t2.m4();
        t2.m1();
        t2.m2();
    }

    public void m1() {
        // This method is not overridden, so it will print "m1" from this class
        // when called from m2.
        // If you want to see the overridden method in action, you need to create an instance
        // of a subclass that overrides m1.
m3();
        System.out.println("m1");
    }
    public void m2() {
        System.out.println("m2");
        m1();
    }
    public static void m3(){
        System.out.println("m3");
    }
    public class Test2 extends Test1{
       @Override
        public void m1() {
            // This method overrides the m1 method in Test1
            System.out.println("Overridden m1 in Test2");
        }
        @Override
        public void m2() {
            // This method overrides the m2 method in Test1
            System.out.println("Overridden m2 in Test2");
            m1(); // Calls the overridden m1 method
        }
        public static void m3() {
            // This method overrides the static m3 method in Test1
            System.out.println("Overridden static m3 in Test2");
        }
        public void m4(){
            System.out.println("m4 in Test2");
        }
    }
}
