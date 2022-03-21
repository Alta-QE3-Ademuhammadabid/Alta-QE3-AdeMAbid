public class faktorBilangan2 {
    public static void main(String[] args) {
        int bilangan=6 ;

        //process:
        for (int i = bilangan ; i >= 1 ;i-- )
            if (bilangan%i==0) {
                System.out.println(i);
            }
        System.out.println();
        int bilangan2=20 ;

        //process:
        for (int i = bilangan2 ; i >= 1 ;i-- )
            if (bilangan2%i==0) {
                System.out.println(i);
            }
    }
}
