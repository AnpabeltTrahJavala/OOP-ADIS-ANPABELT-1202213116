import java.util.Scanner;
public class User {
    public static void main (String[]args){
        System.out.println("Selamat Datang di Restaurant EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("=====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("Nomor: ");
        int nomor = sc.nextInt();

        System.out.println("Registration Succes");
        System.out.println("Nama: "+ nama);
        System.out.println("Phone Number: "+ nomor);

        sc.close();










    }

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
