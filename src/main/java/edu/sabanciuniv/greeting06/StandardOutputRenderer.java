package edu.sabanciuniv.greeting06;

public class StandardOutputRenderer implements GreetingRenderer {

    private GreetingProvider greetinngProvider = null;


    @Override
    public void render() {
        String greeting = greetinngProvider.getGreeting();
        System.out.println(greeting);
    }

    @Override
    public void setGreetingProvider(GreetingProvider provider) {
        this.greetinngProvider = provider;
    }


}
