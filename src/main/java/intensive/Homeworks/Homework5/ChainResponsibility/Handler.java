package intensive.Homeworks.Homework5.ChainResponsibility;

abstract class Handler {
    protected Handler next;
    public void setNext(Handler next) { this.next = next; }
    public abstract void handle(String request);
}
