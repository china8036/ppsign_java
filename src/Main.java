
import ppsign.Sign;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
          String msg = "Hello im a msg";
          String sign = "S5Ty0M31bnBmCQTIxNu4nv7w6lIP/8jlqYap6Ss7Ne0QdAt9iXouNsfRBz6EA/RjSu/v/wDA8UboqmAkpT1xdoZvkzpGVojkJv50JeiT+OByXyKIa2aMcJgUIA4vjFcImxb/Ege0lp3/78JVsOksLX+iSfwKg0AT++m2C9Avrjn6zSCbzIoeDY68ybopDCUDF/FO/B+3TZLB5rmOqx6L3f4ob1XJF7ntiH4FvIHEdQh/vWl5K5usLbxfynYm3TntyQkmGcyfYA2E6wMSmss3eSOov/jmyjX7eZxkaeaiN6BIelZnErzaQw4DHjV55z1KvVPUjDvOgBSuo7R5is/riA==";
       
         try {

           boolean bl = Sign.very(msg, "D:\\eclipse-workspace\\ppsign\\src\\01.crt", sign);
           System.out.println(bl);
         }catch(Exception e) {
        	 e.printStackTrace();
         }
    
	}

	

    
}  
