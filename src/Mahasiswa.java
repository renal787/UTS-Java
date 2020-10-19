public class Mahasiswa extends Penyewa {
    private int nim;
    private String jurusan;

    public Mahasiswa(String nama, int umur, String judul, int waktuSewa, int nim, String jurusan) {
        super(nama, umur, judul, waktuSewa);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
