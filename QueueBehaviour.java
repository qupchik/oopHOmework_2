package task_1;
/**
 * QueueBehaviour
 */
interface QueueBehaviour {
    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
    
}