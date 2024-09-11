import java.util.Scanner;

public class TugasPertnyaanNo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jam kerja: ");
        int jmKerja = input.nextInt();
        System.out.println("upah per jam: ");
        int Uph = input.nextInt();
        int total = jmKerja * Uph;
        double bonus = total * 0.10;
        double GajiBonus = total + bonus;
        double pajak = GajiBonus * 0.5;
        double Final = GajiBonus - pajak;
        System.out.println("Gaji Karyawan perjam: " + Final);
        System.out.println("Berapa bulan: ");
        int buln = input.nextInt();
        double totalBul = buln * 30;
        double Finaly = totalBul * Final;
        System.out.println("Gaji karyawan selama: " + buln + " Bulan ");
        System.out.println("Adalah: " + Finaly);
    }
}