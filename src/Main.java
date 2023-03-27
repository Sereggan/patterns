import abstractfactory.factory.LinuxUIFactory;
import abstractfactory.factory.UIFactory;
import abstractfactory.factory.WindowsUIFactory;
import chainofresponsibility.IsGoodUserMiddleware;
import chainofresponsibility.Middleware;
import chainofresponsibility.TokenAuthMiddleware;
import factorymethod.dialog.BadDialog;
import factorymethod.dialog.Dialog;
import factorymethod.dialog.GoodDialog;
import proxy.OriginalObject;
import proxy.ProxyObject;

public class Main {
    public static void main(String[] args) {
        runAbstractFactory();
        runFactoryMethod();
        runProxy();
        runMiddleware();
    }

    private static void runAbstractFactory() {
        System.out.println();
        UIFactory linuxUIFactory = new LinuxUIFactory();
        linuxUIFactory.createButton().print();
        linuxUIFactory.createWindow().close();
        System.out.println();

        UIFactory windowsUIFactory = new WindowsUIFactory();
        windowsUIFactory.createButton().print();
        windowsUIFactory.createWindow().close();
        System.out.println();
    }

    private static void runFactoryMethod() {
        System.out.println();
        Dialog goodDialog = new GoodDialog();
        goodDialog.renderWindow();
        Dialog badDialog = new BadDialog();
        badDialog.renderWindow();
        System.out.println();
    }

    private static void runProxy() {
        System.out.println();
        ProxyObject proxyObject = new ProxyObject(new OriginalObject());
        proxyObject.print();
        System.out.println();
    }

    private static void runMiddleware() {
        Middleware successMiddleware = Middleware.link(new TokenAuthMiddleware("token"), new IsGoodUserMiddleware(true));
        successMiddleware.doAction();
        System.out.println();
        Middleware wrongTokenMiddleware = Middleware.link(new TokenAuthMiddleware("token123"), new IsGoodUserMiddleware(true));
        wrongTokenMiddleware.doAction();
        System.out.println();
        Middleware badUserMiddleware = Middleware.link(new TokenAuthMiddleware("token"), new IsGoodUserMiddleware(false));
        badUserMiddleware.doAction();
    }
}