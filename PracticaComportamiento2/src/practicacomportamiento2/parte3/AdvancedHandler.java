package practicacomportamiento2.parte3;

public class AdvancedHandler extends BaseHandler {
    public AdvancedHandler() {
        super();
    }
    
    @Override
    public double getPrice(Component c) throws Exception {
        if (c instanceof CompositeValue) {
            return c.getPrice();
        } else {
            throw new Exception("Invalid Component Type!");
        }
    }

    @Override
    public String getInfo(Component c) throws Exception {
        if (c instanceof CompositeValue) {
            return c.getInfo();
        } else {
            throw new Exception("Invalid Component Type!");
        }
    }
}
