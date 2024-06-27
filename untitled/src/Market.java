import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Actor> queue = new ArrayList<Actor>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.printf("Покупатель %s зашел в магазин \n", actor.getName());
        takeInQueue(actor);
        printQueue(queue);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
        }
        System.out.printf("Получившие заказ покупатели вышли из магазина \n");
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.printf("Покупатель %s добавлен в очередь \n", actor.getName());
    }

    /*Не поняла смысл этого метода, наверное что-то не так поняла*/
    @Override
    public void takeOrders() {
        System.out.printf("Покупатели, которым необходимо выдать заказы: \n");
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
//              actor.setMakeOrder(actor.isMakeOrder);
                System.out.printf(actor.getName() + "\n");
            }
//              else actor.setMakeOrder(actor.isMakeOrder);
        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
                actor.isTakeOrder = true;
            }
        }
        System.out.printf("Заказы выданы \n");
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> realeaseQueue = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                realeaseQueue.add(actor);
            }
        }
        System.out.printf("Получившие заказ покупатели вышли из очереди \n");
        releaseFromMarket(realeaseQueue);
    }

    private void printQueue (List<Actor> queue) {
        String result = "Очередь: ";
        for (Actor actor : queue) {
            result = result + actor.name + " ";
        }
        System.out.printf(result + "\n\n");
    }
}
