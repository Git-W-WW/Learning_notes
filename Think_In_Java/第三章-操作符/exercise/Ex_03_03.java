public class Ex_03_03 {
    static void f(Money m){
        m.money = 0;
    }

    public static void main(String[] args) {
        Money m = new Money();
        m.money = 100;
        System.out.println("m.money:" + m.money);
        f(m);
        System.out.println("m.money:" + m.money);
    }
}
