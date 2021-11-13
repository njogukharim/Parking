import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileBase {
    String passFileName = "C:\\Users\\ADMIN\\Downloads\\Parking_System\\password.txt";
    File PersonsFile = new File(passFileName);
    boolean checkPerson(String emailAddress,String password){
        if (validate(emailAddress,password)){
            System.out.println("Person was Found..");
            return true;
        }
        else  {
            System.out.println("Person was not Found");
            return  false;
        }
    }
    boolean validate (String emailAddress, String password){
        boolean tempValidation = false;
        BufferedReader fileReader;
        try{
            fileReader = new BufferedReader(new FileReader(passFileName));
            String oneLine = fileReader.readLine();
            while (oneLine != null){
                String tempEmail = oneLine.substring(0,oneLine.indexOf(" "));
                String tempPass = oneLine.substring(oneLine.indexOf(" ") +1);
                if ((tempEmail.equals(emailAddress))&&(tempPass.equals(password)))
                    tempValidation = true;
                oneLine = fileReader.readLine();
            }
        }
        catch (IOException exp){
            exp.printStackTrace();
        }
        return tempValidation;
    }
    void createPersonFile (String emailAddress, String password){
        String oneLine = emailAddress+ " " + password+"\n";
        byte[] data = oneLine.getBytes();
        try {
//            File PersonsFile = new File(passFileName);
            if (!PersonsFile.exists()) {
                PersonsFile = new File(passFileName);
                OutputStream outPassFile = new FileOutputStream(passFileName);
                outPassFile.write(data, 0, data.length);
            }
            else {
                OutputStream outPassFile = new FileOutputStream(passFileName);
                outPassFile.write(data, 0, data.length);
            }
        }
         catch (IOException e){
                System.out.println("Exception :" + e.getMessage());
            }
        }
    }

