
public abstract class Manusia {
    private String Nama;
    private int Umur;
    private String Pekerjaan;
    
    public abstract void CetakIdentitas();
    
    public int getUmur(){
        return Umur;
    }
    
    public void setUmur(int Umur){
        this.Umur=Umur;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama=Nama;
    }
    
    public String getPekerjaan(){
        return Pekerjaan;
    }
    
    public void setPekerjaan(String Pekerjaan){
        this.Pekerjaan=Pekerjaan;
    }
}
