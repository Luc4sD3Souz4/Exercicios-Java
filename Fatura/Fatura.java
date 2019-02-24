
public class Fatura {
	private String	codigo;
    private String  descricao;
    private Integer quantidade;
    private Double  preco;
    
    public Fatura( String codigo, String  descricao, String quantidade, String  preco ) {
    	this.codigo   = String.valueOf( codigo );
        this.descricao  = String.valueOf( descricao );
        this.quantidade = Integer.valueOf( quantidade );
        this.preco 	    = Double.valueOf( preco );
    }

    public void totalFatura() {
		System.out.println( "Descrição: " + descricao );		
		System.out.println( "Total: " + preco * quantidade );			
	}
}