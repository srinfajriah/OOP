package myClassMencuri;

public class menu {

    public static void menuUtama(){
        System.out.println ("1. Lihat Akun / Partner");
        System.out.println ("2. Tambah Partner");
        System.out.println ("3. Mulai Beraksi");
        System.out.println ("4. Toko");
        System.out.println("5. Informasi\n");

        System.out.print("Pilihan Anda: ");
    }

    public static void menuBeraksi(){
        System.out.println("\nDimana kita akan beraksi hari ini?\n");
        System.out.println ("1. Pinggiran kota");
        System.out.println ("2. Pusat Kota");
        System.out.println ("3. Lab Rahasia");
        System.out.println ("4. Penjara");
        System.out.println ("0. Keluar\n");

        System.out.print("Pilihan Anda: ");
    }

    public static void menuToko(){
        System.out.println ("\nMembeli Item akan Membuat Kamu lebih Hebat dalam Mencuri!\n");
        System.out.println ("1. Ability");
        System.out.println ("2. Utibility");
        System.out.println ("3. Costume");
        System.out.println ("0. Keluar\n");

        System.out.print("Pilihan Anda: ");       
    }

    public static void menuOpsi(){
        System.out.println ("\nKetahui lebih banyak tentang game ini!\n");
        System.out.println ("1. Option");
        System.out.println ("2. Tutorial");
        System.out.println ("0. Keluar\n");

        System.out.print("Pilihan Anda: ");
    }

    public static void gameOver(){
        System.out.println("\n\n=======================================================\n\n");
        System.out.println("           KAMU TERTANGKAP POLISI. PERMAINAN BERAKHIR          ");
        System.out.println("\n\n======================= GAME OVER ======================\n\n\n");      
    }
}
