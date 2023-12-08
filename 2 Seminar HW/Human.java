public class Human implements HumanBehaviour {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Human(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        this.isMakeOrder = isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        this.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
