import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        int pilihan1;
        int pilihan2;
        int biayaSewa = 0;

        Penyewa[] p = new Penyewa[5];
        p[0] = new Penyewa("Steve", 19, "Memory", 5);
        p[1] = new Mahasiswa("Rian", 18, "Pegasus", 6, 82520001, "SI");
        p[2] = new Dosen("Budi", 31, "Information Technology", 12, 43352323, "FTI");
        p[3] = new Penyewa("Ronnie", 20, "Harry Potter", 8);
        p[4] = new Penyewa("George", 23, "Holy Mother", 13);

        Scanner in = new Scanner(System.in);
        System.out.println("Penyewaan Buku Untarian");
        System.out.println("1.Sewa Buku");
        System.out.println("2.Lihat Daftar Penyewa");
        System.out.print("Masukan Pilihan [1/2]: ");
        int pilihan3 = in.nextInt();
        if (pilihan3 == 1) {
            System.out.print("Masukan nama: ");
            String nama = in.nextLine();
            nama = in.nextLine();

            System.out.print("Masukan umur: ");
            int umur = in.nextInt();

            System.out.print("Masukan judul buku: ");
            String judul = in.nextLine();
            judul = in.nextLine();

            System.out.print("Berapa lama pinjam buku ? ");
            int waktuSewa = in.nextInt();

            Penyewa person1 = new Penyewa(nama, umur, judul, waktuSewa);

            System.out.println("Apakah Untarian ? ");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            pilihan1 = in.nextInt();
            switch (pilihan1) {
                case 1:
                    System.out.println("Status : ");
                    System.out.println("1. Mahasiswa");
                    System.out.println("2. Dosen");
                    pilihan2 = in.nextInt();
                    switch (pilihan2) {
                        case 1:
                            System.out.print("Masukan NIM: ");
                            int nim = in.nextInt();
                            System.out.print("Masukan jurusan: ");
                            String jurusan = in.nextLine();
                            jurusan = in.nextLine();
                            biayaSewa = person1.getWaktuSewa()*2500;
                            break;
                        case 2:
                            System.out.print("Masukan NIDN: ");
                            int nidn = in.nextInt();
                            System.out.print("Masukan fakultas: ");
                            String fakultas = in.nextLine();
                            fakultas = in.nextLine();
                            biayaSewa = person1.getWaktuSewa()*2000;
                            break;
                    }
                    break;

                case 2:
                    biayaSewa = person1.getWaktuSewa()*3000;
                    break;
            }
            System.out.println(person1.toString());
            System.out.println("Biaya sewa selama " + person1.getWaktuSewa() + " hari : " + biayaSewa);
        } else if (pilihan3 == 2) {
            for (int i=0; i<5; i++) {
                System.out.println(p[i].toString());
            }
        } else {
            System.out.println("Error!"); }
    }
}