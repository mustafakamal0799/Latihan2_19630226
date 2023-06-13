package universitas;

public class Mahasiswa {
    String npm, nama, prodi;
    
    public Mahasiswa(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public void setNPM (String npm){
        this.npm = npm;
    }
    public void setNama (String nama){
        this.prodi = nama;
    }
    public void setProdi (String prodi){
        this.prodi = prodi;
    }
}
