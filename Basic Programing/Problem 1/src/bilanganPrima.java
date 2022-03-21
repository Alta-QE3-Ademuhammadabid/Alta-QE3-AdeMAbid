class bilanganPrima {
    public static boolean primeNumber(int Number) {
        //your code here
       int bil = 0 ;
       for (int i = 2; i<= Number;i++){
           if (Number%i==0){
               bil++;
            }
        }
       if (bil == 1){
           return true;
       } else {
           return false;
       }
    }
        public static void main (String[]args){
            System.out.println(primeNumber(11));
            System.out.println(primeNumber(13));
            System.out.println(primeNumber(17));
            System.out.println(primeNumber(20));
            System.out.println(primeNumber(35));
        }
    }

