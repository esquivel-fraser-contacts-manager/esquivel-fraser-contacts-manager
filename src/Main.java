public interface Main {

    public static void main(String[] args) {

        do{
            int userInput = ContactsUpdate.mainMenu();
            if (userInput == 1){
                ContactsUpdate.viewList();
            } else if (userInput == 2){
                ContactsUpdate.addContact();
            } else if (userInput == 3){
                ContactsUpdate.searchContact();
            } else if (userInput == 4){
                ContactsUpdate.deleteContact();
            } else if (userInput == 5){
                ContactsUpdate.exit();
            } else {
                System.err.println("Invalid Entry; enter a number from 1 to 5");
            }

        }while(true);
    }
}