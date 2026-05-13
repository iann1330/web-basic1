public class ss {
    public static void main(String[] args) {

        String[] nama = {"Fabian", "Darya", "Tsabitha", "Milla", "Ayu"};
        int[] nilai = {97, 87, 73, 82, 90};

        System.out.println("Nilai siswa:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa " + (i + 1) + 
                               " : " + nama[i] + 
                               " = " + nilai[i]);
        }
    }
}