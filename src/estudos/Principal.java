package estudos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import dao.EditoraDAO;
import dao.LivroDAO;


@SuppressWarnings("deprecation")
public abstract class Principal {

	public static void main(String[] args) {
		try {
			HibernateUtil.begin();
			Session s = HibernateUtil.getSession();
			
			EditoraDAO dao = new EditoraDAO();		
			
			// DAO Cascade
			/*
			Editora editora = new Editora();
			editora.setCodigo(141);
			editora.setRazaoSocial("Editora 3");
			editora.setNomeFantasia("Sarra");
			editora.setRua("André das Ruas");
			editora.setCep("19.800");
			editora.setCidade("Assis");
			editora.setCnpj("12342134");
			editora.setNumero("8565");
			editora.setPais("Brasil");
			editora.setEstado("Sao Paulo");
			
			
			Livro l1 = new Livro();
			
			l1.setEditora(editora);
			l1.setNome("AA");
			l1.setAutor("Juca");
			l1.setEdicao("UM");
			l1.setIsbn("53235");
			l1.setLinguagem("Portugues");
			l1.setPaginas("345");
			l1.setPreco("78");
			l1.setTipoCapa("Capa Dura");
			
			
			Livro l2 = new Livro();
			
			l2.setEditora(editora);
			l2.setNome("BBB");
			l2.setAutor("Simmon Haykin");
			l2.setEdicao("UM");
			l2.setIsbn("53235");
			l2.setLinguagem("English");
			l2.setPaginas("345");
			l2.setPreco("78");
			l2.setTipoCapa("Hard Cape");
			
			
			Livro l3 = new Livro();
			
			l3.setEditora(editora);
			l3.setNome("C");
			l3.setAutor("Robert D. Jr.");
			l3.setEdicao("UM");
			l3.setIsbn("53235");
			l3.setLinguagem("Ingles");
			l3.setPaginas("345");
			l3.setPreco("78");
			l3.setTipoCapa("Soft Cape");
			
			editora.getLivros().add(l1);
			editora.getLivros().add(l2);
			editora.getLivros().add(l3);
			
			dao.cadastrar(editora);
			System.out.println("Editora cadastrada com sucesso");
	
			// DAO Cadastrar Editora
			
			/*Editora novaEditora = new Editora();
			novaEditora.setRazaoSocial("Editora das Rosas");
			novaEditora.setNomeFantasia("Simba");
			novaEditora.setRua("André Perine");
			novaEditora.setCep("19.800");
			novaEditora.setCidade("Assis");
			novaEditora.setCnpj("12342134");
			novaEditora.setNumero("8565");
			novaEditora.setPais("Brasil");
			novaEditora.setEstado("Sao Paulo");
			
			dao.cadastrar(novaEditora);
			System.out.println("Editora cadastrada com sucesso");*/
			
			// DAO Excluir Editora
			
			/*Editora edt = (Editora) s.load(Editora.class, 3);
			dao.excluir(edt);
			System.out.println("Editora excluida com sucesso");*/
			
			// DAO Listar Editoras
			
			/*Criteria criteria = s.createCriteria(Editora.class);
			List<Editora> resultado = criteria.list();
			System.out.println("Lista de Editoras Cadastradas\n");
			for (Editora ed : resultado){
				System.out.println(ed.getRazaoSocial());
			}*/
			
			//Criteria eq
			
			/*
			Criteria criteria = s.createCriteria(Editora.class);
			
			/*
			// É igual
			criteria.add(Restrictions.eq("razaoSocial", "Vila Nova"));
			List<Editora> resultado = criteria.list();
			for (Editora edt : resultado){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}
			
			// Nao é igual
			criteria.add(Restrictions.ne("razaoSocial", "Editora das Rosas"));
			List<Editora> resultado1 = criteria.list();
			for (Editora edt : resultado1){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}*/
			/*
			// Maior que
			criteria.add(Restrictions.gt("codigo", 4));
			List<Editora> resultado2 = criteria.list();
			for (Editora edt : resultado2){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}
			
			// Menor que
			criteria.add(Restrictions.lt("codigo", 3));
			List<Editora> resultado3 = criteria.list();
			for (Editora edt : resultado3){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}
			
			// Maior ou igual
			criteria.add(Restrictions.ge("codigo", 3));
			List<Editora> resultado4 = criteria.list();
			for (Editora edt : resultado4){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}
			
			// Menor ou igual
			criteria.add(Restrictions.le("codigo", 3));
			List<Editora> resultado5 = criteria.list();
			for (Editora edt : resultado5){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}
			
			// Qualquer palavra entre
			criteria.add(Restrictions.ilike("razaoSocial", "a", MatchMode.ANYWHERE));
			List<Editora> resultado6 = criteria.list();
			for (Editora edt : resultado6){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}
			
			// Náo é nulo
			criteria.add(Restrictions.isNotNull("codigo"));
			List<Editora> resultado7 = criteria.list();
			for (Editora edt : resultado7){
			System.out.println("Codigo: "+ edt.getCodigo());
			System.out.println("Razão Social: "+ edt.getRazaoSocial());
			}
			*/
			
			//Livro
			
			LivroDAO livroDao = new LivroDAO();
			/*
			//DAO
			Editora edtitora5 = (Editora) s.load(Editora.class, 141);
			Livro livro = new Livro();
			livro.setEditora(edtitora5);
			livro.setNome("C");
			livro.setAutor("Robert D. Jr.");
			livro.setEdicao("UM");
			livro.setIsbn("53235");
			livro.setLinguagem("Ingles");
			livro.setPaginas("345");
			livro.setPreco("78");
			livro.setTipoCapa("Soft Cape");
			
			livroDao.cadastrar(livro);
			System.out.println("Livro cadastrado com sucesso!");
			*/
			/*
			Livro livro1 = (Livro) s.load(Livro.class, 8);
			livroDao.excluir(livro1);
			System.out.println("Livro excluido com sucesso");
			*/
			// DAO Listar Editoras
				/*
				Criteria criterialivro = s.createCriteria(Livro.class);
				List<Livro> resultado = criterialivro.list();
				System.out.println("Lista de Livros Cadastrados\n");
				for (Livro l : resultado){
					System.out.println(l.getNome());
				}
				*/
				//Criteria 
				
				
				Criteria criteria = s.createCriteria(Livro.class);
				
				
				// É igual
				criteria.add(Restrictions.eq("nome", "BBB"));
				List<Livro> resultado = criteria.list();
				for (Livro liv : resultado){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
				/*
				// Nao é igual
				criteria.add(Restrictions.ne("nome", "Livro"));
				List<Livro> resultado1 = criteria.list();
				for (Livro liv : resultado1){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
				
				// Maior que
				criteria.add(Restrictions.gt("codigo", 4));
				List<Livro> resultado2 = criteria.list();
				for (Livro liv : resultado2){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
				
				// Menor que
				criteria.add(Restrictions.lt("codigo", 3));
				List<Livro> resultado3 = criteria.list();
				for (Livro liv : resultado3){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
				
				// Maior ou igual
				criteria.add(Restrictions.ge("codigo", 3));
				List<Livro> resultado4 = criteria.list();
				for (Livro liv : resultado4){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
				
				// Menor ou igual
				criteria.add(Restrictions.le("codigo", 3));
				List<Livro> resultado5 = criteria.list();
				for (Livro liv : resultado5){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
				
				// Qualquer palavra entre
				criteria.add(Restrictions.ilike("nome", "a", MatchMode.ANYWHERE));
				List<Livro> resultado6 = criteria.list();
				for (Livro liv : resultado6){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
				
				// Náo é nulo
				criteria.add(Restrictions.isNotNull("codigo"));
				List<Livro> resultado7 = criteria.list();
				for (Livro liv : resultado7){
				System.out.println("Codigo: "+ liv.getCodigo());
				System.out.println("Nome: "+ liv.getNome());
				}
			*/
			HibernateUtil.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}