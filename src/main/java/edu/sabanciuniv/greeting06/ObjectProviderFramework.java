package edu.sabanciuniv.greeting06;

public class ObjectProviderFramework {

    public ObjectProviderFramework(){}

    public Object getObject(String clazzName) {
        Object o = null;
        try {
            o = Class.forName(clazzName).newInstance();
        } catch (InstantiationException e) {
            System.out.println("Can not instantiate the class: " + clazzName);
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access to the class: " + clazzName);
        } catch (ClassNotFoundException e) {
            System.out.println("No such class found: " + clazzName);
        }

        return o;
    }
}
