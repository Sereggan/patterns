package factoryMethod;

public class GreenButton implements Button{
    @Override
    public void render() {
        System.out.println("Green Button is bad :(");
    }
}
