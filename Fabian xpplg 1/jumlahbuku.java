public class jumlahbuku {
    public class JumlahBuku {
    public static void main(String[] args) {

        // Membuat array jumlah buku di tiap rak
        int[] buku = {120, 85, 95, 110, 75};

        // Menampilkan jumlah buku sebelum perubahan
        System.out.println("Jumlah buku di setiap rak (sebelum perubahan):");
        for (int i = 0; i < buku.length; i++) {
            System.out.println("Rak " + (i + 1) + ": " + buku[i]);
        }

        // Mengubah jumlah buku di rak ketiga (indeks 2)
        buku[2] = 100;

        // Menampilkan jumlah buku setelah perubahan
        System.out.println("\nJumlah buku di setiap rak (setelah perubahan):");
        for (int i = 0; i < buku.length; i++) {
            System.out.println("Rak " + (i + 1) + ": " + buku[i]);
        }
    }
}
}
