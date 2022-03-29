package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("tv")
public class 저쩔TV implements TV{
    @Autowired
    private Speaker speaker;

    public void powerOn(){
        System.out.println("저쩔티비----전원 켜짐");
    }

    public void powerOff(){
        System.out.println("저쩔티비----전원 꺼짐");
    }

    public void volumeUp(){
        speaker.volumeUp();
    }

    public void volumeDown(){
        speaker.volumeDown();
    }
}
