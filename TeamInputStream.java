import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class TeamInputStream {
    private BufferedReader fr;
    private FileReader filereader;
    

    public TeamInputStream(FileReader fileReader2) throws FileNotFoundException{
        this.filereader = new FileReader("team.txt");
        this.fr = new BufferedReader(filereader);
    }
    public Person read() throws IOException, NullPointerException{
        String firstname;
        String lastname;
        int age;
        
               
        firstname= fr.readLine();
        lastname =fr.readLine();
        age = Integer.parseInt(fr.readLine());
        
       
        while((filereader.read()) <-1){
            

        }
            return new Person(firstname, lastname, age);
                

        // firstname = fr.readLine();
        // lastname = fr.readLine();
        // age = Integer.parseInt(fr.readLine());
        // while((firstname && lastname && age) !=null){
        //     return "The Teammember are: \n" + firstname + lastname + age;
        // }
        
        // StringBuilder content = new StringBuilder();
        // String line;
    
        // while((line = fr.readLine()) != null){
        //     content.append(line);
        //     content.append(System.lineSeparator());

           
        // }
        // return new Person();
    }
    public void close() throws IOException {
        fr.close();
    }
}
//Auslesen/ Anzeigen des gesamten Teams
