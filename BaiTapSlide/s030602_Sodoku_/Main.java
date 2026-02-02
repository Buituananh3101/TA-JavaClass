package BaiTapSlide.s030602_Sodoku_;

public class Main {
    public static void main(String[] args) {
        // Mảng tĩnh (Static array) khởi tạo Game
        // Số 0 đại diện cho ô trống cần điền
        int[][] sampleBoard = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        // Khởi tạo các thành phần MVC
        Game model = new Game(sampleBoard);
        GameView view = new GameView();
        GameController controller = new GameController(model, view);

        // Chạy chương trình
        controller.play();
    }
}
