package TPMODULE2_ANPABELT;

public class Perangkat {
    protected String drive;
    protected int ram;
    protected double processor;


    //constructor
    public Perangkat (String drive, int ram, Float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    //method informasi
    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe "+ drive+" dengan ram sebesar "+ ram+ " Gb dan processor secepat "+ processor+ " Ghz ");
    }



}
