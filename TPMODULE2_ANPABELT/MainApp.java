package TPMODULE2_ANPABELT;
public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat device = new Perangkat("Sata", 4, (float) 3.5);
        device.informasi();
        System.out.println(" ");

        Laptop notebook = new Laptop("Sandisk", 16, (float) 4.0, false);
        notebook.informasi();
        notebook.bukaGame("Dota2");
        notebook.kirimEmail("patraspensa@gmail.com");
        notebook.kirimEmail2("pabeltganteng@gmail.com", "patraspensa@gmail.com");
        System.out.println(" ");

        Handphone hp = new Handphone("Seagate", 8, (float) 4.5, false);
        hp.informasi();
        hp.telfon(628121222);
        hp.kirimSMS(62718391);
        hp.kirimSMS1(62354526, 623554539);
        System.out.println(" ");

    
    


    }
}
