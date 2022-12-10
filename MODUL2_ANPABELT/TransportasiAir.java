

public class TransportasiAir {
    protected int jumlahKursi;
    protected int Biaya;

    //constructor
    public TransportasiAir(int jumlahKursi, int Biaya){
        this.jumlahKursi = jumlahKursi;
        this.Biaya = Biaya;

    }
    //method
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah " + jumlahKursi+   " ditetapkan dengan biaya sebesar " + Biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis tidak diketahui berlabuh");
    }



        
    
}
