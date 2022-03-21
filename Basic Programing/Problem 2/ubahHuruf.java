class Main{
    private static String ubahHuruf(String s){
        char[] kr ={'A','B','C','D','E','F','G','H','I','J','K','L','M',+
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' ',};
        String a=" ";
        String str ="";
        s = s.toUpperCase();
        char[] Array1 = s.toCharArray();
        int geser = 10;

        for (char c1 : Array1){
            for(int i=0; i<=26; i++){
                if(c1 == kr[i]){
                    i = i+(geser);
                    if(i>=26){
                        i = i-26;
                    }
                    c1 = kr[i];
                    str = str + c1;
                } else if (c1==kr[26]){
                    c1=kr[i];
                    str+=a;
                }
                }
            }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("indonesia"));
        System.out.println(ubahHuruf("GOLang"));
        System.out.println(ubahHuruf("PROGRAMMER"));

    }
}
