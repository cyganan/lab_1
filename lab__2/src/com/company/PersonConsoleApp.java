package com.company;

public class PersonConsoleApp {
    private static final String GREETING_MESSAGE = "";
    private static final String MENU = "    M E N U   G Ł Ó W N E  \n1 - Menu SET \n2 - Menu LIST        \n3 - Menu MAP   \n0 - Zakończ program        \n";
    private static final String SetMENU = "    M E N U   S E T  \n1 - Dodaj osobę do HashSet \n2 - Usuń osobę z HashSet       \n3 - Wyświetl HashSet   \n4 - Dodaj osobę do TreeSet   \n5 - Usuń osobę z TreeSet   \n6 - Wyświetl TreeSet   \n0 - Zakończ program        \n";
    private static final String ListMENU = "    M E N U   L I S T  \n1 - Dodaj osobę do ArrayList \n2 - Usuń osobę z ArrayList       \n3 - Wyświetl ArrayList   \n4 - Dodaj osobę do LinkedList   \n5 - Usuń osobę z LinkedList   \n6 - Wyświetl LinkedList   \n0 - Zakończ program        \n";
    private static final String MapMENU = "    M E N U   M A P  \n1 - Dodaj osobę do HashMap \n2 - Usuń osobę z HashMap       \n3 - Wyświetl HashMap   \n4 - Dodaj osobę do TreeMap   \n5 - Usuń osobę z TreeMap   \n6 - Wyświetl TreeMap   \n0 - Zakończ program        \n";
    private static final ConsoleUserDialog UI = new ConsoleUserDialog();
    private Person currentPerson = null;

    public PersonConsoleApp() {
    }

    static Person createNewPerson() {
        String first_name = UI.enterString("Podaj imię: ");
        String last_name = UI.enterString("Podaj nazwisko: ");
        String birth_year = UI.enterString("Podaj rok ur.: ");

        try {
            Person person = new Person(first_name, last_name);
            person.setBirthYear(birth_year);
            return person;
        } catch (PersonException var5) {
            UI.printErrorMessage(var5.getMessage());
            return null;
        }
    }

    public void runMainLoop() {
        UI.printMessage("");
        SetOperations o1 = new SetOperations();
        ListOperations o2 = new ListOperations();
        MapOperations o3 = new MapOperations();

        while (true) {
            while (true) {
                UI.clearConsole();
                switch (UI.enterInt("    M E N U   G Ł Ó W N E  \n1 - Menu SET \n2 - Menu LIST        \n3 - Menu MAP   \n0 - Zakończ program        \n==>> ")) {
                    case 0:
                        UI.printInfoMessage("\nProgram zakończył działanie!");
                        System.exit(0);
                        break;
                    case 1:
                        switch (UI.enterInt("    M E N U   S E T  \n1 - Dodaj osobę do HashSet \n2 - Usuń osobę z HashSet       \n3 - Wyświetl HashSet   \n4 - Dodaj osobę do TreeSet   \n5 - Usuń osobę z TreeSet   \n6 - Wyświetl TreeSet   \n0 - Zakończ program        \n==>> ")) {
                            case 0:
                                UI.printInfoMessage("\nProgram zakończył działanie!");
                                System.exit(0);
                                continue;
                            case 1:
                                this.currentPerson = createNewPerson();
                                o1.HashSetAddOperation(this.currentPerson);
                                continue;
                            case 2:
                                this.currentPerson = createNewPerson();
                                o1.HashSetRemoveOperation(this.currentPerson);
                                continue;
                            case 3:
                                o1.HashSetPrintOperation();
                                continue;
                            case 4:
                                this.currentPerson = createNewPerson();
                                o1.TreeSetAddOperation(this.currentPerson);
                                continue;
                            case 5:
                                this.currentPerson = createNewPerson();
                                o1.TreeSetRemoveOperation(this.currentPerson);
                                continue;
                            case 6:
                                o1.TreeSetPrintOperation();
                            default:
                                continue;
                        }
                    case 2:
                        int indexLinkedRm;
                        switch (UI.enterInt("    M E N U   L I S T  \n1 - Dodaj osobę do ArrayList \n2 - Usuń osobę z ArrayList       \n3 - Wyświetl ArrayList   \n4 - Dodaj osobę do LinkedList   \n5 - Usuń osobę z LinkedList   \n6 - Wyświetl LinkedList   \n0 - Zakończ program        \n==>> ")) {
                            case 1:
                                this.currentPerson = createNewPerson();
                                o2.ArrayListAddOperation(this.currentPerson);
                                continue;
                            case 2:
                                indexLinkedRm = UI.enterInt("Podaj pozycję ==>> ");
                                o2.ArrayListRemoveOperation(indexLinkedRm);
                                continue;
                            case 3:
                                o2.ArrayListPrintOperation();
                            case 4:
                            default:
                                continue;
                            case 5:
                                this.currentPerson = createNewPerson();
                                indexLinkedRm = UI.enterInt("Podaj pozycję ==>> ");
                                o2.LinkedListAddOperation(indexLinkedRm, this.currentPerson);
                                continue;
                            case 6:
                                indexLinkedRm = UI.enterInt("Podaj pozycję ==>> ");
                                o2.LinkedListRemoveOperation(indexLinkedRm);
                                continue;
                            case 7:
                                o2.LinkedListPrintOperation();
                                continue;
                            case 8:
                                UI.printInfoMessage("\nProgram zakończył działanie!");
                                System.exit(0);
                                continue;
                        }
                    case 3:
                        String keyTreeRm;
                        switch (UI.enterInt("    M E N U   M A P  \n1 - Dodaj osobę do HashMap \n2 - Usuń osobę z HashMap       \n3 - Wyświetl HashMap   \n4 - Dodaj osobę do TreeMap   \n5 - Usuń osobę z TreeMap   \n6 - Wyświetl TreeMap   \n0 - Zakończ program        \n==>> ")) {
                            case 0:
                                UI.printInfoMessage("\nProgram zakończył działanie!");
                                System.exit(0);
                                break;
                            case 1:
                                this.currentPerson = createNewPerson();
                                keyTreeRm = UI.enterString("Podaj klucz ==>> ");
                                o3.HashMapAddOperation(keyTreeRm, this.currentPerson);
                                break;
                            case 2:
                                keyTreeRm = UI.enterString("Podaj klucz ==>> ");
                                o3.HashMapRemoveOperation(keyTreeRm);
                                break;
                            case 3:
                                o3.HashMapPrintOperation();
                                break;
                            case 4:
                                this.currentPerson = createNewPerson();
                                keyTreeRm = UI.enterString("Podaj klucz ==>> ");
                                o3.TreeMapAddOperation(keyTreeRm, this.currentPerson);
                                break;
                            case 5:
                                keyTreeRm = UI.enterString("Podaj klucz ==>> ");
                                o3.TreeMapRemoveOperation(keyTreeRm);
                                break;
                            case 6:
                                o3.TreeMapPrintOperation();
                        }
                }
            }
        }
    }
}
