import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Human> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Human human) {
        System.out.println(human.getName() + " зашёл в магазин.");
        takeInQueue(human);
    }

    @Override
    public void takeInQueue(Human human) {
        System.out.println(human.getName() + " встал в очередь.");
        this.queue.add(human);
    }

    @Override
    public void takeOrders() {
        for (Human human : queue) {
            if (!human.isMakeOrder()) {
                human.setMakeOrder(true);
                human.setTakeOrder(false);
                System.out.println(human.getName() + " сделал заказ.");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Human human : queue) {
            if (!human.isTakeOrder) {
                human.setTakeOrder(true);
                human.setMakeOrder(false);
                System.out.println(human.getName() + " забрал заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Human> releasedHumans = new ArrayList<>();
        for (Human human : queue) {
            if (human.isTakeOrder()) {
                releasedHumans.add(human);
                System.out.println(human.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedHumans);
    }

    @Override
    public void releaseFromMarket(List<Human> humans) {
        for (Human human : humans) {
            System.out.println(human.getName() + " вышел из магазина");
            queue.remove(human);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
