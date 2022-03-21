class Animal {
    String namaBinatang, jenisMakanan, gigiBinatang;

    public class herbivora extends Animal (){
        String makanan= "Tumbuhan", gigi=" tumpul teet";
        jenisMakanan = makanan;
        gigiBinatang = gigi ;

        System.out.print("Hi I'm Herbivora, ");
        System.out.print("My name is "+ namaBinatang );
        System.out.print(", My Food is "+ makanan);
        System.out.print("i have "+ gigi);
    }
}
public class pewarisanHewan extends Animal {
    public static void main(String[] args) {
        pewarisanHewan obj = new pewarisanHewan();

    }
}
