import java.io.*;
import java.util.Scanner;

public class NotesAppBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String note;

        do {
            System.out.println("\n--- Notes App ---");
            System.out.println("1. Add Note (Append)");
            System.out.println("2. Overwrite Notes");
            System.out.println("3. View Notes");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter note to append: ");
                    note = sc.nextLine();
                    writeNote(note, true); // append mode
                    break;

                case 2:
                    System.out.print("Enter note to overwrite: ");
                    note = sc.nextLine();
                    writeNote(note, false); // overwrite mode
                    break;

                case 3:
                    readNotes();
                    break;

                case 4:
                    System.out.println("Exiting Notes App...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close(); // finally equivalent, always closes scanner
    }

    // Method to write note
    public static void writeNote(String note, boolean append) {
        try {
            FileWriter fw = new FileWriter("notes.txt", append); // append or overwrite
            fw.write(note + "\n");
            fw.close();
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing note!");
            e.printStackTrace(); // prints stack trace
        }
    }

    // Method to read notes
    public static void readNotes() {
        try {
            FileReader fr = new FileReader("notes.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("\n--- All Notes ---");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("No notes found!");
        } catch (IOException e) {
            System.out.println("Error reading notes!");
            e.printStackTrace();
        }
    }
}
