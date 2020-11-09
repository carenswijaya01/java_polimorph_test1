
public class StaffTU extends Manusia implements Karyawan {
    public int gaji;
    StaffTU(){
        gaji=3000000;
    }

    public void CetakIdentitas() {
        System.out.println("Nama        :"+super.getNama());
        System.out.println("Umur        :"+super.getUmur());
        System.out.println("Pekerjaan   :"+super.getPekerjaan());
        this.CetakSlipGaji();
    }

    public String DetailPekerjaan() {
        return super.getPekerjaan();
    }

    public void CetakSlipGaji() {
        System.out.println("Gaji        :"+gaji);
    }
}
