public class Palindrome {
    private static boolean palindrome(String kata){
        String katayangdibalik= "";
                for (int i = kata.length(); i >=1 ; i--){
                katayangdibalik =katayangdibalik + kata.charAt(i-1);
    }
                if (katayangdibalik.equals(kata)){
                    return true;
                } else{
                    return false;
                }
}

    public static void main(String[] args) {
    System.out.println(palindrome("civic"));
    System.out.println(palindrome("kasur"));
    System.out.println(palindrome("pecah"));
    System.out.println(palindrome("tumut"));
    }
}






