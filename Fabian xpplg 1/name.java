public class name {
    public static void main(String[] args) {

        String[][] siswa = {

            // kolom 0      // kolom 1
            {"Fabian", "10 RPL 3"}, // baris 0
            {"Sabita", "10 RPL 4"}, // baris 1
            {"Eva", "10 RPL 1"},
            {"Nael", "10 RPL 2"}
        };

        System.out.println("Data siswa:");

        for (int i = 0; i < siswa.length; i++) {
            System.out.println(siswa[i][0] + " - " + siswa[i][1]);
        }

        // Mengubah kelas Eva
        siswa[2][1] = "11 RPL 2";

        System.out.println("\nSetelah diubah:");
        System.out.println(siswa[2][0] + " - " + siswa[2][1]);
    }
}