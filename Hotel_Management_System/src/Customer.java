import java.lang.reflect.Array;

public class Customer {
    private String fName, lName;
    private final String[] cInDays = new String[3];
    private final String[] cOutDays = new String[3];
    private int idNo;
    private Room room;
    public String getfName() {
        return fName;
    }

    public String[] getcOutDays() {
        return cOutDays;
    }

    public void setcOutDays(String[] dys) {
        if (Array.getLength(dys) >= 0) System.arraycopy(dys, 0, this.cOutDays, 0, Array.getLength(dys));
    }

    public String[] getcInDays() {
        return cInDays;
    }

    public void setcInDays(String[] dys) {
        if (Array.getLength(dys) >= 0) System.arraycopy(dys, 0, this.cInDays, 0, Array.getLength(dys));
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getIdNo() {
        return idNo;
    }
    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
}
