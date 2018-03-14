package ru.omsu.string;

public class StringProcessor {
    public static String multiString(String s, int n) throws NegativeStringNumberException{
        if(n<0){
            throw new NegativeStringNumberException();
        }
        else{
            if(n>0) {
                StringBuilder sb = new StringBuilder();
                for(int i=0; i<n; i++){
                    sb.append(s);
                }
                return sb.toString();
            }
            return "";
        }
    }
    public static int numberOfInclutions(String s1, String s2){
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = s1.indexOf(s2,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += s2.length();
            }
        }
        return count;
    }
    public static String numToWord(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i != -1){
            i = sb.indexOf("1");
            if(i != -1){
                sb.deleteCharAt(i);
                sb.insert(i,"один");
            }
        }
        i = 0;
        while(i != -1){
            i = sb.indexOf("2");
            if(i != -1){
                sb.deleteCharAt(i);
                sb.insert(i,"два");
            }
        }
        i = 0;
        while(i != -1){
            i = sb.indexOf("3");
            if(i != -1){
                sb.deleteCharAt(i);
                sb.insert(i,"три");
            }
        }
        return sb.toString();
    }
    public static void deleteEveryOther(StringBuilder s){
        for(int i = 1; i<s.length(); i++){
            s.deleteCharAt(i);
        }
    }
}
