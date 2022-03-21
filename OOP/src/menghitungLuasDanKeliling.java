class rumusLuas{
    float luas ;

    void luasPersegi(float sisi){
        luas = sisi * sisi;
        System.out.println("Persegi "+ luas);
    }
    void luassegitiga(float alas, float tinggi){
        luas = (alas*tinggi)/2;
        System.out.println("Segitiga "+ luas);
    }
    void luasPersegiPanjang(float panjang, float lebar){
        luas = panjang * lebar;
        System.out.println("Persegi Panjang "+ luas);
    }
}
class rumusKeliling extends rumusLuas{
    float keliling;

    void kelilingPersegi(float sisi){
        keliling = 4*sisi;
        System.out.println("Persegi "+ keliling);
    }
    void kelilingSegitiga(float alas, float tinggi){
        keliling = alas*tinggi;
        System.out.println("Persegi "+ keliling);
    }
    void kelilingPersegiPanjang(float panjang, float lebar){
        keliling = 2*(panjang+lebar);
        System.out.println("Persegi "+ keliling);
    }
        }
public class menghitungLuasDanKeliling extends rumusKeliling{

    public static void main(String[] args) {
        menghitungLuasDanKeliling rms= new menghitungLuasDanKeliling();
        System.out.println("LUAS");
        System.out.println("---------------------------");
        rms.luasPersegi(4);
        rms.luassegitiga(3,4);
        rms.luasPersegiPanjang(7,8);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("KELILING");
        System.out.println("---------------------------");
        rms.kelilingPersegi(4);
        rms.kelilingSegitiga(3,4);
        rms.kelilingPersegiPanjang(7,8);
        System.out.println("---------------------------");
    }
}


