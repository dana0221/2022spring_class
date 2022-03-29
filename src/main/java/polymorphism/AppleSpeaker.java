package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{
    public AppleSpeaker() {
        System.out.println("===> AppleSpeaker 객채 생성");
    }

    @Override
    public void volumeUp() {
        System.out.println("AppleSpeaker---소리 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("AppleSpeaker---소리 내림");
    }
}
