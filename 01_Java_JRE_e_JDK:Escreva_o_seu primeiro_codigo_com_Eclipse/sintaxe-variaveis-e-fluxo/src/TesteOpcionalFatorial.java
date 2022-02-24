
public class TesteOpcionalFatorial {

	public static void main(String[] args) {
		
		for(int fatorialDe = 1; fatorialDe <= 10; fatorialDe++) {
			System.out.println(fatorialDe);
			int resultadoFatorial = 1;
			for(int n = fatorialDe; n != 1; n--) {
				resultadoFatorial *= n;
			}
			System.out.println(resultadoFatorial);			
		}
	
	}
}
