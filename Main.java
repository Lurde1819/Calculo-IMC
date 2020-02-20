import java.util.Scanner;

class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
	System.out.println("Informe o peso: ");
	double peso = sc.nextDouble();
	System.out.println("Informe a altura: ");
	double altura = sc.nextDouble();
	double IMC = peso /(altura * altura);
	
	if (IMC < 18.5) {
		System.out.println("IMC = "+ IMC + ", Abaixo do peso");
		
	}else if(IMC >= 18.5 && IMC < 25) { 
		System.out.println("IMC = " + IMC + ", Peso normal ");	
	}else if(IMC >= 25 && IMC <= 30) {
		System.out.println("IMC = " + IMC +", Acima do peso ");
	}else if(IMC > 30) {
		System.out.println("IMC = "+ IMC + ", Obeso");
	}
	
   sc.close();
	}

}
