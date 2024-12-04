// 12S24011- Pedro Simangunsong
// 12S24041 - Nikah Suchia Panjaitan
import java.util.*;
import java.lang.Math;

public class T06{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];
        String siswa;
        int i;

        siswa = "";
        i = 0;
        members(nama, i);
        room(nama, siswa, i);
    }
    
    public static void members(String[] nama, int i) {
        do {
            for (i = 0; i <= 3; i++) {
                nama[i] = input.nextLine();
                if (nama[i].equals("---")) {
                    i = 4;
                }
            }
        } while (i == 0);
    }
    
    public static void room(String[] nama, String siswa, int i) {
        do {
            if (nama[i].equals("---")) {
                siswa = nama[i];
                i = 4;
            } else {
                System.out.println(nama[i]);
                i = i + 1;
            }
        } while (i < 4);
    }
    
    public static void value(String siswa, int i, int k) {
        i = 0;
        k = 0;
        siswa = "";
        i = k;
    }
}
