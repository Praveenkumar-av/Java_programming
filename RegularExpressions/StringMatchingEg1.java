class StringMatchingEg1{
    public static void main(String[] args){
        int data = 10109;
        String str = String.valueOf(data);

        System.out.println("binary :"+str.matches("[01]+"));
        str = "123F";
        System.out.println("Hexadecimal :"+str.matches("[0-9A-F]+"));
    }
}