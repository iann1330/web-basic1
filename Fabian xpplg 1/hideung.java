public class hideung {

    // Method tanpa parameter
    static void salam() {
        System.out.println("Halo, Selamat Datang!");
    }

    // Method dengan parameter
    static void nama(String nama) {
        System.out.println("Nama saya " + nama);
    }

    // Method dengan nilai balik
    static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Memanggil method
        salam();

        nama("Fabian");

        int hasil = tambah(5, 3);
        System.out.println("Hasil penjumlahan = " + hasil);
    }
}