import org.jetbrains.annotations.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Administrator extends Person implements Payments {

    LocalDateTime time = LocalDateTime.now();
    int hourlyRate = 200;
    Scanner scan = new Scanner(System.in);

    public Administrator(String firstName, String lastName, String password, String email) {
        super(firstName, lastName, password, email);
    }

    public Administrator() {

    }


    public void allocateSlot(Slots slt){
//        slt.generateSLots();
        System.out.println("Enter clients first name");
        String firstName = scan.next();
        System.out.println("Enter clients last name");
        String lastName = scan.next();
        System.out.println("Enter client's E-mail address");
        String email = scan.next();
        System.out.println("Enter clients phone number");
        int contact = scan.nextInt();
        System.out.println("Enter Car registration number");
        String regNo = scan.next();
        slt.displaySlots();
        System.out.println("Please select a slot among those displayed");
        String choice = scan.next();
        Client c = new Client(firstName,lastName,email,contact,regNo);
        System.out.println("Client: "+ c.getUserName() + " has been allocated slot: " + choice);
        int indOfChoice = slt.slotList.indexOf(choice);
        updateArray(slt,indOfChoice);

    }



    public int findAvailableSlots(String level){
        return 0;
    }

    public int findAvailableSlots(){
        return 0;
    }

    public void addLevel(@NotNull Slots s, String level){
        s.arrayList.add(level);
        s.levels = s.arrayList.toArray(s.levels);
    }

    @Override
    public void releaseSlot(Slots s) {


    }

    @Override
    public int calculateParkingTime() {
        return 0;
    }

    @Override
    public int calculateFee() {
        return 0;
    }

    private String[] updateArray(Slots slt, int choice) {
        List<String> tempList = new ArrayList<>(Arrays.asList(slt.slotId));
        tempList.remove(choice);
        slt.slotId = tempList.toArray(slt.slotId);
        return slt.slotId;
    }

    private void enterParkingRequirements(){

        System.out.println("Enter client's first name: ");
        String firstName = scan.next();
        System.out.println("Enter client's last name: ");
        String lastName = scan.next();
        System.out.println("Enter client's Email Address: ");
        String emailAdd = scan.next();
        System.out.println("Enter client's phone contact: ");
        int contact = scan.nextInt();
        System.out.println("Enter client's Car Registration Number: ");
        String carRegNo = scan.next();

        Person p = new Client(firstName,lastName,emailAdd,contact,carRegNo);
        p.getUserName();
    }
}
