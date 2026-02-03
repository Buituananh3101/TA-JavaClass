Tên bài tập: MOOC.fi - Different Kinds of Boxes
1. Lớp cơ sở (có sẵn): Item và Box
Đầu tiên, bạn cần tạo 2 lớp cơ sở. Đây là luật chơi mà bạn không được đổi.

Class Item (Đơn giản)

name (String)

weight (int) - Lưu ý: weight không bao giờ âm.

Constructor: Item(String name, int weight)

Override equals và hashCode để so sánh Item dựa trên tên (quan trọng cho logic tìm kiếm sau này).

Abstract Class Box (Trừu tượng)

Phương thức trừu tượng (Bạn phải tự nghĩ cách hiện thực ở lớp con):

abstract void add(Item item): Thêm đồ vào hộp.

abstract boolean isInBox(Item item): Kiểm tra đồ có trong hộp không.

Phương thức có sẵn (Giúp bạn thêm nhiều đồ cùng lúc):

void add(ArrayList<Item> items): Duyệt list và gọi hàm add đơn ở trên cho từng món.

2. Thử thách: Hiện thực 3 loại hộp "kỳ quái"
Nhiệm vụ của bạn là viết 3 class con kế thừa Box, mỗi class có một logic override hoàn toàn trái ngược nhau.

Level 1: BoxWithMaxWeight (Hộp có giới hạn trọng lượng)

Constructor: BoxWithMaxWeight(int capacity)

Logic Override:

add(Item item): Chỉ được thêm vào nếu tổng trọng lượng hiện tại + trọng lượng món mới <= capacity. Nếu quá, không làm gì cả (không báo lỗi, chỉ lẳng lặng không thêm).

isInBox(Item item): Trả về true nếu món đó đã được thêm vào hộp.

Level 2: OneItemBox (Hộp chỉ chứa đúng 1 món)

Constructor: OneItemBox()

Logic Override:

add(Item item): Chỉ được thêm vào nếu trong hộp chưa có món nào. Nếu đã có rồi thì món mới bị từ chối.

isInBox(Item item): Trả về true nếu món đó là món duy nhất đang nằm trong hộp.

Level 3: MisplacingBox (Hộp "Thất lạc" - Chiếc túi không đáy)

Constructor: MisplacingBox()

Logic Override:

add(Item item): Luôn luôn nhận mọi món đồ, bất kể bao nhiêu, bất kể nặng nhẹ.

isInBox(Item item): Luôn trả về false. (Đây là điểm thú vị: Bạn bỏ đồ vào được, nhưng khi tìm lại thì nó bảo "không có". Giống như bạn bỏ chìa khóa vào túi và quên mất nó ở đâu).

Tại sao bài này hay (và khó)?
Tư duy Override: Bạn thấy đấy, cùng là hành động add, nhưng:

BoxWithMaxWeight quan tâm số học (cộng trừ trọng lượng).

OneItemBox quan tâm trạng thái (null hay not null).

MisplacingBox quan tâm hành vi "lừa dối" (nhận vào nhưng chối bỏ sự tồn tại).

Kiểm thử Đa hình: Trong hàm main, bạn có thể khai báo Box box = new ... và tráo đổi các loại hộp. Code kiểm tra của bạn sẽ không thay đổi, nhưng kết quả chạy sẽ khác nhau hoàn toàn tùy thuộc vào loại hộp bạn đã new.

Gợi ý triển khai (Hint)
Với BoxWithMaxWeight: Bạn cần một List<Item> bên trong để lưu đồ thật và một biến currentWeight để theo dõi tổng trọng lượng.

Với OneItemBox: Bạn có thể dùng List hoặc chỉ cần một biến private Item item;. Nếu biến này khác null nghĩa là hộp đã đầy.

Với MisplacingBox: Bạn có cần lưu trữ List<Item> không? Thực ra là... tùy bạn. Vì isInBox luôn trả về false, nên dù bạn có lưu hay không thì kết quả đầu ra vẫn đúng. Nhưng để "đúng đạo đức lập trình", bạn vẫn nên lưu nó vào list (dù không bao giờ tìm thấy nó).