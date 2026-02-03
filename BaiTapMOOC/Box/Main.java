package BaiTapMOOC.Box;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- TEST 1: Hop gioi han can nang (Max 10) ---");
        Box box1 = new BoxWithMaxWeight(10);
        box1.add(new Item("Sach", 5)); 
        box1.add(new Item("Laptop", 5)); // Tong 10 -> OK
        box1.add(new Item("Chuot", 1));  // Tong 11 -> Fail (Khong them)

        System.out.println("Sach co trong hop? " + box1.isInBox(new Item("Sach")));   // Mong doi: true
        System.out.println("Laptop co trong hop? " + box1.isInBox(new Item("Laptop"))); // Mong doi: true
        System.out.println("Chuot co trong hop? " + box1.isInBox(new Item("Chuot")));   // Mong doi: false


        System.out.println("\n--- TEST 2: Hop mot mon ---");
        Box box2 = new OneItemBox();
        box2.add(new Item("Nhan kim cuong", 1));
        box2.add(new Item("Cuc da", 5)); // Da co nhan roi, da khong vao duoc

        System.out.println("Nhan co trong hop? " + box2.isInBox(new Item("Nhan kim cuong"))); // Mong doi: true
        System.out.println("Da co trong hop? " + box2.isInBox(new Item("Cuc da")));           // Mong doi: false


        System.out.println("\n--- TEST 3: Hop lang tri ---");
        Box box3 = new MisplacingBox();
        box3.add(new Item("Tien", 100));
        box3.add(new Item("Vang", 50));

        System.out.println("Tien co trong hop? " + box3.isInBox(new Item("Tien"))); // Mong doi: false
        System.out.println("Vang co trong hop? " + box3.isInBox(new Item("Vang"))); // Mong doi: false
    }
}
