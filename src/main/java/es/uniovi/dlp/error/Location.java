package es.uniovi.dlp.error;

public record Location(int line, int column) implements Comparable<Location>  {
    @Override
    public int compareTo(Location location) {
        if (line < location.line()) {
            return -1;
        }
        return column - location.column();
    }

    @Override
    public String toString() {
        return "line: " + line + ", column: " + column;
    }
}
