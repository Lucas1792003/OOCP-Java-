import static java.lang.Integer.parseInt;



public class Building {
    private String name;
    private Room[][] rooms;
    private int numberOfFloors;

    Building(String name) {
        this.name = name;
        this.numberOfFloors=4;
        prepareBuilding();
    }

    Building(String name,int numberOfFloors) {
        this.name = name;
        this.numberOfFloors=numberOfFloors;
        prepareBuilding();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean reserve(String roomNumber) {
        try {
            int floor=Integer.parseInt(roomNumber.charAt(1)+"");
            int room=Integer.parseInt(roomNumber.charAt(3)+"");
            return this.rooms[floor][room].reserve();
        } catch (Exception e) {
            return false;
        }

    }

    public boolean reserve(int roomType) {
        if (roomType == Room.STANDARD) {
            for (int i = 0; i <= 1; ++i) {
                for (int j = 0; j < this.rooms[i].length; ++j) {
                    if (this.rooms[i][j].isVacant()) {
                        return this.rooms[i][j].reserve();
                    }
                }
            }
        } else if (roomType == Room.DELUXE) {
            for (int j = 0; j < this.rooms[2].length; ++j) {
                if (this.rooms[2][j].isVacant()) {
                    return this.rooms[2][j].reserve();
                }
            }
        } else if (roomType == Room.SUITE) {
            for (int j = 0; j < this.rooms[3].length; ++j) {
                if (this.rooms[3][j].isVacant()) {
                    return this.rooms[3][j].reserve();
                }
            }
        }

        return false;
    }

    public int getTotalFloorValue(int floor) {
        if (floor == 0 || floor == 1) {
            return 100 * this.rooms[floor].length;
        }
        if (floor == 2) {
            return 200 * this.rooms[floor].length;
        }

        if (floor == 3) {
            return 400 * this.rooms[floor].length;
        }

        return 0;
    }

    public int getTotalValue() {
        return this.getTotalFloorValue(0)
                + this.getTotalFloorValue(1) +
                this.getTotalFloorValue(2)
                + this.getTotalFloorValue(3);
    }

    public int getTotalRevenue() {
        int total = 0;
        for (Room[] floor : this.rooms) {
            for (Room room : floor) {
                if(room.isVacant()==false) {
                    if (room.getRoomType()==1) {
                        total += 100;
                    }else if(room.getRoomType()==2) {
                        total += 200;
                    }else if(room.getRoomType()==3) {
                        total += 400;
                    }
                }}}
        return total;
    }
    public int getTotalRevenueCountByType(int type) {
        int typeCount = 0;
        for (Room[] floor : this.rooms) {
            for (Room room : floor) {
                if(room.isVacant()==false) {
                    if (room.getRoomType()==1&&room.getRoomType()==type) {
                        typeCount++;
                    }else if(room.getRoomType()==2&&room.getRoomType()==type) {
                        typeCount++;
                    }else if(room.getRoomType()==3&&room.getRoomType()==type) {
                        typeCount++;
                    }
                }}}
        return typeCount;
    }


    public void displayVacancies() {
        for (Room[] floor : this.rooms) {
            for (Room room : floor) {
                if (room.isVacant()) {
                    System.out.print(this.name+room.getRoomNumber() + " | ");
                }
            }
            System.out.println();
        }
    }

    public void displayVacancies(int roomType) {
        for (int i = 0; i <this.rooms.length; ++i) {
            for (int j = 0; j < this.rooms.length; ++j) {
                if (this.rooms[i][j].isVacant()&&this.rooms[i][j].getRoomType()==roomType) {
                    System.out.print(this.name+this.rooms[i][j].getRoomNumber()+" | ");
                }
            }
            System.out.println();
        }
    }

    private void prepareBuilding() {
        this.rooms = new Room[this.numberOfFloors][4];
        for (int i = 0; i < this.rooms.length; ++i) {
            for (int j = 0; j < this.rooms[0].length; ++j) {
                if (i == 0 || i == 1) {
                    this.rooms[i][j] = new Room("" + i + j, Room.STANDARD);
                } else if (i == 2) {
                    this.rooms[i][j] = new Room("" + i + j, Room.DELUXE);
                } else {
                    this.rooms[i][j] = new Room("" + i + j, Room.SUITE);
                }
            }
        }


    }
}
