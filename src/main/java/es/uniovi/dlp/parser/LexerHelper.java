package es.uniovi.dlp.parser;

public class LexerHelper {
    public static int lexemeToInt(String lexeme) {
        try {
            return Integer.parseInt(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static double lexemeToReal(String lexeme) {
        try {
            return Double.parseDouble(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }return -1;
    }

    public static char lexemeToChar(String str) {
        if (str.length() == 3) return str.charAt(1);
        else {
            String cad = str.split("'")[1].substring(0);
            if (cad.charAt(1) == 'n')
                return '\n';
            else if (cad.charAt(1) == 't')
                return '\t';
            else if (isNum(cad.substring(1)))
                return (char) Integer.parseInt(cad.substring(1));
            else if (! isNum(cad.substring(1)))
                return cad.charAt(1);
        }
        return ' ';
    }

    private static boolean isNum(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
