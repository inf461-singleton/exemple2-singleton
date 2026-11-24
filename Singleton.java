
public final class Singleton {

    private static Singleton instance;
    private int x;
    private int y;
    private int z;

    private Singleton(){
        super();
    }

    private Singleton(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public float moyenne (int x, int y, int Z) {
        return somme(x, y, z) / 3 ;
    }

    public int somme (int x, int y, int z) {
        return x + y + z ;
    }

    public int Produit (int x, int y, int z) {
        return x * y * z;
    }

    public void affiche (int x, int y, int z) {
        System.out.println("Les operations : " + x + " et " + y+" et "+z);
    }
}