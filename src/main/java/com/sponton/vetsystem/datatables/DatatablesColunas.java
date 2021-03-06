package com.sponton.vetsystem.datatables;

public class DatatablesColunas {

	public static final String[] USUARIOS = {"email", "ativo", "perfis"};
	public static final String[] CLIENTES = {"id", "nome", "email", "telefone"};
	public static final String[] ESPECIES = {"id", "nome"};
	public static final String[] RACAS = {"id", "nome", "especie.nome"};
	public static final String[] ANIMAIS = {"id", "nome", "cliente.nome","especie.nome","raca.nome"};
	public static final String[] CONSULTAS = {"id", "data", "hora","animal.nome"};
}
