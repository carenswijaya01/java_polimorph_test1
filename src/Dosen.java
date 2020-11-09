
public class Dosen extends Manusia implements Karyawan{
    public int sks;
    
    Dosen(){
        super.setPekerjaan("Dosen");
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
        System.out.println("Gaji        :"+(sks*250000));
    }
}
