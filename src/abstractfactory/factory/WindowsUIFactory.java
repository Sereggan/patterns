package abstractFactory;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Window createWindow() {
        return null;
    }
}
