

public class Kapal extends TransportasiAir{
    protected String mesin;

    //constructor
    public Kapal (int jumlahKursi, int Biaya, String mesin){
        super (jumlahKursi, Biaya);
        this.mesin = mesin;

    }

    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah " + jumlahKursi+ " ditetapkan dengan biaya sebesar " + Biaya );
    }

    @Override
    public void berlayar() {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin " + mesin+ " dengan kecepatan yang tidak stabil" );
    }
    @Override
    public void berlabuh() {
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai" );

    }
    public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin " + mesin+ " dengan kecepatan " + kecepatan+ " knot" );

    }
    
}
