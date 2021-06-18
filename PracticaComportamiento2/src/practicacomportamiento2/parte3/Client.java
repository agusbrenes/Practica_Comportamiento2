package practicacomportamiento2.parte3;

public class Client {
    
    public static void main(String[] args) {
        Component component1 = new BasicValue("Acción", 23.0);
        Component component2 = new BasicValue("Bono", 32.0);
        Component component3 = new BasicValue("Certificado", 4.0);
        Component component4 = new BasicValue("Fondo", 6.5);
        
        CompositeValue composite1 = new CompositeValue("Cartera de Valores");
        CompositeValue composite2 = new CompositeValue("Cuenta");
        
        composite1.addSubComponent(component1);
        composite1.addSubComponent(component2);
        composite2.addSubComponent(component4);
        composite2.addSubComponent(component3);
        composite1.addSubComponent(composite2);
        
        BaseHandler handler1 = new BasicHandler();
        BaseHandler handler2 = new AdvancedHandler();
        
        try {
            System.out.println("Info of Component 1: " + handler1.getInfo(component1));
            System.out.println("Price of Component 1: " + handler1.getPrice(component1));
            
            System.out.println("Info of Composite 1: " + handler2.getInfo(composite1));
            System.out.println("Price of Composite 1: " + handler2.getPrice(composite1));
            
            System.out.println("Info of Composite 2: " + handler2.getInfo(composite2));
            System.out.println("Price of Composite 2: " + handler2.getPrice(composite2));
        } catch (Exception ex) {
            System.out.println("I will initiate self-destruct!");
        }
    }
    
}
