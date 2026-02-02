package BaiTapSlide.s030602_Sodoku_;

public class GameController {
    private Game game;
    private GameView view;

    public GameController(Game game, GameView view) {
        this.game = game;
        this.view = view;
    }

    public void play() {
        boolean isRunning = true;

        // Vong lap while dieu khien chuong trinh
        while (isRunning) {
            // 1. View hien thi game
            view.printBoard(game.getGrid());

            // 2. View nhan du lieu
            int[] input = view.getUserInput();

            if (input == null) {
                view.showError("Nhap sai dinh dang. Vui long nhap so nguyen.");
                continue;
            }

            if (input[0] == -1) {
                view.showMessage("Da thoat game.");
                break;
            }

            int row = input[0];
            int col = input[1];
            int val = input[2];

            // 3. Kiem tra bien
            if (row < 0 || row > 8 || col < 0 || col > 8 || val < 1 || val > 9) {
                view.showError("Toa do hoac gia tri khong hop le (1-9).");
                continue;
            }

            // 4. Lay Node tu Model
            Node node = game.getNode(row, col);

            if (node.isFixed()) {
                view.showError("Khong the thay doi o co dinh!");
                continue;
            }

            // 5. Model validate logic
            if (game.validateMove(row, col, val)) {
                node.setValue(val);
                view.showMessage("Di thanh cong!");
                
                // Kiem tra thang
                if (game.isGameComplete()) {
                    view.printBoard(game.getGrid());
                    view.showMessage("CHUC MUNG! BAN DA GIAI THANH CONG SUDOKU.");
                    isRunning = false;
                }
            } else {
                view.showError("Nuoc di sai luat (trung hang, cot hoac vung 3x3).");
            }
        }
    }
}
