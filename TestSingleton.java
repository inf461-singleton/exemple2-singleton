public class TestSingleton {

    public static void main(String[] args){
        int som = Singleton.getInstance().somme(4, 8, 7);
        int prod = Singleton.getInstance().Produit(4, 8, 7);
        float moy = Singleton.getInstance().moyenne(4, 8, 7);
        System.out.println("la somme est de : " +som);
        System.out.println("le produit est de : " +prod);
        System.out.println("la moyenne est de : " +moy);

        Singleton s1 = Singleton.getInstance();
        // System.out.println(s1);
        s1.affiche(4, 8, 7);
    }
}