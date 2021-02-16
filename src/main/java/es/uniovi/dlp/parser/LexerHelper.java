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
        }
        return -1;
    }

    public static char lexemeToChar(String lexeme) {
        String charValue = lexeme.substring(1, lexeme.length() - 1);

        if (charValue.charAt(0) == '\\') {
            try {
                // Try getting the ASCII value
                String aux = charValue.substring(1);
                return (char) Integer.parseInt(aux);
            } catch (NumberFormatException nfe) {
                // Special character
                return switch (charValue.charAt(1)) {
                    case 'n' -> '\n';
                    case 't' -> '\t';
                    default -> throw new RuntimeException("Value " + charValue.charAt(1) + " not supported");
                };
            }
        }

        //  Simple character literal
        return charValue.charAt(0);
    }
}
