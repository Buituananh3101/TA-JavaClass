#include<bits/stdc++.h>
using namespace std;

class Laptop {
public:
    string ma, ten;
    char loai;
    int gia;

    Laptop() {}

    Laptop(string ma, string ten, char loai, int gia) {
        this->ma=ma;
        this->ten=ten;
        this->loai=loai;
        this->gia=gia;
    }

    void nhap() {
        getline(cin,ma);
        getline(cin,ten);
        cin >> loai;
        cin >> gia;
        cin.ignore(); 
    }

    void xuat() {
        cout<<ma<<endl;
        cout<<ten<<endl;
        cout<<loai<<endl;
        cout<<gia<<endl;
    }
};

void thongKe(Laptop a[], int n) {
    int ca=0, cb=0, cc=0;
    for (int i=0;i<n;i++) {
        if (a[i].loai=='A') ca++;
        else if (a[i].loai=='B') cb++;
        else cc++; 
    }
    cout << ca << " " << cb << " " << cc << endl;
}

void loaiCoNhieuLaptopNhat(Laptop a[], int n) {
    int ca=0, cb=0, cc=0;
    for (int i=0;i<n;i++) {
        if (a[i].loai=='A') ca++;
        else if (a[i].loai=='B') cb++;
        else cc++;
    }
    if (ca>=cb&&ca>=cc) cout << "A" << endl;
    else if (cb>=ca&&cb>=cc) cout << "B" << endl;
    else cout << "C" << endl;
}

void giaTienTuADenB(Laptop a[], int n, int x, int y) {
    for (int i=0;i<n;i++) {
        if (a[i].gia>=x&&a[i].gia <= y) {
            a[i].xuat();
        }
    }
}

void sapXepGiamDanTheoGia(Laptop a[], int n) {
    for (int i=0;i<n;i++) {
        for (int j=i+1;j<n;j++){
            if (a[i].gia < a[j].gia) {
                swap(a[i], a[j]);
            }
        }
    }
}

int main() {
    int n;
    cin >> n;
    cin.ignore(); 

    Laptop ds[100]; 

    for (int i=0;i<n;i++) ds[i].nhap();

    thongKe(ds, n);

    sapXepGiamDanTheoGia(ds, n);
    for(int i=0; i<n; i++) ds[i].xuat();

    return 0;
}