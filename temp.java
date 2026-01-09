
class temp {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hey this is pro");
        
        int i = 0;
        while(i < str.length()) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str.setCharAt(i, (char)(str.charAt(i) - 32));
            }
            i++;  
        }
        System.out.println(str);
    }
}