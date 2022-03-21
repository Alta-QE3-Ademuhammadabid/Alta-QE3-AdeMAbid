public class cetakTabelPerkalian {

    private static void cetakTabelPerkalian(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(" "+i*j+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        cetakTabelPerkalian(3);
        cetakTabelPerkalian(9);
    }
}
