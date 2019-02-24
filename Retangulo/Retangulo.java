
public class Retangulo {
	
	private Float comprimento;
	private Float largura;
	
	Valida val = new Valida();
	
	public Float getLargura() {
		return largura;
	}
	public void setLargura( Float largura ) {
		val.validador( largura );
		this.largura = largura;
	}
	
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento( Float comprimento ) {
		val.validador( comprimento );
		this.comprimento = comprimento;
	}	
	
	public void Calculo() {
		Float area = getLargura() * getComprimento();
		Float perimetro = (2 * getLargura()) + (2 * getComprimento());
		System.out.println( " Área: " + area );
		System.out.println( " Perímetro: " + perimetro );
	}
}
