
class KelasSatu{
/*instance initialization block yang akan muncul
 ketika dideklarasikan dengan format KelasSatu() pada kelas
 yang sama atau melalui pembangunan khusus pada kelas berbeda 
 Namun, setelah static initialization block*/
{System.out.println(11);}
/*Static initialization block merupakan blok statis yang dimunculkan
lebih awal sebelum instance initialization block setelah awal pendeklarasian
class*/
static{System.out.println(2);}
/*Merupakan constructor yang mempunyai parameter*/
public KelasSatu(int i){System.out.println(3);}
/*Merupakan constructor tanpa parameter*/
public KelasSatu(){System.out.println(4);}
}