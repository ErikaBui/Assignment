public class Counter {
    public long CountCharacters(String input) {
        // All radbrytningar ersätts med tomma strängar.
        String modifiedInput = input.replaceAll("\\n", "");
        // Filter läggs in för att mellanslag inte ska ingå i beräkningen av antalet tecken.
        long characters = modifiedInput.chars().filter(x -> x != ' ').count();
        // Antalet tecken returneras.
        return characters;
    }
    public long CountRows(String input) {
        // Raderna bryts upp rad för rad för att räknas.
        long rows = input.lines().count();
        // Antalet rader returneras.
        return rows;
    }
}
