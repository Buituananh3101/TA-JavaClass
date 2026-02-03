package BaiTapMOOC.Box;

public class OneItemBox extends Box {
    private Item box; // Box chứa một món
    
    public OneItemBox() {
        box = null;
    }

    @Override
    public void add(Item item) {
        // TODO: Nếu hộp đang rỗng (null) thì cho phép gán item vào.
        // Nếu hộp đã có đồ rồi -> mặc kệ món mới.
        if(box==null) box=item;
    }

    @Override
    public boolean isInBox(Item item) {
        // TODO: Kiểm tra item truyền vào có bằng item đang giữ không
        return box!=null && box.equals(item);
    }
}