import java.util.Scanner;

public class ATMB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di ATM ABC");
        System.out.println("Rekening : ");
        String nomorAkun = scanner.nextLine();
        System.out.println("PIN : ");
        String pin = scanner.nextLine();

        int saldo = 0;
        boolean keluar = false;

        while (!keluar) {
            System.out.println("Menu :");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Tarik saldo");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp. " + saldo);
                    break;
                case 2:
                    System.out.println("Masukkan jumlah uang untuk dideposit");
                    int jumlahDeposit = scanner.nextInt();
                    saldo += jumlahDeposit;
                    System.out.println("Deposit berhasil. Saldo anda: Rp.  " + saldo);
                    break;
                case 3:
                    System.out.println("Masukkan jumlah uang untuk ditarik");
                    int jumlahTarik = scanner.nextInt();
                    if (jumlahTarik > saldo) {
                        System.out.println("Saldo anda tidak cukup");
                    } else {
                        saldo -= jumlahTarik;
                        System.out.println("Tarik saldo berhasil. Saldo anda: Rp. " + saldo);
                    }
                    break;
                case 4:
                    keluar = true;
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        }

        System.out.println("Terima kasih telah menggunakan ATM ABC. Sehat selalu :)");
    }
}