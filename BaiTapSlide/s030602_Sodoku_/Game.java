package BaiTapSlide.s030602_Sodoku_;

public class Game {
    private Node[][] grid;
    public static final int SIZE = 9;

    public Game(int[][] staticBoard) {
        grid = new Node[SIZE][SIZE];
        // Khởi tạo game từ mảng tĩnh
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = new Node(i, j, staticBoard[i][j]);
            }
        }
    }

    public Node[][] getGrid() {
        return grid;
    }

    public Node getNode(int row, int col) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
            return grid[row][col];
        }
        return null;
    }

    // Phương thức validate theo yêu cầu: row, column, zone
    public boolean validateMove(int row, int col, int num) {
        // 1. Kiểm tra hàng (Row)
        for (int j = 0; j < SIZE; j++) {
            if (grid[row][j].getValue() == num && j != col) return false;
        }

        // 2. Kiểm tra cột (Column)
        for (int i = 0; i < SIZE; i++) {
            if (grid[i][col].getValue() == num && i != row) return false;
        }

        // 3. Kiểm tra vùng 3x3 (Zone)
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol].getValue() == num 
                    && (i + startRow != row || j + startCol != col)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Validate toàn bộ game (kiểm tra xem đã thắng chưa)
    public boolean isGameComplete() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j].getValue() == 0) return false; // Còn ô trống
                // Kiểm tra lại tính hợp lệ của ô hiện tại
                if (!validateMove(i, j, grid[i][j].getValue())) return false;
            }
        }
        return true;
    }
}