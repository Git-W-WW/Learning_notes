public class Ex_03_06 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        d2.name = "scruffy";
        d2.says = "Wurf!";
        Dog d3 = new Dog();
        d3 = d1;
        System.out.println("d1==d2?\t" + (d1==d2));
        System.out.println("d1.equals(d2)?\t" + (d1.equals(d2)));
        System.out.println("d1==d3?\t" + (d1==d3));
        System.out.println("d1.equals(d3)?\t" + (d1.equals(d3)));
    }
}
