public class BasicPhone implements Calling, Sending{
    @Override
    public void makeCall(String number){
        System.out.println("Make a call");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending Message");
    }
}
