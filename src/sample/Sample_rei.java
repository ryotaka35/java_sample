package sample;

public class Sample_rei {
	public static void main(String[] args) {
		for (int i =0 ;i<5 ;i++) {
			for(int j = 0; j<9 ;j++){
				if (i == 0){
				System.out.print("-");
				} else if (i ==1 ||i==4){
				System.out.print("-");
				} else if (i ==2){
				System.out.print("-");
				} else if (i ==3){
				System.out.print("-");
				} else {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
}