package net.pdutta.proto.harnesses;

import net.pdutta.proto.greeter.Greeter;

public class GreetingHarness {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.setGreeting("Servus");
        g.greet("Max");
    }
}
