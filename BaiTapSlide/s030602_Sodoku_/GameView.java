package BaiTapSlide.s030602_Sodoku_;

import java.util.Scanner;

public class GameView {
    private Scanner scanner;

    public GameView() {
        this.scanner = new Scanner(System.in);
    }

    // Hiển thị game
    public void printBoard(Node[][] grid) {
        System.out.println("\n--- SUDOKU GAME ---");
        System.out.println("   1 2 3   4 5 6   7 8 9"); // Chi so cot cho de nhin
        System.out.println("  -----------------------");
        
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + "| "); // Chi so dong
            for (int j = 0; j < 9; j++) {
                int val = grid[i][j].getValue();
                if (val == 0) {
                    System.out.print(". "); // Dấu chấm đại diện cho ô trống
                } else {
                    System.out.print(val + " ");
                }
                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0) System.out.println("  -----------------------");
        }
    }

    // Nhap du lieu (tra ve mang 3 phan tu: row, col, value)
    public int[] getUserInput() {
        System.out.println("Nhap nuoc di (Dong Cot Gia_tri) hoac '-1' de thoat: ");
        System.out.print(">> ");
        try {
            int r = scanner.nextInt();
            if (r == -1) return new int[]{-1, -1, -1}; // Ma thoat
            int c = scanner.nextInt();
            int v = scanner.nextInt();
            // Tru 1 o row va col vi nguoi dung nhap 1-9, mang chay 0-8
            return new int[]{r - 1, c - 1, v};
        } catch (Exception e) {
            scanner.nextLine(); // Clear buffer
            return null; // Loi nhap lieu
        }
    }

    public void showMessage(String message) {
        System.out.println("[INFO]: " + message);
    }
    
    public void showError(String error) {
        System.out.println("[ERROR]: " + error);
    }
}