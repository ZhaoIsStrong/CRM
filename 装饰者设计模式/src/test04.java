public class test04 {
    public static void main(String[] args) {
        Interf interf  = new Persons();
        Up up = new D(new C(new B(interf)));
        up.action();
    }
}

interface Interf{
    public void action();
}

abstract  class Up implements Interf{
    private Interf interf;
    public Up(Interf interf){
        this.interf=interf;
    }
    @Override
    public void action() {
        interf.action();
    }
}


class B extends Up{

    public B(Interf interf) {
        super(interf);
    }
    public void b(){
        System.out.println("B");
    }

    @Override
    public void action() {
        super.action();
        b();
    }
}
class C extends Up{

    public C(Interf interf) {
        super(interf);
    }
    public void c(){
        System.out.println("C");
    }
    public void action(){
        super.action();
        c();
    }
}

class D extends Up{
    public D(Interf interf){
        super(interf);
    }
    public void d(){
        System.out.println("D");
    }
    public void action(){
        super.action();
        d();
    }
}
class Persons implements Interf{

    @Override
    public void action() {
        System.out.println("A");
    }
}
