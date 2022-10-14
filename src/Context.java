public class Context {
    private IStrategy strategy= new StrategyImpl1();
    public void appliquerStrategy(){
        System.out.println("Initialisation");
        System.out.println("..............");
        strategy.appliquer();
        System.out.println("common things");
        System.out.println(".......");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
