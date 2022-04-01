import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PersonInputStream {
    //Attribute
    private BufferedReader fr;
    
    //Konstruktor
    public PersonInputStream(FileReader fileReader) throws FileNotFoundException{
        //this.personfile = new File("person.txt"); muss ich noch verstehen
        this.fr = new BufferedReader(fileReader);
    }



    //Methode zum Auslesen der File bzw. students
    public Person read() throws IOException, NullPointerException{
        String firstname;
        String lastname;
        int age;

        firstname= fr.readLine();
        lastname =fr.readLine();
        age = Integer.parseInt(fr.readLine());


        //durchlesen was das sein soll
        // StringBuilder content = new StringBuilder();
        // String line;
        // while ((line = fr.readLine())!=null){
        //     content.append(line);
        //     content.append(System.lineSeparator());
            return new Person (firstname, lastname, age);
        }
        //fr.read(person.toString());

    

    public void close() throws IOException{
        fr.close();
    }

    // //public String read(BufferedReader fr) throws IOException{   //warum hier String udn nicht void?
    // //    StringBuilder content = new StringBuilder();
    //     String line;

    //     while ((line = fr.readLine())!= null){
    //         content.append(line);
    //         content.append(System.lineSeparator());
    //     }
    //     fr.close(); //warum kommt das vor return?

    //     return content.toString(); //was wird hier returned?

    }
    


//auslesen/ anzeigen einer einzelnen zeile unserer Datei
//BufferedReader

// while((line = br.readLine())!=null) {
//     System.out.println(line);

// public String readAllLines(BufferedReader reader) throws IOException {
//     StringBuilder content = new StringBuilder();
//     String line;
    
//     while ((line = reader.readLine()) != null) {
//         content.append(line);
//         content.append(System.lineSeparator());
//     }

//     return content.toString();
// }