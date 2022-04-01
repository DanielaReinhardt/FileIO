import java.io.FileWriter;
import java.io.IOException;


public class PersonOutputStream {
  //Attribute
   private FileWriter fw;
  
  //Konstruktor für FileWriter
  public PersonOutputStream(FileWriter fw) throws IOException {
    this.fw =new FileWriter("person.txt");
  }

  // Methode zum Hinzufügen der students
    public void write(Person person) throws IOException{
    
      fw.write(person.toString());
      fw.flush();//wird das benötigt? für jetzt ok, kann aber sein dass man sp...
    
    //kein return, da eine void-Methode
  }
  public void close() throws IOException{
   
     fw.close();
  }
  

  
  
  // for (Person person: person);{
    // fw.write(person.getFirstname());
    // filewriter.write(person.getLastname());
    // filewriter.write(person.getAge());
    

  // fw.close();
  //}
}

//Klassen die ein bestimmtes Verhalten definieren, Aufruf über Main

//DATei (habe ich schon - wird in Main aufgeführt)
// Filewriter (der in die Datei reinschreibt udn die DAtei hast Du a schon wird von Außen an Kronstruktor übergen), muss man nch mit der File initialisieren
//Konstruktor zum Initialisieren aller nötigen Classmembers und aller nötigen Attribute (File nutzen um den Filewriter zu initialisieren)
//Filewriter
//Schreiben einer Person in eine Datei


/*byte[] data = ... // 
FileOutputStream fileOutputStream = new FileOutputStream(new File("test.txt"));

for(byte b : data) {
    fileOutputStream.write(b));
}

fileOutputStream.close();*/