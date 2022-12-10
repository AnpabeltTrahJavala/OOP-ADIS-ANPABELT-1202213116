
public class MainApp {
    public static void main(String[] args) throws Exception {

        System.out.println("Class Tidak diketahui");

        TransportasiAir transportasiAir = new TransportasiAir(24, 100000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();
        System.out.println("Class Kapal");

        Kapal kapal = new Kapal(24, 100000, "diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlabuh();
        kapal.berlayar(20);
        System.out.println("");

        System.out.println("Class Sampan");

        Sampan sampan = new Sampan(25, 100000, 3);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(3);
    }
}
