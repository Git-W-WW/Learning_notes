class Money{
    float money;
}
public class Ex_03_02 {
    public static void main(String[] args) {
        Money m1 = new Money();
        Money m2 = new Money();
        m1.money = 5.20f;
        m2.money = 13.14f;
        System.out.println("m1.money:" + m1.money + ",m2.money:" + m2.money);
        m1  = m2;
        System.out.println("m1.money:" + m1.money + ",m2.money:" + m2.money);
        m1.money = 5.20f;
        System.out.println("m1.money:" + m1.money + ",m2.money:" + m2.money);
    }
}
