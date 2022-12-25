public class ReceptionProxy implements StorageRequest {
    ReceptionRequest receptionRequest = new ReceptionRequest();
    @Override
    public void doRequest(Request request){
        startRequest();
        receptionRequest.doRequest(request);
        endRequest();
    }
    public void startRequest(){
        System.out.println("Request is started");
    }
    public void endRequest(){
        System.out.println("Request completed");
    }
}
