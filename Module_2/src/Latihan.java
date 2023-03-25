import java.util.ArrayList;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        for (int i = 0; i < hewan.size(); i++) {
            System.out.println(1+i+". "+hewan.get(i));
        }
        boolean a = true;
        while(a) {
            Scanner input = new Scanner(System.in);
            Scanner keluar = new Scanner(System.in);
            System.out.println("\nMasukkan urutan hewan yang ingin dihapus : ");
            int hapus = input.nextInt();
            hewan.remove(hapus-1);
            for (int i = 0; i < hewan.size(); i++) {
                System.out.println(1+i+". "+hewan.get(i));
            }
            System.out.println("\nInput y untuk keluar");
            String out = keluar.nextLine();
            if (out.equals("y")){
                a = false;
            }
        }
    }
}
