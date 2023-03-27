package proxy;

public class OriginalObject implements ObjectInterface{
    @Override
    public void print() {
        System.out.println("Original object's action");
    }
}
