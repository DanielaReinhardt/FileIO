import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TeamOutputstream {
    private FileWriter fw;

    public TeamOutputstream (FileWriter fw) throws IOException{
        this.fw = new FileWriter("team.txt");
    }

    // public void write(Person team) throws IOException {
    //     fw.write(team.toString());
    //     fw.flush();

    // }

    public void close() throws IOException {
        fw.close();
    }

	public void write(List<Person> team) throws IOException {
        fw.write(team.toString());
        fw.flush();
	}
}
//Schreiben des gesamten Teams in eine Datei