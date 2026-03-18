public class HelloApp {
    public static void main(String[] args) {
        String greetingTarget;

        if (args.length > 0) {
            String[] names = new String[args.length];
            for (int i = 0; i < args.length; i++) {
                names[i] = args[i];
            }
            greetingTarget = String.join(", ", names);
        } else {
            greetingTarget = "World";
        }

        System.out.println("Hello, " + greetingTarget + "!");
    }
}
