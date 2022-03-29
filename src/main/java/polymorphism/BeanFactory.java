package polymorphism;

public class BeanFactory {
    public Object getBean(String beanName){
        if(beanName.equals("어쩔")){
            return new 어쩔TV();
        } else if(beanName.equals("저쩔")){
            return new 저쩔TV();
        }

        return null;
    }
}
