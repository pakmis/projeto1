package br.sceweb.teste_unitario;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import br.sceweb.model.Empresa;
import br.sceweb.model.EmpresaDAO;

public class UC01CadastrarEmpresa {

	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
			empresaDAO = new EmpresaDAO();
			empresa = new Empresa();
			empresa.setNomeDaEmpresa("empresa x");
			empresa.setCnpj("89424232000180");
			empresa.setNomeFantasia("empresa x");
			empresa.setEndereco("rua taquari");
			empresa.setTelefone("2222");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void excluiEmpresa() throws Exception{
		empresaDAO.exclui("89424232000180");
		}
	/*
	 * 
	 * Test1 verifica a inserção correta de uma empresa
	 */
	@Test
	public void test1() {		 
		 assertEquals(1, empresaDAO.adiciona(empresa));
	}
	/*
	 * Test2 verifica a inserção duplicada no banco de dados
	 */
	@Test
	public void test2() {
		 empresaDAO.adiciona(empresa);
		 assertEquals(1, empresaDAO.adiciona(empresa));		 
	}
	/*
	 * Test3 verifica se o cnpj inserido e valido
	 */
	@Test
	public void test3() {
		assertEquals("CNPJ valido", empresa.setCnpj("89424232000180"));
		
	}
	

}
