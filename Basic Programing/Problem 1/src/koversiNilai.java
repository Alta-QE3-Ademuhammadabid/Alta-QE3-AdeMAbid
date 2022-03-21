public class koversiNilai {
    public static void main(String[] args) {
        //input
        int studentScore = 80;

        // proses dan output
        if (studentScore >= 80 && studentScore <= 100) {
            System.out.println("A");
        } else if (studentScore >= 65 && studentScore <= 79) {
            System.out.println("B+");
        } else if (studentScore >= 50 && studentScore <= 64) {
            System.out.println("B");
        } else if (studentScore >= 35 && studentScore <= 49) {
            System.out.println("C");
        } else if (studentScore >= 0 && studentScore <=35) {
            System.out.println("C");
        } else { System.out.println("invalid");
        }
    }
}
