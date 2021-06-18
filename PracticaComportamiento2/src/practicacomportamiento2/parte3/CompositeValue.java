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
        //I REFUSE TO JAVASCRIPT
        for (Component sc : subComponents) {
            sc.operation();
        }
    }

    @Override
    public double getPrice() {
        double finalPrice = 0.0;
        for (Component sc : subComponents) {
            finalPrice += sc.getPrice();
        }
        return finalPrice;
    }

    @Override
    public String getInfo() {
        String s = "Composite Value: " + super.name + "\n" + "Has the following subvalues:\n";
        for (Component sc: subComponents) {
            s += sc.getInfo() + "\n";
        }
        return s;
    }
}
