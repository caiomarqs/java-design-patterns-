package aula7;

public class ConcluirPedidoCommand implements Comando{

	private Pedido p;

	public ConcluirPedidoCommand(Pedido p) {
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Concluindo pedido do: " + this.p.getCliente());
		p.finaliza();
	}

}
