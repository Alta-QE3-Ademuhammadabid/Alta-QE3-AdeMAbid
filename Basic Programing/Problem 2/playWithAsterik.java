public class playWithAsterik {
    public static void playWithAsterik(int n){
        for (int i=1; i<= n; i++ ) {
            for (int j = (n - 1); j >= i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<= i; k++) {
                System.out.print("*");
            }
            for(int l=1;l<=i-1;l++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        playWithAsterik(5);
        playWithAsterik(9);
        playWithAsterik(3);

    }
}
