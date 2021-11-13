import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Slots {

    String[] levels = {"A","B","C","D","E","F","G","H"};
    List<String> arrayList = new ArrayList<>(Arrays.asList(levels));
    int slots = 50;
    String[] slotId = {};
    List<String> slotList = new ArrayList<>(Arrays.asList(slotId));
    String tempSlot;

    int totalSlots = levels.length * slots;

    public Slots(){

    }

    public void displaySlots(){
        System.out.println(Arrays.toString(slotId));
    }

    public String[] generateSLots(){
        for(int l=0; l<levels.length; l++) {
            for (int i = 1; i <= slots; i++) {
                tempSlot = levels[l] +":" + toString(i);
                slotList.add(tempSlot);
                slotId = slotList.toArray(slotId);
            }
        }
        return slotId;
    }

    private String toString(Integer i) {
        return i.toString();
    }


    public int getTotalSlots() {
        return totalSlots;
    }

    boolean slotAvailable(String slot){
        return true;
    }

}
