package practicacomportamiento2.parte3;

public class Client {
    
    public static void main(String[] args) {
        // Leaf Components
        Component accion = new BasicValue("Acción", 23.0);
        Component bono = new BasicValue("Bono", 32.0);
        Component certificado = new BasicValue("Certificado", 4.0);
        Component fondo = new BasicValue("Fondo", 6.5);
        
        // Composite Components
        CompositeValue cartera = new CompositeValue("Cartera de Valores");
        CompositeValue cuenta = new CompositeValue("Cuenta");
        
        // Agregar leaf components a composite1
        cartera.addSubComponent(accion);
        cartera.addSubComponent(bono);
        
        // Agregar leaf components a composite2
        cuenta.addSubComponent(fondo);
        cuenta.addSubComponent(certificado);
        
        // Agregar composite component (composite2) a composite1
        cartera.addSubComponent(cuenta);
        
        // Setear orden de la cadena
        cartera.setSuccesor(accion);
        accion.setSuccesor(bono);
        bono.setSuccesor(cuenta);
        cuenta.setSuccesor(fondo);
        fondo.setSuccesor(certificado);
        
        // Obtener en cadena la info
        System.out.println("Info de Composite1: \n" + cartera.getInfo(""));
        // Obtener en cadena el precio
        System.out.println("Precio de Composite1: \n" + cartera.getPrice(0.0));
    }    
}
