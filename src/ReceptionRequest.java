public class ReceptionRequest implements StorageRequest{
    @Override
    public void doRequest(Request request){
        System.out.println("Products name: " + request.getValue() +
                            "Products index: " + request.getIndex() +
                            "Count on storage: "+ request.getCount() + "" +
                            "Price product: " + request.getPrice());
    }
}
