package abstractfactory.button;

public class WindowsButton implements Button {
    @Override
    public void print() {
        System.out.println("Windows button print");
    }
}
