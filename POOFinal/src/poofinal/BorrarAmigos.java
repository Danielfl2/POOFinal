package poofinal;

import java.io.File;
import java.io.IOException; 
import java.io.RandomAccessFile;

public class BorrarAmigos {
    public static String deleteFriend(String newName){
        try {
            String nameNumberString;
            String name; 
            long number; 
            int index;
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
                
                if (name.equals(newName)) {
                    found = true; 
                    break;
                }
            }
            if (found == true) {
                File tmpFile = new File("temp.txt");
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
                raf.seek(0);
                
                while (raf.getFilePointer() < raf.length()) {
                    nameNumberString = raf.readLine();
                    index = nameNumberString.indexOf('!'); 
                    name = nameNumberString.substring(0, index);
                    
                    if (name.equals(newName)) {
                        continue;
                    }
                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(System.lineSeparator());
                }
                raf.seek(0);
                tmpraf.seek(0);
                
                while (tmpraf.getFilePointer() < tmpraf.length()) { 
                    raf.writeBytes(tmpraf.readLine()); 
                    raf.writeBytes(System.lineSeparator());
                }
                raf.setLength(tmpraf.length());
                tmpraf.close(); raf.close();
                tmpFile.delete();
                return (" Friend deleted. ");
            }
            else {
                raf.close();
                return (" Input name" + " does not exists. ");
            }   
        }catch (IOException ioe) {
            return " Error: " + ioe.getMessage();
        }
    }
}
