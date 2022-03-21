class rumusVolume{
    float volume ;
    void kubus(float sisi){
        volume= sisi*sisi*sisi;
        System.out.println("Kubus " + volume);
    }
    void balok(float panjang, float lebar, float tinggi){
        volume= panjang*lebar*tinggi;
        System.out.println("Balok "+ volume);
    }
    void tabung(float radius, float tinggi){
        volume= ((radius*radius)*tinggi)*22/7;
        System.out.println("Tabung "+ volume);
    }
}
public class menghitungVolume extends rumusVolume {
    public static void main(String[] args) {

        menghitungVolume rumus = new menghitungVolume();
        System.out.println("VOLUME");
        rumus.kubus(10);
        rumus.balok(3,6,10);
        rumus.tabung(7,10);
        rumus.balok(5,4,4);
    }
}
