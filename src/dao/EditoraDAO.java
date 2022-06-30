package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;

import estudos.Editora;
import estudos.HibernateUtil;

@SuppressWarnings("unchecked")
public class EditoraDAO {
	
	public void cadastrar(Editora editora) throws HibernateException, Exception{
		HibernateUtil.getSession().save(editora);
	}
	
	public void excluir(Editora editora) throws HibernateException, Exception{
		HibernateUtil.getSession().delete(editora);
	}
	
	public List<Editora> getEditorasCadastradosPorRazao(String razaoSocial) throws Exception{
		Criteria criteria = HibernateUtil.getSession().createCriteria(Editora.class);
		criteria.add(Expression.ilike("razaosocial", razaoSocial, MatchMode.ANYWHERE));
		criteria.addOrder(Order.asc("razaosocial"));
		return criteria.list();
	}

}
