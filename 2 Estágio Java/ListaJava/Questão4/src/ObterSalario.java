
public class ObterSalario {
	public float validarSalario(float salario){
		
		if(salario <= 500){
			
			return salario;
		}
		
		else{
			return 0;
		}
		
	}

	
	public float calcularSalario(float salario){
		/**
		 * 20 é a taxa de aumento do salario
		 */
		float resultado = (salario*20)/100; 
		
		return resultado;
	}


}