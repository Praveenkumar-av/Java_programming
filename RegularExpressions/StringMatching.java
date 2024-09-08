class StringMatching{
    public static void main(String[] args){
        // String Matching symbols
        // . - any character
        // [abc] - either a or b or c
        // [0-9] - any digit from 0 to 9
        // [abc][0-9] - either a or b or c followed by any digit from 0 to 9
        // [^abc] - any character except a or b or c
        // [a-z0-9] - any lowercase alphabet or digit from 0 to 9
        // A|B - either A or B
        // [a-z&&[^bc]] - any lowercase alphabet except b and c
        // xyz - exactly matches the string xyz    

        String s = "9";
        System.out.println(s.matches("[a-z0-9]")); 

        // Meta characters
        // \d       - any digit, short for [0-9]
        // \D       - any non-digit, short for [^0-9]
        // \s       - any whitespace character, short for [\t\n\x0B\f\r]
        // \S       - any non-whitespace character, short for [^\s]
        // \w       - any word character, short for [a-zA-Z_0-9]
        // \W       - any non-word character, short for [^\w]
        
        s = "y";
        System.out.println(s.matches("\\w"));
    }
}