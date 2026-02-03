package BaiTapMOOC.Box;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int cap;
    private int n;
    private ArrayList<Item> box;
    // Gợi ý: Cần 1 list để lưu đồ và 1 biến int để lưu cân nặng hiện tại
    
    public BoxWithMaxWeight(int cap) {
        this.cap = cap;
        this.box = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        // TODO: Kiểm tra xem nếu thêm item này vào thì có vượt quá capacity không?
        // Nếu không vượt -> thêm vào list, tăng cân nặng hiện tại.
        // Nếu vượt -> không làm gì cả.
        if(cap>=n+item.getWeight()){
            box.add(item);
            n+=item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        // TODO: Kiểm tra item có trong list không
        return box.contains(item);
    }
}
