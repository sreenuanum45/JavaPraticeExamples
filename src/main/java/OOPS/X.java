package OOPS;

public interface X {
    static final  int a = 10; // public static final by default
    void m1();
    void m2();
    static void m3() {
        System.out.println("Static method m3 in interface X");
    }
}
