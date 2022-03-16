public class Main {

    private static String S;
    private static String C;
    public static String[] Mass1 = new String[18];
    public static void main(String[] args) {
        System.out.println(solution(S,C));
    }
    public static int solution(String S, String C) {
        S = "uid,sname,mass,single,room,dep,\n 3,Jon,89,T,12,13,\n 14,Alex,101,F,18,4";
        C = "uid";
        int i=0;
        int a=0;
        for (String retval : S.split(",")) {
            for(;i < 18;) {
                Mass1[i] = retval;
                ++i;
                break;
            }}
        for(i=0;i < 18;i++) {
            if(Mass1[i].equals(C)){
                a=i;
                if(Integer.parseInt (Mass1[a+6].trim())>Integer.parseInt (Mass1[a+12].trim())){
                    a= Integer.parseInt (Mass1[a+6].trim());
                }
                else {
                    a= Integer.parseInt (Mass1[a+12].trim());
                }
            }
        }

        return a;
}}
