package net.pdutta.proto.greeter;

public class Greeter {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void greet (String user) {
        System.out.println(greeting + ", " + user + "!");
    }
}
