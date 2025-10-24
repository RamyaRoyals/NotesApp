# Java Notes App

## Description
This is a simple **Java Notes App** where you can:
- Add new notes (Append mode)
- Overwrite old notes (Overwrite mode)
- View all notes

It is made using **basic Java concepts** to practice **File I/O** and **Exception Handling**.

---

## Why this code is simple
- Uses **FileWriter** to write notes to a text file
- Uses **FileReader + BufferedReader** to read notes
- Uses **try-catch** to handle errors (exceptions)
- **Append mode** adds new notes without deleting old notes
- **Overwrite mode** replaces all old notes with new input
- **Stack trace** prints where error happened
- **Scanner** is used to take input from user

> This code is kept simple to help beginners understand how file handling and exception handling works in Java.

---

## Features
1. **Append Notes** – Add note at the end of file
2. **Overwrite Notes** – Replace old notes with new note
3. **View Notes** – Display all notes from file
4. **Error Handling** – Shows errors if file not found or writing fails

---

## How to Run
1. Clone repo:  
   ```bash
javac NotesAppBasic.java
java NotesAppBasic


Sample output
-------------------
--- Notes App ---
1. Add Note (Append)
2. Overwrite Notes
3. View Notes
4. Exit
Enter choice: 2
Enter note to overwrite: maths
Note saved successfully!

--- Notes App ---
1. Add Note (Append)
2. Overwrite Notes
3. View Notes
4. Exit
Enter choice: 3

--- All Notes ---
maths

--- Notes App ---
1. Add Note (Append)
2. Overwrite Notes
3. View Notes
4. Exit
Enter choice:


Author
Subramayam vaari Ramya
