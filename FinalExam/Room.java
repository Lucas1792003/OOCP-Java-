import static java.lang.Integer.parseInt;

public class Room {
    private String roomNumber;
    private int roomType;
    private boolean isVacant;
    public static final int STANDARD = 1;
    public static final int DELUXE = 2;
    public static final int SUITE = 3;

    Room(String number, int grade) {
        this.roomNumber = number;
        this.roomType = grade;
        this.isVacant=true;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String number) {
        this.roomNumber = number;
    }

    public int getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String number) {
        this.roomType = parseInt(number);
    }

    public boolean isVacant() {
        return this.isVacant;
    }

    public boolean reserve() {
        if (!this.isVacant) {
            return false;
        }

        this.isVacant = false;
        return true;
    }
}
