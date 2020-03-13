package br.com.treinar.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.treinar.model.Aluno;
import br.com.treinar.model.Telefone;
import br.com.treinar.util.Modo;

@ViewScoped
@ManagedBean
public class AlunoController {

	private Aluno aluno;
	private List<Aluno> alunos;
	private Modo modo;

	public AlunoController() {
		iniciarAluno();
		alunos = new ArrayList<>();
		modo = Modo.LISTAGEM;
	}

	public String editarAluno() {

		return "edicao";
	}

	public String cadastrarAluno() {
		System.out.println(aluno);
		alunos.add(aluno);
		iniciarAluno();
		return "";
	}

	public void editar(Aluno aluno) {
		this.aluno = aluno;
		modo = Modo.EDICAO;
	}

	private void iniciarAluno() {
		aluno = new Aluno();
		aluno.setTelefone(new Telefone());
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Modo getModo() {
		return modo;
	}

	public void setModo(Modo modo) {
		this.modo = modo;
	}

}
