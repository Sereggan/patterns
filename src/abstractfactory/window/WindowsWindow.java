package abstractfactory.window;

public class WindowsWindow implements Window {
    @Override
    public void close() {
        System.out.println("Windows window print");
    }
}
