

public class Sampan extends TransportasiAir{
    protected int layar;

    //constructor
    public Sampan (int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi() {
        System.out.println("Transportasi air jenis Sampan dengan kursi berjumlah " + jumlahKursi+ " ditetapkan dengan biaya" + Biaya);
    }
    @Override
    public void berlayar() {
        System.out.println("Transportasi air jenis sampan sedang menggunakan " +layar+" layar" );

    }
    @Override
    public void berlabuh() {
        System.out.println("Transportasi air jenis sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar) {
        System.out.println("Transportasi air jenis sampan berlabuh di pantai menggunakan " + jangkar+ " jangkar");

    }
}
