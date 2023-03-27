package abstractFactory;

public class LinuxWindow implements Window{
    @Override
    public void close() {
        System.out.println("Linux window");
    }
}
