public class polindrom {
    private static boolean polindrom(String value) {
        String poli ="";
        for (int i = value.length(); i > 0; i--) {
            String test1 = value.substring(i - 1, i);
            poli += test1;
        }
        if (value.equals(poli)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(polindrom("civic"));
        System.out.println(polindrom("katak"));
        System.out.println(polindrom("kasur rusak"));
        System.out.println(polindrom("kupu-kupu"));
        System.out.println(polindrom("lion"));
    }
}
