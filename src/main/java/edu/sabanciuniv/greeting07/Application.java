package edu.sabanciuniv.greeting07;


public class Application {
    public static void main(String[] args) {

        ObjectProviderFramework framework = new ObjectProviderFramework();

        System.out.println("Framework initialized");

        GreetingRenderer renderer = (GreetingRenderer) framework.getObject("edu.sabanciuniv.greeting07.StandardOutputRenderer", "edu.sabanciuniv.greeting07.HelloWorldGreetingProvider");

        renderer.render();

    }
}
