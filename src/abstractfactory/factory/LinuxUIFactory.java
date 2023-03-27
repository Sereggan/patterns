package abstractFactory;

public class LinuxUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
