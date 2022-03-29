package polymorphism;

public class 어쩔TV implements TV {
    private Speaker speaker;
    private int price;

    public 어쩔TV() {
        System.out.println("====> 어쩔티비 객체 생성");
    }

    public void setSpeaker(Speaker speaker) {
        System.out.println("====> setSpeaker() 호출");
        this.speaker = speaker;
    }

    public void setPrice(int price) {
        System.out.println("====> setPrice() 호출");
        this.price = price;
    }

    public 어쩔TV(Speaker speaker) {
        System.out.println("====> 어쩔티비 객체 생성(2)");
        this.speaker = speaker;
    }

    public 어쩔TV(Speaker speaker, int price) {
        System.out.println("====> 어쩔티비 객체 생성(3)");
        this.speaker = speaker;
        this.price = price;
    }

    @Override
    public void powerOn(){
        System.out.println("어쩔티비----전원 켜짐(가격 : " + price + "원)");
    }

    @Override
    public void powerOff(){
        System.out.println("어쩔티비----전원 꺼짐");
    }

    @Override
    public void volumeUp(){
        speaker.volumeUp();
    }

    @Override
    public void volumeDown(){
        speaker.volumeDown();
    }
}
