public class Test03 {
    public static void main(String[] args) {
        Humberger humberger = new ChickenBurger();
        System.out.println(humberger.name);
        Condiment condiment = new Lettuce(humberger);
        System.out.println(condiment.getName()+condiment.getPrice());
        Condiment condiment1 = new Lettuce1(humberger);
        System.out.println(condiment1.getName()+condiment1.getPrice());

        Condiment condiment2 = new Lettuce1(condiment1);
        System.out.println(condiment2.getName()+condiment2.getPrice());
    }
}

abstract class Humberger{
    protected String name;
    public String getName(){
        return name;
    }
    public abstract int getPrice();
}

class ChickenBurger extends Humberger{
    public ChickenBurger(){
        name ="鸡腿堡";
    }
    @Override
    public int getPrice() {
        return 10;
    }
}

abstract class Condiment extends Humberger {

    public abstract String getName();
}
class Lettuce extends Condiment{
    Humberger humberger;
    public Lettuce(Humberger humberger){
        this.humberger = humberger;
    }
    @Override
    public int getPrice() {
        return humberger.getPrice()+5;
    }

    @Override
    public String getName() {
        return humberger.getName()+"加生菜";
    }
}



class Lettuce1 extends Condiment{
    Humberger humberger;
    public Lettuce1(Humberger humberger){
        this.humberger = humberger;
    }
    @Override
    public int getPrice() {
        return humberger.getPrice()+5;
    }

    @Override
    public String getName() {
        return humberger.getName()+"加生菜1";
    }
}


