import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String [] args) throws IOException, NullPointerException{
        //lokale Variablen (weil sie in einer Methode sind) bzw. Objekte
        Person bernd = new Person("Bernd", "Bormann", 42);
        Person daniela = new Person("Daniela", "Reinhardt", 42);
        Person stefan = new Person("Stefan", "Kurz", 42);
        Person andreas = new Person("Andreas", "Schlagner", 42);
        Person liz = new Person("Liz", "Stoecker", 42);
        Person miles = new Person ("Miles", "Lynam-Smith", 42);
        Person lukas = new Person("Lukas", "Frenzke", 42);

        File personFile = new File ("person.txt");
        //File teamFile = new File ("team.txt");

        PersonOutputStream outputStream = new PersonOutputStream(new FileWriter("person.txt"));
        outputStream.write(bernd);    
        //outputStream.write(daniela);
        outputStream.close();

   
    PersonInputStream personInputStream = new PersonInputStream(new FileReader(personFile));
        
        Person bernd2 = personInputStream.read();
        
        personInputStream.close();
        System.out.println("A single Teammember: \n" + bernd2);

        // Person daniela2 = personInputStream.read();
        // personInputStream.close();

        // System.out.println(daniela2);
    
    
        TeamOutputstream teamOutputstream = new TeamOutputstream(new FileWriter("team.txt"));
        List <Person> team = new ArrayList<>();
        team.add(bernd);
        team.add(daniela);
        team.add(stefan);
        team.add(andreas);
        team.add(liz);
        team.add(miles);
        team.add(lukas);
        teamOutputstream.write(team);
        teamOutputstream.close();

        TeamInputStream teamInputStream = new TeamInputStream(new FileReader("team.txt"));
        Person team2 = teamInputStream.read();
        Person team3 = teamInputStream.read();
        Person team4 = teamInputStream.read();
        Person team5 = teamInputStream.read();
        Person team6 = teamInputStream.read();
        Person team7 = teamInputStream.read();
        Person team8 = teamInputStream.read();
    
        teamInputStream.close();
        System.out.println("All Teammembers are \n" + team2 + team3 + team4 + team5 + team6 + team7 + team8);
    }
}
