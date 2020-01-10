package unittest;
public class MessageProcessor1841720098Bulan {

  private String sender, recipient, message;

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public String messageFormatBulan(){
        String message =String.format("Hai %s, you have message from %s.\nThe message as follows : %s",
                this.recipient,this.sender,this.message);
        return message;
    }
    
    public void showMessage(){
        System.out.println(messageFormatBulan());
    }
}
