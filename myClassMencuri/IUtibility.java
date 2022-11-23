package myClassMencuri;

public class IUtibility implements toko{
    public static int hargaa;

    public static void menuUtibility(){
        System.out.println ("Utibility/Utibilitas\n");
        System.out.println ("1. Donat beracun (buat penjaga tidak berdaya) - 30");
        System.out.println ("2. Mainan putar (gangguan berisik) - 30");
        System.out.println ("3. Ramuan (membuat tak terlihat) - 100");
        System.out.println ("4. Pembuat kebisingan (cara pasti untuk menarik perhatian) - 50");
        System.out.println ("0. Keluar\n"); 
    }
    
    public int getHarga(int x){
        if (x == 1){
            hargaa = 30;
        }
        else if (x == 2){
            hargaa = 30;
        }
        else if (x == 3){
            hargaa = 100;
        }
        else if (x == 4){
            hargaa = 50;
        }
        return hargaa;
    }
}
