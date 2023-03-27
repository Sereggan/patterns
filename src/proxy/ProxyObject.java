package proxy;

public class ProxyObject implements ObjectInterface {

    private final OriginalObject originalObject;

    public ProxyObject(OriginalObject originalObject) {
        this.originalObject = originalObject;
    }

    @Override
    public void print() {
        System.out.println("Proxy starts");
        originalObject.print();
        System.out.println("Proxy finished");
    }
}
