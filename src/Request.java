public class Request {
    private int index;
    private String value;

    private int count;
    private int price;
    public Request(int index, String value, int count, int price){
        this.index = index;
        this.value = value;
        this.count = count;
        this.price = price;
    }
    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index = index;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }

    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
