public class Samsung implements Calling, Sending, Picture, Browsing {
    @Override
    public void makeCall(String number){
        System.out.println("Make a call");
    }
    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending Message");
    }

    @Override
    public void takePicture(){
        System.out.println("Taking Picture");
    }
    @Override
    public void browseWeb(String url){
        System.out.println("Browsing Web");
    }
}
