import javax.lang.model.type.DeclaredType;

interface Action{
    public void wear();
}

class How implements Action{
    private Action action;
    public How(Action action){
        this.action=action;
    }
    @Override
    public void wear() {
        action.wear();
    }
}
class Step1 extends How {
    public Step1(Action action){
        super(action);
    }
    public void first(){
        System.out.println("先穿内衣");
    }
    @Override
    public void wear() {
        super.wear();
        first();
    }
}

class Step2 extends How{

    public Step2(Action action) {
        super(action);
    }
    public void second(){
        System.out.println("然后T学");
    }

    @Override
    public void wear() {
        super.wear();
        second();
    }
}

class Last extends How{
    public  Last(Action action){
        super(action);

    }
    public void last(){
        System.out.println("最后穿外套");
    }
    public void wear(){
        super.wear();
        last();
    }
}





class Men implements Action{

    @Override
    public void wear() {
        System.out.println("怎么穿");
    }
}




public class test02 {
    public static void main(String[] args) {
        Action action = new Men();
        How how = new Last(new Step2(new Step1(action)));
        how.wear();
    }
}


