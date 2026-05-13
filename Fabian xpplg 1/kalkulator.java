public class kalkulator {
    public static void main(String[] args) {
        int z = tambah(3430,22);
        int o = kali(22, 2);
        int l = kurang(324,14212);
        float p = bagi(15,10);
        System.out.println(z);
        System.out.println(o);
        System.out.println(l);  
        System.out.println(p);      
    }
    
    static int tambah(int x,int y)
    {
        return x+y;
    }
    static int kali(int a,int e)
    {
        return a*e;
    }
    static int kurang(int g,int n)
    {
        return g-n;
    }
    static float bagi(float i,int u)
    {
        return i/u;
    }
}
