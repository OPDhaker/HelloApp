public class HelloApp {
    public static void main(String[] args) {
        String greetingTarget;

        if (args.length == 0) {
            greetingTarget = "World";
        } else {
            StringBuilder names = new StringBuilder();
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            greetingTarget = names.toString();
        }

        System.out.println("Hello, " + greetingTarget + "!");
    }
}
