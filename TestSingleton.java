public class TestSingleton {

    public static void main(String[] args){
        int som = Singleton.getInstance().somme(4, 8);
        System.out.println("la somme est de : " +som);

        Singleton s1 = Singleton.getInstance();
        // System.out.println(s1);
        s1.affiche();
    }
}