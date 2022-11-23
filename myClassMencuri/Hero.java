package myClassMencuri;

public class Hero{
        String nama;
        String jeniSkelamin;
        
        public Hero(){};
        
        public Hero (String name, String jKelamin) {
            this.nama = name;
            this.jeniSkelamin = jKelamin;
        }

        public void  setNama (String nama){
            this.nama = nama;
        }
        public void  setjKelamin (String jenisK){
            this.jeniSkelamin = jenisK;
        }

        public String getName() {
            return nama;
        }
        public String getjKelamin() {
            return jeniSkelamin;
        }
       
        public void showHero(){
            System.out.println("Nama            : " + getName());
            System.out.println("Jenis Kelamin   : " + getjKelamin());
        }
}
