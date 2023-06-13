package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa kamal = new Mahasiswa("19630226","Mustafa Kamal", "TI");
        
        System.out.println("Nama : "+kamal.getNama());
        System.out.println("NPM : "+kamal.getNpm());
        System.out.println("Prodi : "+kamal.getProdi());
    }
}
