
package soal2;

public class item {
private String name;
private item() {
name = "Ipin";
}
public item(String name) { 
   this();//Sebagai pemanggilan constructor pada class yang sama
    System.out.println(this.name);
}
}