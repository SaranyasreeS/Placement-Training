import java.util.*;
class Sarees{
    void saree(){
        System.out.println("Yes, Wait a minute we will check the stocks ");
        System.out.println("Actually we have limited stocks of sarees");
    }
}
class SilkSarees extends Sarees{
    void silksaree(){
        saree();
        System.out.println("Yeah, We have silk sarees");
    }
}
class AariWorkedSarees extends SilkSarees{
    void aariworkedsaree(){
        silksaree();
        System.out.println("Yes, Aari worked saree is available");
    }
}
public class Saree {
    public static void main(String[] args){
        AariWorkedSarees s1 = new AariWorkedSarees();
        System.out.println("Hello, I want aari worked saree...");
        s1.aariworkedsaree();
        System.out.println("Thank you! 😊");
    }
}
