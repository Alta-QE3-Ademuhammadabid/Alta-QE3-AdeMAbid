public class drawXYZ {
    public static void DrawXYZ(int n){

        for (int i=1; i<=(n*n);i++){
            if (i%2==1 && i%3!=0){
                System.out.print("Y");
            }else if(i%2==0 && i%3!=0){
                System.out.print("Z");
            }else if(i%3==0){
                System.out.print("X");
            }
            if (i%n==0){
                System.out.println("");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}
