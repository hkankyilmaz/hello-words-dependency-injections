package edu.sabanciuniv.greeting04;

public class Application {
    public static void main(String[] args) {

        // greetingRenderer and greetingProvider is abstracted

        GreetingRenderer renderer = new StandardOutputRenderer();
        GreetingRenderer rendererTwo = new ErrorOutputRenderer();


        GreetingProvider provider = new HelloWorldGreetingProvider();
        GreetingProvider providerTwo = new SelamGreetingProvider();


        renderer.setGreetingProvider(providerTwo);
        renderer.render();

        rendererTwo.setGreetingProvider(provider);
        rendererTwo.render();

    }
}
