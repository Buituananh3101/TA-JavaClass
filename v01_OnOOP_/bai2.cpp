#include<bits/stdc++.h>
using namespace std;

class Xe{
public:
    string bien;
    float trongLuong;

    void nhap(){
        getline(cin, bien);
        cin>>trongLuong; cin.ignore();
    }
    void xuat(){
        cout<<bien<<endl;
        cout<<trongLuong<<endl;
    }

};

class XeCon : public Xe{
public:
    int soChoNgoi;

    void nhap(){
        Xe::nhap();
        cin>>soChoNgoi; cin.ignore();
    }
    void xuat(){
        Xe::xuat();
        cout<<soChoNgoi<<endl;
    }
    void duoi1TanKoQua5ChoNgoi(){
        if(soChoNgoi<=5 && trongLuong<=1000){
            xuat();
        }
    }
 
};

int demSoXeTrongLuongNhoHonX(int n, XeCon a[], float x){
    int dem=0;
    for(int i=0;i<n;i++){
        if(a[i].trongLuong < x){
            dem++;
        }
    }
    return dem;
}

void sapXepChoNgoiGiamDan(int n, XeCon a[]){
    for(int i=0;i<n;i++){
        for(int j=i+1; j<n; j++){
            if(a[i].soChoNgoi < a[j].soChoNgoi){
                swap(a[i], a[j]);
            }
        }
    }
}

int main(){
    int n;
    cin>>n;
    cin.ignore(); 

    XeCon a[n];

    for(int i=0;i<n;i++) a[i].nhap();
   
    for(int i=0;i<n;i++) a[i].xuat();
   
    for(int i=0;i<n;i++) a[i].duoi1TanKoQua5ChoNgoi();
   
    sapXepChoNgoiGiamDan(n, a);

    for(int i=0;i<n;i++) a[i].xuat();
   
    return 0;
}