package universitas;

public class Mahasiswa {
    String npm, nama, prodi;
    
    public Mahasiswa(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public String getNama(){
        return nama;
    }
    public String getNpm(){
        return npm;
    }
    public String getProdi(){
        return prodi;
    }
    public void setNpm (String npm){
        this.npm = npm;
    }
    public void setNama (String nama){
        this.prodi = nama;
    }
    public void setProdi (String prodi){
        this.prodi = prodi;
    }
    
}
