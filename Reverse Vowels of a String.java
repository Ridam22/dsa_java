class Solution {
    boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public String reverseVowels(String s) {
        char[] a= s.toCharArray();
        int i=0, j= a.length-1;
        while(i<j){
            if(isVowel(a[i]) && isVowel(a[j])){
                char t= a[i];
                a[i]= a[j];
                a[j]= t;
                i++;
                j--;
            }else if(!isVowel(a[i])){
                i++;
            }else{
                j--;
            }
        }
        return new String(a);
    }
}
