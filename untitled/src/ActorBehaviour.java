public interface ActorBehaviour {

    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);

    boolean isMakeOrder(); //создан ли заказ
    boolean isTakeOrder(); //забрали ли заказ
}
