package tests;

public class JogadorTeste {

	private String nome;
	private Integer gols;
	private Integer assistencias;
	
	public JogadorTeste(String nome, Integer gols, Integer assistencias) {
		super();
		this.nome = nome;
		this.gols = gols;
		this.assistencias = assistencias;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getGols() {
		return gols;
	}
	public void adicionarGol (Integer gols) {
		this.gols += gols;
	}
	public Integer getAssistencias() {
		return assistencias;
	}
	public void adicionarAssistencia (Integer assistencias) {
		this.assistencias += assistencias;
	}
	
	@Override
	public String toString() {
		return "O jogador " + this.nome + " já marcou " + this.gols + " gols e realizou " + this.assistencias + " assistencias";
	}
	
}
