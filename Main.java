public class Main{

	public static void main(String[] args) {
			System.out.println(potencia(2,5));
		new MyFrame();
		
	}
	private static int potencia(int base, int potencia){
			
	    if (potencia < 1) return 1; //base case
	    return base * potencia(base, potencia - 1); //recursive case
	}
}
