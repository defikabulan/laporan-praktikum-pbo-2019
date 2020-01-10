package unittest;

import org.junit.Assert;
import org.junit.Test;

public class MessageProcessorTest1841720098Bulan {
    MessageProcessor1841720098Bulan mProcessor;
    public MessageProcessorTest1841720098Bulan(){
        mProcessor=new MessageProcessor1841720098Bulan();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("Whats up Bro?");
    }
    
    @Test
    public void testShowMessageBulan(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows: Whats up bro?";
       Assert.assertEquals(expectedResult,mProcessor.messageFormatBulan());
       }
}
