import javax.lang.model.type.DeclaredType;

interface Human{
    public void wearClothes();
    public void walkToWhere();
}
//装饰者
 abstract class Decorater implements Human{
    private Human human;
    public Decorater(Human human){
        this.human=human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }

}
class Decorater_1 extends Decorater{
    public Decorater_1(Human human){
        super(human);
    }
    public void goHome(){
        System.out.println("进房子");
    }
    public void findMap(){
        System.out.println("找map");
    }
    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
class Decorater_2 extends Decorater{
    public Decorater_2(Human human){
        super(human);
    }
    public void goClothespress(){
        System.out.println("去衣柜看看");
    }
    public void findPlaceOnMap(){
        System.out.println("在map上找找");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findPlaceOnMap();
    }
}



class Decorater_3 extends Decorater{
    public Decorater_3(Human human){
        super(human);
    }
    public void findClothes(){
        System.out.println("找到衣服");
    }
    public void findTaget(){
        System.out.println("找到目标");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTaget();
    }
}


//被装饰者，被装饰者初始状态有自己的装饰
class Person implements Human{

    @Override
    public void wearClothes() {
        System.out.println("穿什么");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里");
    }
}


public class Test {

    public static void main(String[] args) {
        Human human = new Person();
        Decorater decorater = new Decorater_3(new Decorater_2(new Decorater_1(human)));
        decorater.wearClothes();
//        decorater.walkToWhere();
    }
}
