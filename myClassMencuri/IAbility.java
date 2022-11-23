package myClassMencuri;

public class IAbility implements toko{
    public static int hargaa;

    public static void menuAbility (){
        System.out.println ("\nAbility/Kemampuan\n");
        System.out.println ("1. Diam-diam (tetap senyap dan gerak cepat) - 20");
        System.out.println ("2. Stamina (Buat kamu berlari lebih jauh!) - 20");
        System.out.println ("3. Kemampuan mencomot (akan membuat mu lebih hebat)- 20");
        System.out.println ("4. Kecepatan - 20");
        System.out.println ("0. Keluar\n");
    }
    
    public int getHarga(int x) {
        hargaa = 20;
        return hargaa;
    }
}
