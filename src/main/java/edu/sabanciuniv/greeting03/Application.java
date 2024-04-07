package edu.sabanciuniv.greeting03;

public class Application {


    public static void main(String[] args) {

        // seperate the greeting provider and renderer for better flexibility

        // Create renderer
        StandardOutputRenderer renderer = new StandardOutputRenderer();

        // Create provider
        HelloWorldGreetingProvider provider = new HelloWorldGreetingProvider();

        // Set the provider to the renderer
        renderer.setGreetingProvider(provider);

        // Call renderer
        renderer.render();

    }


}
