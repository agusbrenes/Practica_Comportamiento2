package practicacomportamiento2.parte3;

import java.util.ArrayList;

public class CompositeValue extends Component {
    private ArrayList<Component> subComponents;
    
    public CompositeValue(String name) {
        super.name = name;
        this.subComponents = new ArrayList();
    }

    public void addSubComponent(Component c) {
        subComponents.add(c);
    }
    
    @Override
    public void operation() {
        System.out.println("Performing operation in " + super.name);
        for (Component sc : subComponents) {
            sc.operation();
        }
    }

    @Override
    public double getPrice(double actualPrice) {
        if (this.succesor == null) {
            return actualPrice;
        }
        return this.succesor.getPrice(actualPrice);
    }

    @Override
    public String getInfo(String actualInfo) {
        if (this.succesor == null) {
            return actualInfo;
        }
        return actualInfo + "Composite Value: " + this.name + "\n" + "Has the following subvalues:\n" + this.succesor.getInfo("");
    }

    @Override
    public void setSuccesor(Component c) {
        this.succesor = c;
    }
}
