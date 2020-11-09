//Carens Kurniawan Wijaya
//NIM 672019084

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Fakultas f;
        Dosen d;
        StaffTU s;
        // silahkan dilanjutkan
        f=new Fakultas();
        do{
            System.out.println("Data Fakultas");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tambah Data StaffTU");
            System.out.println("3. Lihat Semua Data");
            System.out.println("4. Exit");
            System.out.print("Pilihan: ");pilihan=sc.nextInt();
            System.out.println("");
            switch(pilihan)
            {
                case 1:
                    d=new Dosen();
                    System.out.print("Masukkan Nama Dosen: ");d.setNama(sc.next());
                    System.out.print("Masukkan Umur Dosen: ");d.setUmur(sc.nextInt());
                    System.out.print("Masukkan Jumlah SKS: ");d.sks=sc.nextInt();
                    f.addDosen(d);
                    System.out.println("");
                    break;
                case 2:
                    s=new StaffTU();
                    System.out.print("Masukkan Nama Staff: ");s.setNama(sc.next());
                    System.out.print("Masukkan Umur Staff: ");s.setUmur(sc.nextInt());
                    System.out.print("Masukkan Pekerjaan : ");s.setPekerjaan(sc.next());
                    f.addStaff(s);
                    System.out.println("");
                    break;
                case 3:
                    f.CetakDosen();
                    System.out.println("");
                    f.CetakStaff();
                    System.out.println("");
                    break;
                case 4:break;
            }
        }while(pilihan!=4);
    }
}
