Node           | Lớp đại diện cho một ô trong bảng Sudoku.
Game           | Lớp chứa dữ liệu bàn cờ (Node[][]) và logic kiểm tra (validate).
GameView       | Lớp chịu trách nhiệm hiển thị ra màn hình Console và nhận dữ liệu từ bàn phím.
GameController | Thực hiện vòng lặp while và kết nối Model với View.
Main           | Khởi tạo dữ liệu mẫu và chạy ứng dụng.


1. Từ chương trình Sodoku đã được xây dựng, hãy thiết kế lại chương trình theo cách tiếp cận OOP.
– Các đối tượng chính của bài toán bao gồm: Node, Game.
– Node:
• Thuộc tính: x, y, value
• Phương thức: getters, setters, …
– Game:
• Thuộc tính: Node[][]
• Phương thức: validate (row, column, zone), validate game.
– Chương trình chính:
• Khởi tạo game từ mảng tĩnh.

– Tách các lớp theo mô hình MVC: model, view, controller.
– View: thực hiện nhập dữ liệu, hiển thị game.
– Controller: thực hiện vòng lặp while điều khiển chương trình.
