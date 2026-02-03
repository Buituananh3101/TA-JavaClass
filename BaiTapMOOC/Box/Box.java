package BaiTapMOOC.Box;

import java.util.ArrayList;

public abstract class Box {

    // Phương thức trừu tượng: Bạn PHẢI viết logic cho nó ở class con
    public abstract void add(Item item);

    // Phương thức trừu tượng: Kiểm tra xem món đồ có trong hộp không
    public abstract boolean isInBox(Item item);

    // Phương thức có sẵn: Thêm nhiều món cùng lúc
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            this.add(item); // Gọi hàm add đơn lẻ (đa hình sẽ quyết định gọi hàm nào)
        }
    }

}
