public class Penyewa {
    private String nama;
    private int umur;
    private String judul;
    private int waktuSewa;

    int personCounter = 0;

    public Penyewa(String nama, int umur, String judul, int waktuSewa) {
        this.nama = nama;
        this.umur = umur;
        this.judul = judul;
        this.waktuSewa = waktuSewa;
        personCounter++;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getWaktuSewa() {
        return waktuSewa;
    }

    public void setWaktuSewa(int waktuSewa) {
        this.waktuSewa = waktuSewa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Penyewa{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                ", judul='" + judul + '\'' +
                ", waktuSewa=" + waktuSewa +
                '}';
    }
}
