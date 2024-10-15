public class Principal extends Aplication {
	public static void main(String [] args) {
		launch(Application, args);
	}	
}



public class Application(Stage stage) {
	private TextField txtId = new TextField();
	private TextField txtConteudo = new TextField();
	private TextField txtAcompanhamento = new TextField();
	private TextField txtNumeroMesa = new TextField();
	private PedidoControl control = new PedidoControl();
	
	public static void start(Stage stage) {
		GridPane grid = new GridPane();
		Scene scene = new Scene(grid, 500, 400);
		scene.setTitle("Hamburgueria BaconBom - Pedidos");

		Label lbId = new Label("ID");
		Label lbConteudo = new Label("CONTEUDO");
		Label lbAcompanhemento = new Label("ACOMPANHAMENTO");
		Label lbNumeroMesa = new Label("NUMERO DA MESA);
		Button btnAdcionar = new Button("Adcionar");
		Button btnPesquisar = new Button("Pesquisar");

		grid.add(lbId, 0, 0);
		grid.add(txtId, 1,0);
		grid.add(lbConteudo, 0, 1);
		grid.add(txtConteudo, 1, 1);
		grid.add(lbAcompanhamento, 0, 2);
		grid.add(txtAcompanhamento, 1, 2);
		grid.add(lbNumeroMesa, 0, 3);
		grid.add(txtNumeroMesa, 1, 3);
		grid.add(btnAdcionar, 0, 4);
		grid.add(btnPesquisar, 1, 4);

		btnAdcionar.setOnAction( e -> {
			control.adcionar(BoundaryToEntity());
			txtId.setText("");
			txtConteudo.setText("");
			txtAcompanhamento.setText("");
			txtNumeroMesa.setText("");	
		});

		btnPesquisar.setOnAction(e -> {
			String conteudo = txtConteudo.getText();
			Pedido procurado = control.pesquisar(conteudo);
			if (procurado != null) EntityToBoundary(procurado);
		});
	}

	public void EntityToBoundary(Pedido p) {
		txtId.setText(p.getId());
		txtConteudo.setText(p.getConteudo());
		txtAcompanhamento.setText(p.getAcompanhamento());
		txtNumeroMesa.setText(p.getNumeroMesa());
	}

	public Pedido BoundaryToEntity() {
		Pedido novoPedido;
		novoPedido.setId(txtId.getText());
		novoPedido.setConteudo(txtConteudo.getText());
		novoPedido.setAcompanhamento(txtAcompanhamento.getText());
		novoPedido.setNumeroMesa(txt.NumeroMesa.getText));
		return novoPedido;
	}
}



public class PedidoControl {
	List<Pedido> pedidos;

	public void pedidoControl() {
		this.pedidos = new ArrayList<>();
	}

	public void adcionar(Pedido p) {
		this.pedidos.add(p);
	}

	public Pedido pesquisar(String conteudo) {
		Pedido pedidoPesquisado = null;
		for(Pedido p : pedidos) {
			if(p.getConteudo.EqualsIgnoreCase(conteudo)) pedidoPesquisado = p;
		}
		return pedidoPesquisado;
	}
}



public class Pedido {
	private long id;
	private String conteudo;
	private String acompanhamento;
	private int numeroMesa;

	public void setId(String id) {
		this.id = Long.parseLong(id);
	}
	
	public String getId() {
		return String.ValueOff(this.id);
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return this.conteudo;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	public String getAcompanhamento() {
		return this.acompanhamento;
	}

	public void setNumeroMesa(String numeroMesa) {
		this.numeroMesa = Integer.parseInt(numeroMesa);
	}

	public String getNumeroMesa(String numeroMesa) {
		return String.ValueOff(numeroMesa);
	}

}

