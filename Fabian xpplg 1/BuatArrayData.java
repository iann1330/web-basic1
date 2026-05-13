public class BuatArrayData {
    public static void main(String[] args )
    {
        String[]nama = {"Fabian", "Darya", "Tsabitha", "Milla", "Ayu"};

        int[] nilai = {10, 9, 8, 7, 6};

        System.out.println(nama[2]);
        System.out.println(nama[2]);

        nama[2] = "Susi";
        nilai [2] = 9;

        System.out.println(nama[2]);
        System.out.println(nilai[2]);

        for (int i = 0; i < nama.length;i++)
        {
            System.out.println(nama[i]);
        }
    }
}
