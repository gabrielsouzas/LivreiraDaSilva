package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;

import estudos.HibernateUtil;
import estudos.Livro;

@SuppressWarnings("unchecked")
public class LivroDAO {
	
	public void cadastrar(Livro livro) throws HibernateException, Exception{
		HibernateUtil.getSession().save(livro);
	}
	
	public void excluir(Livro livro) throws HibernateException, Exception{
		HibernateUtil.getSession().delete(livro);
	}
	
	public List<Livro> getLivrosCadastradosPorNome(String nome) throws Exception{
		Criteria criteria = HibernateUtil.getSession().createCriteria(Livro.class);
		criteria.add(Expression.ilike("nome", nome, MatchMode.ANYWHERE));
		criteria.addOrder(Order.asc("nome"));
		return criteria.list();
	}

}
