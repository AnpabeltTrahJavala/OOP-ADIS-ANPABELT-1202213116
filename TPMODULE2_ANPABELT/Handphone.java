package TPMODULE2_ANPABELT;

public class Handphone extends Perangkat {
    protected boolean fingerprint;
    //constructor
    public Handphone (String drive, int ram, Float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = false;
    }

     //overriding method informasi
     @Override
     public void informasi(){
        if (fingerprint == true){
            System.out.println("Handphone ini memiliki drive tipe "+ drive+" dengan ram sebesar "+ ram + " GB dan processor secepat "+ processor+ " Ghz. Selain itu, Handphone ini juga memiliki fingerprint ");
        }
        else{
            System.out.println("Handphone ini memiliki drive tipe "+ drive+" dengan ram sebesar "+ ram+ " GB dan processor secepat "+ processor+ " Ghz. Selain itu, Handphone ini TIDAK memiliki fingerprint ");

        }
     }
 
     
     public void telfon (int no_hp){
         System.out.println("Handphone berhasil menyambungkan telfon ke "+ no_hp);
     }
 
     public void kirimSMS (int no_hp1){
         System.out.println("Handphone berhasil mengirim SMS ke "+ no_hp1);
     }
 
     public void kirimSMS1 (int no_hp2, int no_hp3){
         System.out.println("Handphone berhasil mengirim SMS ke no "+ no_hp2 + " dan ke no " + no_hp3);
     }


    
}
