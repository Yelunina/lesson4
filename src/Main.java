public class Main {


    public static void main(String[] args) {
        room1();
    }

    private static void room1() {
        System.out.println("Hello world from room1");
        room2();
        System.out.println("Hello world 2 from room1");
    }

    private static void room2() {
        System.out.println("Hello world from room2");
        room3();
    }

    private static void room3() {
        System.out.println("Hello world from room3");
    }
}
