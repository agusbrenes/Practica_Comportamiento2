package practicacomportamiento2.parte3;

public class BasicValue extends Component {  
   private double price;
   
   public BasicValue(String name, double price) {
       super.name = name;
       this.price = price;
   } 
   
   @Override
   public void operation() {
       System.out.println("Se ha ejecutado una operación con " + super.name);
   }
   
   @Override
   public double getPrice() {
       return this.price;
   }
   
   @Override
   public String getInfo() {
       return "Value Name: " + super.name;
   }
}
