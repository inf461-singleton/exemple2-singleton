
public final class Singleton {

    private static Singleton instance;
    public int x;
    public int y;

    private Singleton(){
        super();
    }

    private Singleton(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public float moyenne (int x, int y) {
        return somme(x, y) / 2 ;
    }

    public int somme (int x, int y) {
        return x + y ;
    }

    public int Produit (int x, int y) {
        return x * y ;
    }

    public void affiche () {
        System.out.println("Les operations : " + this.x + " et " + this.y);
    }
}