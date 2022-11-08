import java.util.Scanner;

public class InputHandler {

//Följande strängar skapas. Tom sträng skapas för att initiera de.
private String PreviousLine = "";
private String InputCompilation = "";
private String Stop = "stop";
Counter counter = new Counter();


public void AcceptInputs() {
    // Programmet loopar tills ordet stopp matas in i en egen rad.
    // Programmet kommer att kolla i den tidigare raden om stop framgår.
    while (!PreviousLine.equals(Stop)) {
        System.out.println("Skriv in något. Programmet kommer att avslutas när du skriver ordet stop.");
        HandleInput();
    }
    // Programmet kommer att skriva ut antal tecken och rader som användaren har matat in.
    PrintCharacters();
    PrintRows();
}
    // Input från användaren.
    private void HandleInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        // Oavsett vad användaren skriver in kommer det att omvandlas till små bokstäver.
        PreviousLine = input.toLowerCase();
        // Om inget stopp framgår kommer det att läggas in i InputCompilation.
        if (!input.toLowerCase().equals(Stop)) {
            // Varje ny rad av inputs läggs till i variabeln InputCompilation, plus en radbrytning
            InputCompilation += input + "\n";
        }
    }
    private void PrintCharacters() {
        // InputCompilation variabeln skickas in i metoden CountCharacters, som returnerar antalet tecken den innehåller.
        long characters = counter.CountCharacters(InputCompilation);
        System.out.println("Antal tecken: " + characters);
    }
    private void PrintRows() {
        // InputCompilation varibeln skickas in i metoden CountRows, som returnera antalet rader den innehåller.
        long rows = counter.CountRows(InputCompilation);
        System.out.println("Antal rader: " + rows);
    }
}
