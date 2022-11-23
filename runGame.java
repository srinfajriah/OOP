import java.util.Scanner;
import myClassMencuri.*;
import java.io.IOException;

public class runGame {
    public static void main (String[] args) throws IOException, InterruptedException{
        cls.clscreen();
        Scanner input = new Scanner(System.in);
        Informasi option = new Informasi();
        tutorial Option = new tutorial();
        partnerKu partner = new partnerKu();

        Header.cetak();
        System.out.println ();
        System.out.println ("Buat Akun Dulu Yuk!\n");
        System.out.print("Masukan Nama\t\t: ");
        String nama = input.next();
        System.out.print("Masukan Jenis Kelamin\t: ");
        String jK = input.next();
        System.out.println ();
        cls.clSpause();
          
        Hero akun = new Hero (nama, jK);
        
        Level level = new Level (1, 1, 100);
        int stamina = level.getStamina();
        int kecepatan = level.getKecepatan();
        int koin = level.getKoin();

        int pilihan, pilihanStore, pilihanPlace, pilihanOpsi,  ulang = 0, counter = 0, beli = 0;;

        do{
            cls.clscreen();
            Header.cetak();
            menu.menuUtama();
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    cls.clscreen();
                    Header.cetak();
                    System.out.println ("\nAkun:");
                    akun.showHero();
                    
                    if (counter != 0){
                        System.out.println ();
                        partner.showPartner();
                    }
                    
                    level.showLevel();
                    Header.baris();
                    cls.clSpause();
                    break;               
                case 2:
                    cls.clscreen();
                    Header.cetak();
                    if (counter == 0){
                        System.out.println ();
                        System.out.println ("Ajak Partner agar Penghasilanmu lebih banyak!!\n");
                        System.out.print("Masukan Nama PartnerMu            : ");
                        String namaPartner = input.next();
                        System.out.print("Masukan Jenis Kelamin PartnerMu   : ");
                        String jKelaminPartner = input.next();
                        System.out.print("Masukan Lama Pengalaman PartnerMu : ");
                        int lamaPengalaman = input.nextInt();

                        partner.setNama(namaPartner);
                        partner.setjKelamin(jKelaminPartner);
                        partner.setlamaMencuri(lamaPengalaman);
                
                        counter++;
                    }else{
                        System.out.println("\nOooopss, kamu sudah punya partner!\n");
                        cls.clSpause();
                    }
                    break; 
                case 3:
                    cls.clscreen();
                    Header.cetak();
                    int jCurian = 0;
                    do{
                        menu.menuBeraksi();
                        pilihanPlace = input.nextInt();
                        if (pilihanPlace == 4){
                            System.out.println ();
                            menu.gameOver();
                            System.exit(0);
                        }else if (pilihanPlace == 1 || pilihanPlace == 2 || pilihanPlace == 3){
                            System.out.println("Ide baguss! Ayo langsung beraksi, ambil sebanyak-banyaknya barang!");
                            System.out.print("Berapa banyak hasil curian? ");
                            jCurian = input.nextInt();

                            jCurian = Level.hasil_curian(jCurian);
                            koin = koin + jCurian;
                            level.setKoin(koin);
                            System.out.print("Melanjutkan aksi? (1. Ya / 2. Tidak): ");
                            ulang = input.nextInt();
                        }
                    }while (pilihanPlace != 0 && ulang != 2);
                    break;
                case 4:
                        do{
                            cls.clscreen();
                            Header.cetak();
                            if (beli == 0){
                                System.out.println("Selamat datang di toko\nHalo! Namaku Cassie! Disini tempat kamu bisa membelanjakan koin\nyang kamu temukan untuk mendapatkan perkakas dan peningkatan.\nSilahkan melihat-lihat jika ada yang kamu suka.");
                                beli++;
                            }
                            menu.menuToko();
                            pilihanStore = input.nextInt();
                            System.out.println ();

                            if (pilihanStore == 1){
                                cls.clscreen();
                                Header.cetak();
                                IAbility.menuAbility();

                                System.out.print("Mau beli apa\t: ");
                                int x = input.nextInt();
                                System.out.print("Berapa banyak\t: ");
                                int c = input.nextInt();

                                IAbility kemampuan = new IAbility();
                                koin = koin - (kemampuan.getHarga(x) * c);
                                level.setKoin(koin);

                                if (x == 2){
                                    stamina = stamina +  c;
                                    level.setStamina(stamina);
                                }else if (x == 4){
                                    kecepatan = kecepatan + c;
                                    level.setKecepatan(kecepatan);
                                }
                                cls.clSpause();
                            }
                            else if (pilihanStore == 2){
                                cls.clscreen();
                                Header.cetak();
                                IUtibility.menuUtibility();

                                System.out.print("Mau beli apa\t: ");
                                int y = input.nextInt();
                                System.out.print("Berapa banyak\t: ");
                                int b = input.nextInt();

                                IUtibility utibilitas = new IUtibility();
                                koin = koin - (utibilitas.getHarga(y) * b);
                                level.setKoin(koin);
                                cls.clSpause();
                            }
                            else if (pilihanStore == 3){
                                cls.clscreen();
                                Header.cetak();
                                ICostum.menuCostum();

                                System.out.print("Mau beli apa\t: ");
                                int z = input.nextInt();
                                System.out.print("Berapa banyak\t: ");
                                int a = input.nextInt();
                                
                                ICostum kostum = new ICostum();
                                koin = koin - ( kostum.getHarga(z) * a);
                                level.setKoin(koin);
                                cls.clSpause();
                            }
                            else if (koin < 0) {
                                cls.clscreen();
                                System.out.println("\n\n===============Game Over===============\n\n");
                                cls.clSpause();
                                System.exit(0);
                            }
                        }while (pilihanStore != 0 &&  koin < 0);
                        break;
                    case 5:
                        do{
                            cls.clscreen();
                            Header.cetak();
                            menu.menuOpsi();
                                
                            pilihanOpsi = input.nextInt();

                            if (pilihanOpsi == 1){
                                option.information();
                            }
                            else if (pilihanOpsi == 2){
                                Option.information();
                            }
                            cls.clSpause();
                        } while (pilihanOpsi != 0);
                        break;
                    }
        }while (pilihan != 0);
    }
}