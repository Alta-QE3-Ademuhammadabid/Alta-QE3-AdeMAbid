public class faktorBilangan {
    public static void main(String[] args) {
        int bilangan = 6;

        //process
        for (int i = 1; i <= bilangan; i++)
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        System.out.println();

        int bilangan1 = 20;
                //process
                for (int i = 1; i <= bilangan1; i++)
                    if (bilangan1 % i == 0) {
                        System.out.println(i);
                    }

    }
}
