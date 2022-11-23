package myClassMencuri;

public class Level {
    int stamina;
    int kecepatan;
    int koin;
    
    public Level(){};

    public Level (int stmna, int kcptn, int coin){
        this.stamina = stmna;
        this.kecepatan = kcptn;
        this.koin = coin;
    }

    //menghitung hasil curian
    public static int hasil_curian (int x){
        int total = 0;
            total = total + (x * 10);
        return total;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    public int getStamina() {
        return stamina;
    }
    public int getKoin() {
        return koin;
    }

    public void setKoin(int myKoin) {
        this.koin = myKoin;
    }
    public void setStamina(int stmna) {
        this.stamina = stmna;
    }
    public void setKecepatan(int kcptn) {
        this.stamina = kcptn;
    }

    public void showLevel(){
    System.out.println("Level Stamina   : " + getStamina());
    System.out.println("Level Kecepatan : " + getKecepatan());
    System.out.println("Sisa Koin       : " + getKoin());
    }
}
