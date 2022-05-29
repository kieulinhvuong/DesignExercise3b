import java.util.*;

public class Database {

    //database to store application information in submission time order, submit first, get in first
    private LinkedHashMap<String, String> database;

    public Database() {
        database = new LinkedHashMap<>();
    }


    public void addToDatabase(Application application) {
        database.put(application.getName(), application.getHomeAddress());
    }


    public void printList() {
        System.out.println(Arrays.asList(database) + "\n");
    }

    ArrayList<String> approvedList = new ArrayList<String>();
    
    public void review() {
        int limit = 5;   //small number, easy to test

        while (limit >= 0) {
            for (Map.Entry<String, String> d : database.entrySet()) {
                //approved and add name to approved list + remove from database
                if (d.getKey() != null && d.getValue() != null) {
                    approvedList.add(d.getKey());
                    limit--;
                }
            }
        }

        Collections.sort(approvedList);
    }

    LinkedHashMap<String, String> evacuationFile = new LinkedHashMap<>();

    public void addToExecutionFile() {
        for (int i=0; i<approvedList.size(); i++) {
            for (Map.Entry<String, String> app : database.entrySet()) {
                if (app.getKey() == approvedList.get(i)) {
                    evacuationFile.put(app.getKey(), app.getValue());
                }
            }
        }
    }

    public String search() {
        Scanner scan = new Scanner(System.in);
        String keyword = scan.nextLine();

        if (keyword.length() == 0) {
            return "";
        }

        for (Map.Entry<String, String> e : evacuationFile.entrySet()) {
            if (keyword == e.getKey().substring(0, keyword.length())) {
                return String.format("Name: %s, Home Address: %s", e.getKey(), e.getValue());
            }
        }
        scan.close();
        return null;
    }
}
