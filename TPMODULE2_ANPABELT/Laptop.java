package TPMODULE2_ANPABELT;

public class Laptop extends Perangkat {
    protected boolean webcam;

    //constructor
    public Laptop (String drive, int ram, Float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = true ;

    }

    //overriding method informasi
    @Override
    public void informasi(){
        if (webcam == true){
            System.out.println("Laptop ini memiliki drive tipe "+ drive+" dengan ram sebesar "+ ram+ " Gb dan processor secepat "+ processor+ " Ghz. Selain itu, Laptop ini juga memiliki webcam ");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe "+ drive+" dengan ram sebesar "+ ram+ " Gb dan processor secepat "+ processor+ " Ghz. Selain itu, Laptop ini TIDAK memiliki webcam ");

        }

        
    }

    
    public void bukaGame (String nama_game){
        System.out.println("Laptop berhasil membuka game "+ nama_game);
    }

    public void kirimEmail (String email){
        System.out.println("Laptop berhasil mengirim email ke "+ email);
    }

    public void kirimEmail2 (String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke "+ email1 + " dan " + email2);
    }

}
