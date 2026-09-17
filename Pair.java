/**
 * TODO: ทำให้คลาสนี้เป็น Generic <K, V> ที่สามารถเก็บอ็อบเจกต์ได้ 2 ชนิด
 */
public class Pair<k,v> {
    // TODO: สร้างฟิลด์ private final สำหรับ key และ value
     private  final k key;
     private  final v value;
    
    // TODO: สร้าง Constructor ที่รับ key และ value

   
   public  Pair (k key, v value){
       
        this.key = key;
        this.value = value;

       }
      

    // TODO: สร้าง Getters สำหรับ key และ value

    public  k getKey(){
        return key;
    }

    public  v getValue(){
        return value;
    }
}