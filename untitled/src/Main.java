import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Задание 1
//        Необходимо реализовать:
//        1. Интерфейс ActorBehavoir,
//        который будет содержать
//        описание возможных
//        действий актора в
//        очереди/магазине
//        2. Абстрактный класс Actor,
//                который хранит в себе
//        параметры актора, включая
//        состояние готовности сделать
//        заказ и факт получения
//        заказа.
//                Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
//“персональных данных” abstract
//        3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir

//        Задание 2
//        Необходимо реализовать строение классов, без
//        конкретной реализации:
//        1. Интерфейс QueueBehaviour, который описывает
//        логику очереди – помещение в/освобождение из
//        очереди, принятие/отдача заказа
//        2. Интерфейс MarketBehaviour, который описывает
//        логику магазина – приход/уход покупателей,
//                обновление состояния магазина
//        3. Класс Market, который реализовывает два
//        вышеуказанных интерфейса и хранит в списке список
//        людей в очереди в различных статусах

//        ДЗ
//        Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди,
//        MarketBehaviour – помещает и удаляет человека из очереди,
//        метод update – обновляет состояние магазина (принимает и отдает заказы).


//        List<Actor> actors = new ArrayList<Actor>();

        Human actor_1 = new Human("Actor_1");
        actor_1.isMakeOrder = true;
        actor_1.isTakeOrder = false;

        Human actor_2 = new Human("Actor_2");
        actor_2.isMakeOrder = true;
        actor_2.isTakeOrder = false;

        Human actor_3 = new Human("Actor_3");
        actor_3.isMakeOrder = false;
        actor_3.isTakeOrder = false;

        Human actor_4 = new Human("Actor_4");
        actor_4.isMakeOrder = false;
        actor_4.isTakeOrder = false;

        Human actor_5 = new Human("Actor_5");
        actor_5.isMakeOrder = true;
        actor_5.isTakeOrder = false;

        Market market = new Market();
        market.acceptToMarket(actor_1);
        market.acceptToMarket(actor_2);
        market.acceptToMarket(actor_3);
        market.acceptToMarket(actor_4);
        market.acceptToMarket(actor_5);

        market.update();

    }
}