package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.button.WindowsButton;
import abstractfactory.window.Window;
import abstractfactory.window.WindowsWindow;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
