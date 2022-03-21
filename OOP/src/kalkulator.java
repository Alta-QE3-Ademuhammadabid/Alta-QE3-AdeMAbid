class rumus{
    float hasil;
    void penjumlahan( float a, float b){
        hasil= a+b;
        System.out.println("Penjumlahan "+ hasil);
    }
    void pengurangan(float a, float b){
        hasil= a- b ;
        System.out.println("Pengurangan "+ hasil);
    }
    void perkalian(float a, float b){
        hasil= a*b;
        System.out.println("Perkalian " + hasil);
    }
    void pembagian (float a, float b){
        hasil= a/b;
        System.out.println("Pembagian "+ hasil);
    }
}
public class kalkulator extends rumus {
    public static void main(String[] args) {
        kalkulator hitung = new kalkulator();

        hitung.penjumlahan(3,4);
        hitung.pengurangan(15,4);
        hitung.perkalian(10,10);
        hitung.pembagian(12,3);
    }
}
