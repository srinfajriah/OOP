package myClassMencuri;

public class ICostum implements toko{
    public static int hargaa;

    public static void menuCostum(){
        System.out.println ("\nCostum/Kostum\n");
        System.out.println ("1. Jas bergaya (Untuk maling berkelas) - 500 koin");
        System.out.println ("2. Pakaian kelinci (terlihat sangat bod*h) - 1000 koin");
        System.out.println ("3. Baju baja kesatria (Perlindungan kuat) - 2000");
        System.out.println ("4. Pakaian super bob (memiliki jubah yang gagah) - 4000\n");
    }

    public int getHarga(int x){
        if (x == 1){
            hargaa = 500;
        }
        else if (x == 2){
            hargaa = 1000;
        }
        else if (x == 3){
            hargaa = 2000;
        }
        else if (x == 4){
            hargaa = 4000;
        }
        return hargaa;
    }
}
