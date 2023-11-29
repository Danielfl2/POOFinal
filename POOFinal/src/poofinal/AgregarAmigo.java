package poofinal;

import java.io.File;
import java.io.IOException; 
import java.io.RandomAccessFile;

public class AgregarAmigo {
    
    public static String addFriend(String newName, long newNumber) {
    
        try {
            String nameNumberString; 
            String name;
            
            long number;
            String Return;
            
            File file = new File("contactosAmigos.txt"); 
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            RandomAccessFile raf = new RandomAccessFile(file, "rw"); 
            boolean found = false;

        
        
            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                String[] lineSplit = nameNumberString.split("!");

                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if ((name.equals(newName))
                        || number == newNumber) { 
                    found = true;
                    break;
                }
            }

            if (found == false) {
                nameNumberString = newName + "!" + String.valueOf(newNumber);
                raf.writeBytes(nameNumberString);
                raf.writeBytes(System.lineSeparator());
                Return = " Amigo añadido!. ";
                raf.close();

            }
            else {
                raf.close();
                Return = " El nombre o numero ya existe ";
            }
            return Return;  
        }catch (IOException ioe) {
        return " Error: " + ioe.getMessage();
        }
    }
}
