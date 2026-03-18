public class HelloApp {
    public static void main(String[] args) {
        String greetingTarget;

        if (args.length == 0) {
            greetingTarget = "World";
        } else {
            StringBuilder names = new StringBuilder();
            for (String name : args) {
                names.append(name);
                names.append(", ");
            }
            if (names.length() > 0) {
                names = new StringBuilder(names.substring(0, names.length() - 2));
            }
            greetingTarget = names.toString();
        }

        System.out.println("Hello, " + greetingTarget + "!");
    }
}
