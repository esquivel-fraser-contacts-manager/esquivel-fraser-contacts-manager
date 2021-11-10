import java.io.IOException;

public interface Main {

    public static void main(String[] args) throws IOException {

        Boolean keepgoing = true;
        do{
            int userInput = ContactsController.mainMenu();
            if (userInput == 1){
                ContactsController.viewList();
            } else if (userInput == 2){
                ContactsController.addContact();
            } else if (userInput == 3){
                ContactsController.searchContact();
            } else if (userInput == 4){
                ContactsController.deleteContact();
            } else if (userInput == 5){
                ContactsController.exit();
                keepgoing = false;
            } else {
                System.err.println("Invalid Entry; enter a number from 1 to 5");
            }

        }while(keepgoing);
    }
}
