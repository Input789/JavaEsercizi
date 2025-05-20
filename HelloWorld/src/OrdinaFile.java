import java.io.*;
import java.util.*;

public class OrdinaFile {
    String inputFile = " ";
    String outputFile = " ";

    public OrdinaFile(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public void Ordina(){
        List<String> lines = new ArrayList<>();

        // Legge il file di input e memorizza le linee nella lista
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
            return;
        }

        // Ordina la lista
        Collections.sort(lines);

        // Scrive la lista ordinata nel file di output
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Errore nella scrittura del file: " + e.getMessage());
        }
    }
}
