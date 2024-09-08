class StringMatchingEg3{
    public static void main(String[] args){
        String str = "ab1@e!4s$";

        // remove the special characters other than alphabets and numbers
        System.out.println(str.replaceAll("\\W", ""));

        str = " abc    def   g";
        // remove the space of more than one space
        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
}