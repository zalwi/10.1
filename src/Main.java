import logic.PersonCreator;

public class Main {
    public static void main(String[] args) {
        PersonCreator personCreator = new PersonCreator();
        personCreator.addPersonToTable(0,"Kamil", "Zalwert", 31, "123456789");
        personCreator.addPersonToTable(1,"Zbigniew", "Zero", 0, "123456789");
        personCreator.addPersonToTable(2,"X", null, 31, "123456789");
        personCreator.addPersonToTable(3,"Null", "Pointer", 1, "123456789");
        personCreator.showSavedPersons();
    }
}
