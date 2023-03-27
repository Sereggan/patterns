package abstractfactory.button;

public class LinuxButton implements Button{
    @Override
    public void print() {
        System.out.println("Linux button prints");
    }
}
