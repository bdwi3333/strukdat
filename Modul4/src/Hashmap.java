import java.util.Scanner;
import java.util.HashMap;

public class Hashmap {
    String nama, kelas, matkulprakikum;
    int nim;
    public Hashmap(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulprakikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Hashmap> mhs = new HashMap<>();
        mhs.put("1", new Hashmap("Putri", "3H", "Struktur Data", 2021103));
        mhs.put("2", new Hashmap("Agus", "3A", "Matematika", 2021104));
        mhs.put("3", new Hashmap("Arro", "3D", "Pemrograman", 2021105));
        System.out.print("Masukkan ID: ");
        String input = in.nextLine();
        Hashmap data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + " Kelas : " + data.kelas + " Matkul Prakikum : " + data.matkulprakikum + ", NIM : " + data.nim);
        }
    }
}
