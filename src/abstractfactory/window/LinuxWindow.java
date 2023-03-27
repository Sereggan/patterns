package abstractfactory.window;

public class LinuxWindow implements Window{
    @Override
    public void close() {
        System.out.println("Linux window");
    }
}
