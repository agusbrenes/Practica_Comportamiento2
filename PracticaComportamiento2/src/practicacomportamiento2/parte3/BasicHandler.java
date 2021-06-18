package practicacomportamiento2.parte3;

public class BasicHandler extends BaseHandler {
    public BasicHandler() {
        super();
    }
    
    @Override
    public double getPrice(Component c) throws Exception {
        if (c instanceof BasicValue) {
            return c.getPrice();
        } else {
            throw new Exception("Invalid Component Type!");
        }
    }

    @Override
    public String getInfo(Component c) throws Exception {
        if (c instanceof BasicValue) {
            return c.getInfo();
        } else {
            throw new Exception("Invalid Component Type!");
        }
    }
}
