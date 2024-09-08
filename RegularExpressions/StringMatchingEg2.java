class StringMatchingEg2{
    public static void main(String [] args){
        String str = "programmer@gmail.com";

        // check if it is a valid email or not
        boolean isValid = str.matches("\\w+@gmail.[a-z]+");
        System.out.println("Email valid :"+isValid);

        // separate the username and domain name
        int index = str.indexOf("@");
        String user = str.substring(0, index);
        String domain = str.substring(index+1);

        System.out.println("username :"+user);
        System.out.println("Domain name :"+domain);
    }
}