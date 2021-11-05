
public class MultiplosdeDez {
	public static void main(String[] args) {
		
		int i=0, result;
		
		do {
			result = i % 10;
			
			if (result == 0){
				System.out.println(i+" - Múltiplo de 10");
			}else {
				System.out.println(i);
			}
		i++;	
		}while (i<301);
	}

}

