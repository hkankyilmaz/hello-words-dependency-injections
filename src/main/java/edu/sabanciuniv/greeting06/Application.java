package edu.sabanciuniv.greeting06;

public class Application {
    public static void main(String[] args) {

        ObjectProviderFramework framework = new ObjectProviderFramework();

        System.out.println("Framework initialized");

        GreetingRenderer renderer = (GreetingRenderer) framework.getObject("edu.sabanciuniv.greeting06.StandardOutputRenderer");
        GreetingProvider provider = (GreetingProvider) framework.getObject("edu.sabanciuniv.greeting06.HelloWorldGreetingProvider");

        renderer.setGreetingProvider(provider);
        renderer.render();

        renderer = (GreetingRenderer) framework.getObject("edu.sabanciuniv.greeting06.ErrorOutputRenderer");
        provider = (GreetingProvider) framework.getObject("edu.sabanciuniv.greeting06.SelamGreetingProvider");

        renderer.setGreetingProvider(provider);
        renderer.render();

        provider = (GreetingProvider) framework.getObject("edu.sabanciuniv.greeting06.ArabicGreetingProvider");

        renderer.setGreetingProvider(provider);
        renderer.render();


    }
}
