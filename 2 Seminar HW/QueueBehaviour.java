public interface QueueBehaviour {

    void takeInQueue(Human human);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}
