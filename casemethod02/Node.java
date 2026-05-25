package casemethod02;


class BuyerNode{
    Buyer data;
    BuyerNode prev;
    BuyerNode next;

    public BuyerNode() {
    }
    public BuyerNode(Buyer data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public BuyerNode(Buyer data, BuyerNode prev, BuyerNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
class OrderNode{
    Order data;
    OrderNode prev;
    OrderNode next;

    public OrderNode() {
    }
    public OrderNode(Order data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public OrderNode(Order data, OrderNode prev, OrderNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

