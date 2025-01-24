public class NodeCustom {
    String data;
    NodeCustom prev;
    NodeCustom next;
    public void add(String value){
        this.data = value;
    }

    public NodeCustom getPrev(){
        return prev;
    }
    public NodeCustom getNext(){
        return next;
    }
}
