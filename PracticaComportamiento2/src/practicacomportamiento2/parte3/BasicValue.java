package practicacomportamiento2.parte3;

public class BasicValue extends Component {  
   private double price;
   
   public BasicValue(String name, double price) {
       super.name = name;
       this.price = price;
   } 
   
   @Override
   public void operation() {
       System.out.println("Se ha ejecutado una operación con " + this.name);
   }

    @Override
    public void setSuccesor(Component c) {
        this.succesor = c;
    }

    @Override
    public double getPrice(double actualPrice) {
        actualPrice += this.price;
        if (this.succesor == null) {
            return actualPrice;
        }
        return this.succesor.getPrice(actualPrice);
    }

    @Override
    public String getInfo(String actualInfo) {
        actualInfo += "Value Name: " + this.name + "\n";
        if (this.succesor == null) {
            return actualInfo;
        }
        return this.succesor.getInfo(actualInfo);
    }
}
