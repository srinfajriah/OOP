package myClassMencuri;

public class partnerKu extends Hero{
    int lamaMencuri;

    public partnerKu(){};

    public partnerKu (String nama, String jkelamin, int lamaMencuri){
        super (nama, jkelamin);
        this.lamaMencuri = lamaMencuri;
    }
    
    public void  setlamaMencuri (int lamamencuri){
        this.lamaMencuri = lamamencuri;
    }
    public int getlamaMencuri(){
        return lamaMencuri;
    }

    public void showPartner(){
        System.out.println ("Partner:");
        super.showHero();
        System.out.println("Lama Mencuri    : " + getlamaMencuri() + " tahun\n");
    }
}
