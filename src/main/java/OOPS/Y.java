package OOPS;

public abstract class Y implements X{
    @Override
    public void m1() {
        System.out.println("Method m1 implemented in class Y");
    }
    public abstract void m4();
    @Override
    public void m2() {
        System.out.println("Method m2 implemented in class Y");
    }
    public  void m5() {
        System.out.println("Static method m5 in class Y");
    }
}
