package BaiTapMOOC.Box;


public class MisplacingBox extends Box {
    // private ArrayList<Item> box; // Ko có cx đc coi như ko lưu

    public MisplacingBox() {
    }

    @Override
    public void add(Item item) {
        // TODO: Luôn luôn nhận mọi món đồ (Add thoải mái)
    }

    @Override
    public boolean isInBox(Item item) {
        // TODO: Luôn luôn trả về false (Mất trí nhớ)
        return false;
    }
}