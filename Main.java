public class Main {
    public static void main(String[] args) {
        Application a1 = new Application("AA", "2 east south");
        Application a2 = new Application("BB", "3 east");
        Application a3 = new Application("CC", "3 east");
        Application a4 = new Application("DD", "3 east");
        Application a5 = new Application("EE", "4 east");
        Application a6 = new Application("FF", "5 east");
        System.out.print(a1.getName() + "\n");
        System.out.print(a2.getHomeAddress() + "\n");
        System.out.print(a1.toString());
        System.out.print(a2.toString());
        Database database = new Database();

        database.addToDatabase(a1);
        database.addToDatabase(a2);
        database.addToDatabase(a3);
        database.addToDatabase(a4);
        database.addToDatabase(a5);
        database.addToDatabase(a6);

        database.printList();
    }
}
