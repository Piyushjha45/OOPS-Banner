public class OOPSBanner {

    public static void main(String[] args) {

        System.out.println(getLine1());
        System.out.println(getLine2());
        System.out.println(getLine3());
        System.out.println(getLine4());
        System.out.println(getLine5());
    }


    public static String getLine1() {
        return String.join("    ", "OOOOO", "OOOOO", "PPPPP", "SSSSS");
    }

    
    public static String getLine2() {
        return String.join("    ", "O   O", "O   O", "P   P", "S    ");
    }

    
    public static String getLine3() {
        return String.join("    ", "O   O", "O   O", "PPPPP", " SSSS");
    }

    
    public static String getLine4() {
        return String.join("    ", "O   O", "O   O", "P    ", "    S");
    }

    
    public static String getLine5() {
        return String.join("    ", "OOOOO", "OOOOO", "P    ", "SSSSS");
    }
}