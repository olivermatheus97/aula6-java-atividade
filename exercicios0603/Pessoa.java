package exercicios0603;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private String cidade;
	private LocalDate anoNascimento;

	public Pessoa(String nome, String sobreNome, String cidade, String anoNascimento) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cidade = cidade;
		this.anoNascimento = LocalDate.parse(anoNascimento);

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return this.sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public LocalDate getDataNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(LocalDate anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getIdade() {
		LocalDate dataAtual = LocalDate.now();
		return dataAtual.getYear() - this.anoNascimento.getYear();
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSobrenome: " + sobreNome + "\nCidade: " + cidade + "\nSua idade:  "
				+ this.getIdade();
	}

}