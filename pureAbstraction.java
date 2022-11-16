package OOPs;
interface animal{
    public void walk();
    
}
interface  herbibore{

}
class lion implements animal,herbibore{
   public void walk(){
        System.out.println("Walks on 4 legs");
    }

}
public class pureAbstraction {
    public static void main(String[] args) {
        lion h21 = new lion();
        h21.walk();
        
    }
}
