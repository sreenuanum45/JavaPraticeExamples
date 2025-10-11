public class Y {
    static void main(String[] args) {
        X x=new X(42);
        int y=x.x;
        System.out.println(y);
        y=43;
        System.out.println(x.x);
        System.out.println(y);
    }
}
