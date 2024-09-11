import java.util.Scanner;

public class TugasPertnyaanNo1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah penggunaan listrik (dalam kWh): ");
        double kWh = scanner.nextDouble();
        
        
        final double TARIF_PER_KWH = 1500.0;
        
        
        double totalTagihan = kWh * TARIF_PER_KWH;
        
        
        boolean melebihi500Kwh = kWh > 500;
        boolean tdkMelebihi = 500 > kWh;
        
        System.out.println("Total tagihan listrik adalah: Rp " + totalTagihan);
        System.out.println("Melebihi batas penggunaan: " + melebihi500Kwh);
        System.out.println("Tidak melebihi batas: " + tdkMelebihi);
    }
}
