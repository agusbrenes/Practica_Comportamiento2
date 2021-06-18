package practicacomportamiento2.parte3;

public abstract class Component {
    protected String name;
    protected Component succesor = null;
    
    public abstract void operation();
    public abstract double getPrice(double actualPrice);
    public abstract String getInfo(String actualInfo);
    public abstract void setSuccesor(Component c);
}
