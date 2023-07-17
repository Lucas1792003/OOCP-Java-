import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class HotelManager {
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private static Building[] buildings;
    public static void main(String[] args) throws NumberFormatException, IOException {
        HotelManager hotelManager=new HotelManager();
        prepareBuilding();
        int choice = 0;


        do{
            choice=outFeatures();
            switch (choice) {
                case 1:

                    System.out.println("Enter room number eg. A201,B202 :");
                    String roomNumber = br.readLine();
                    Building build=prepareGetBuiltByRoomName(roomNumber);
                    if(build.reserve(roomNumber)) {
                        System.out.println("Success Reserve!!");
                    }else {
                        System.out.println("Room is not available!!");
                    }
                    break;
                case 2:
                    int roomType = outType();
                    choiceRoomByTypeAllBuildings(roomType);
                    break;
                case 3:
                    for(Building b:buildings) {
                        System.out.println("For Building=:"+b.getName());
                        b.displayVacancies();
                    }

                    break;
                case 4:
                    int roomTypeVc=outType();
                    for(Building b:buildings) {
                        System.out.println("Building::"+b.getName());
                        b.displayVacancies(roomTypeVc);
                    }
                    break;
                case 5:
                    for(Building b:buildings) {
                        System.out.println("Building::"+b.getName());
                        System.out.println("Total Value"
                                +b.getName()+"::"
                                +b.getTotalValue());
                    }
                    break;
                case 6:

                    int total=0;
                    for(Building b:buildings) {

                        System.out.println("Building "+b.getName());
                        int count=b.getTotalRevenueCountByType(1);
                        System.out.println("Standard ("+count+"@ $"+count*100);
                        count=b.getTotalRevenueCountByType(2);
                        System.out.println("Deluxe ("+count+"@ $"+count*200);
                        count=b.getTotalRevenueCountByType(3);
                        System.out.println("Suite ("+count+"@ $"+count*400);
                        total+=b.getTotalRevenue();
                    }
                    System.out.println("-----------------------------");
                    System.out.println("Total Revenue"+total);
                    break;
                case 7:
                    System.exit(0);
            }
        }while(choice!=7||choice>7);
    }



    public static int outFeatures() throws NumberFormatException, IOException {
        System.out.println("1. Reserve a room by room number");
        System.out.println("2. Reserve a room by room type");
        System.out.println("3. List all vacant rooms");
        System.out.println("4. List all vacant rooms with specified room type");
        System.out.println("5. Print the total value of rooms (given the building)");
        System.out.println("6. Print the total revenu");
        System.out.println("7. Exit");
        return Integer.parseInt(br.readLine());
    }
    public static int outType() throws NumberFormatException, IOException {

        System.out.println("1.STANDARD");
        System.out.println("2.DELUXE");
        System.out.println("3.SUITE");
        return Integer.parseInt(br.readLine());
    }


    public static Building prepareGetBuiltByRoomName(String room)  {

        char c=room.charAt(0);
        if(c=='A') {
            return buildings[0];
        }else if(c=='B'){
            return buildings[1];
        }else {
            return null;
        }

    }
    public static void prepareBuilding() {
        System.out.println("<<Choice Building Do You Want To Reserve>>");
        Building aBuild = new Building("A");
        Building bBuild = new Building("B");
        buildings=new Building[2];
        buildings[0]=aBuild;
        buildings[1]=bBuild;

    }
    public static boolean choiceRoomByTypeAllBuildings(int type) {
        for(Building building:buildings) {
            if(building.reserve(type)) {
                System.out.println("Reserve room in Building="+building.getName()+"**");
                return true;
            }
        }
        System.out.println("Your Reserve a room is not available!!");
        return false;
    }
}