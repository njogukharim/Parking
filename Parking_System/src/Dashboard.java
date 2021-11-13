import java.util.Scanner;

public class Dashboard {

    public static void main(String[] args) {

        Person p = new Person();
        Administrator a = new Administrator();
        FileBase f = new FileBase();

        System.out.println("Please Enter: \n1 --- To Login \n2 --- To Register");
        Scanner scan = new Scanner(System.in);
        String option = scan.next();

        Slots slots = new Slots();

        assert option != null;
        if (option.equals("1")) {
            p.login();
            String email = a.getEmailAddress();
            String pass = a.getPassword();
            slots.generateSLots();
//            boolean auth = f.checkPerson(email, pass);
//            if (auth){
//                a.allocateSlot(slots);
//            } else {
//                System.out.println("User is not a valid system Administrator");
//            }
            a.allocateSlot(slots);
            System.out.println("Choose 1 : to allocate another parking slot \n2 : to exit the system");
            int opt = scan.nextInt();
            if (opt == 1){
                a.allocateSlot(slots);
            } else if (opt == 2){
                System.out.println("Program has terminated");
            } else {
                System.out.println("wrong option, please enter the correct option");
            }

        } else if (option.equals("2")) {
            p.register();
            String email = p.getEmailAddress();
            String pass = p.getPassword();
            f.createPersonFile(email, pass);
            a.allocateSlot(slots);

            System.out.println("Choose 1 : to allocate another parking slot \n2 : to exit the system");
            int opt = scan.nextInt();
            if (opt == 1){
                a.allocateSlot(slots);
            } else if (opt == 2){
                System.out.println("Program has terminated");
            } else {
                System.out.println("wrong option, please enter the correct option");
            }

        } else {
            System.out.println("Error: Please enter the correct option.");
        }


    }
}
