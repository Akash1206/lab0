/**
 * Created by HP on 21-07-2016.
 */
public class AnotherClient implements CallBack {
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is : " + (p*p));
    }

    public void bc(){
        System.out.println("behenchod");
    }
}
