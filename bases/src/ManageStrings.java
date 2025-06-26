public class ManageStrings {
    public static void main(String[] args) {
        String myQuote = "Velo Velo, Echo la Chingada Cabron!";

        System.out.println(myQuote);
        System.out.println(myQuote.toUpperCase());
        System.out.println(myQuote.toLowerCase());
        System.out.println(myQuote.length());

        String myOtherQuote = "Apoco si muy pantera!";
        String myOtherQuoteCopy = "Apoco si muy pantera!";

        System.out.println(myQuote == myOtherQuote);
        System.out.println(myQuote.equals(myOtherQuote));
        System.out.println(myOtherQuote == myOtherQuoteCopy);
        System.out.println(myOtherQuote.equals(myOtherQuote));

        // Concatenar
        System.out.println(myQuote + " " + myOtherQuote);
        System.out.println("Hola " + (4 + 3));
        System.out.println(myQuote.concat(myOtherQuote));

        // Immutability
        String curso = "Programming Java ";
        String profesor = "Francisco Rangel ";
        String result = curso.concat(profesor);
        System.out.println("result = " + result);
        
        String newResut = curso.transform(c -> {
            return c.concat(profesor);
        });

        System.out.println("newResut = " + newResut);

        String resultReplace = profesor.replace("a", "A");
        System.out.println("resultReplace = " + resultReplace);
    }
}
