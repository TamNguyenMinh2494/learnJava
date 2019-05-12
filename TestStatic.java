package JavaTest;

public class TestStatic {
    public static void main(String[] args) {
        StaticClass sc = new StaticClass();
        sc.setId(13);
        System.out.println("No: "+sc.getId());

        StaticClass sc1 = new StaticClass();
        sc1.increase();
        System.out.println("No: "+sc1.getId());

        StaticClass sc2 = new StaticClass();
        sc2.increase();
        System.out.println("No: "+sc2.getId());

        System.out.println("Pi: "+ Math.PI);
    }
}
