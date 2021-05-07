
public class IP {

	public static void main(String[] args) {
		String ip = "163.121.12.30";
        String[] arrOfStr = ip.split("\\.");
        
        int[] numbers = new int[arrOfStr.length];
        
        //System.out.println(arrOfStr[1]);
        
        for(int i = 0;i < arrOfStr.length;i++){
   
            numbers[i] = Integer.parseInt(arrOfStr[i]);
            System.out.println(numbers[i]);
        }
        

	}

}
