public class Main {
    public static void main(String[] args) {
        ReceptionRequest receptionRequest=new ReceptionRequest();
        ReceptionProxy receptionProxy=new ReceptionProxy();
        Request request=new Request(1,"book", 13, 24);
        System.out.println("ReceptionRequest");
        receptionRequest.doRequest(request);
        System.out.println("ReceptionProxy");
        receptionProxy.doRequest(request);

    }
}