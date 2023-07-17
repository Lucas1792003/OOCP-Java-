import java.io.*;

public class ItemAdmin extends Item {
    private static ObjectOutputStream out;
    ItemAdmin(String ItemName, String ItemGroup, int Itemid, float ItemPrice) {
        super(ItemName, ItemGroup, Itemid, ItemPrice);
    }

    static void ViewItem(int Itemid) throws IOException {
        System.out.println("Products ID         Products Name         Products Group         Products Price");
        System.out.println("============       ===============       ================        ================");
        for (Item i : Item.ItemList) {
            if (i.getItemid() == Itemid) {
                System.out.println("    " + i.getItemid() + "                " + i.getItemName() + "                 " + i.getItemGroup() + "                   " + i.getItemPrice());
                ItemAdmin.main(null);
            } else {
                System.out.println("Invalid id..No such Item");
            }
        }
    }


    static void AddItem() throws IOException {
        System.out.println("Enter Item Name: ");
        String Name = in.next();
        System.out.println("Enter Item Group: ");
        String Group = in.next();
        System.out.println("Enter Item id: ");
        int id = in.nextInt();
        System.out.println("Enter Item Price: ");
        float Price = in.nextFloat();

        Item New = new Item(Name, Group, id, Price);
        ItemList.add(New);
        writeto();
        System.out.print("Item added.");
        ItemAdmin.main(null);
        ItemAdmin.saveListToFile();
    }

    static void EditItem(int id) throws IOException {
        for (Item i : ItemList) {
            if (i.getItemid() == id) {
                Item old = i;
                System.out.println(toString(i));
                System.out.println("1.Change price\n2.Back");

                int choicei = in.nextInt();
                switch (choicei) {
                    case 1:
                        System.out.println("Enter updated price: ");
                        float ItemPrice = in.nextFloat();
                        Item Newe = new Item(i.getItemName(), i.getItemGroup(), i.getItemid(), ItemPrice);
                        ItemList.add(Newe);
                        ItemList.remove(old);
                        System.out.println("Price changed successfully");
                        writeto();
                        break;
                    case 2:
                        ItemAdmin.main(null);
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                ItemAdmin.main(null);
            } else {
                System.out.println("No such Item");
            }
        }
    }
    public static void saveListToFile() {
        try {
            // create a new ObjectOutputStream only once, when the program starts
            if (out == null) {
                out = new ObjectOutputStream(new FileOutputStream("Item.dat"));
            }

            // write the entire list to the file
            out.writeObject(ItemList);
            out.flush(); // flush the stream to ensure that all data is written to the file

            System.out.println("List saved to file");
        } catch (IOException e) {
            System.out.println("Error saving list to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        writeto();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            ItemList.clear();
            while (true) {
                ItemList.add((Item) in.readObject());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n1.View all Items\n2.View selected item\n3.Edit Item\n4.Add Item\n5.Back");
        int choosea2 = in.nextInt();
        switch (choosea2) {
            case 1:
                ViewAll();
                break;
            case 2:
                System.out.println("Enter id of item to be viewed");
                int itemid = in.nextInt();
                ItemAdmin.ViewItem(itemid);
                break;
            case 3:
                System.out.println("Enter id of item to be edited");
                int itemid2 = in.nextInt();
                ItemAdmin.EditItem(itemid2);
                break;
            case 4:
                ItemAdmin.AddItem();
                break;
            case 5:
                Administrator.main(args);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }


}