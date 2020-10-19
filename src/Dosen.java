public class Dosen extends Penyewa {
    private int nidn;
    private String fakultas;

    public Dosen(String nama, int umur, String judul, int waktuSewa, int nidn, String fakultas) {
        super(nama, umur, judul, waktuSewa);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
