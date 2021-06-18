package practicacomportamiento2.parte3;

import java.util.ArrayList;

public abstract class BaseHandler {
    protected ArrayList<BaseHandler> succesor;
    
    public BaseHandler() {
        this.succesor = new ArrayList();
    }
    
    public void setNext(BaseHandler h) {
        this.succesor.add(h);
    }
    
    public abstract double getPrice(Component c) throws Exception;
    public abstract String getInfo(Component c) throws Exception;
}
