package cucumber.first;

public class GreetApp {
    private final String greeting;

    public GreetApp(String greeting) {
        this.greeting = greeting;
    }

    public String sayHi() {
        return greeting + " World";
    }
}
