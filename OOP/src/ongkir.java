class dimensibarang {
    void dimensibrng(int panjang, int lebar, int tinggi, int berat) {
        int standar = 5000;
        int dimensi = panjang * lebar * tinggi;

        if (dimensi >= 50){
                berat = +(dimensi/50);}

        if (dimensi <= 50 && berat <= 1) {
            System.out.println(standar);
        } else if (dimensi <= 50 && berat >= 1) {
            System.out.println(standar * berat);
        } else  if (dimensi>= 50){
            System.out.println(standar * berat);
        }
    }
    }

public class ongkir extends  dimensibarang{
    public static void main(String[] args) {
        ongkir tes = new ongkir();
        int panjang = 5,lebar=2,tinggi =4,berat=1;

tes.dimensibrng(panjang,lebar,tinggi,berat);
    }
}
