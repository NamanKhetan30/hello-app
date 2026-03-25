public class HelloApp {
    public static void main(String[] args) {

        String name = (args.length == 0) ? "World" : args[0];

        System.out.println("Hello " + name);
    }
}