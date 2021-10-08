
package soal1;


public class Barang {
String kode_barang;
String nama_barang;
private int stok;

/*Dengan penggunaan enkapsulasi, maka terjadi pembatasan nilai variabel
pada operasi tertentu*/
public void setStok(int stok){
    this.stok+=stok;
} 
int getStok(){
    return stok;
}

public Barang(String kode, String nama, int stk) { 
kode_barang = kode;
nama_barang = nama; 
stok = stk;
    }
}


