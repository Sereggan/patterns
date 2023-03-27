package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.button.LinuxButton;
import abstractfactory.window.LinuxWindow;
import abstractfactory.window.Window;

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
