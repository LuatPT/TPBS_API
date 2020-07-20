package api.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import api.entity.Trainer;

@Repository
@Transactional
public class TrainerDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Trainer> getAllTrainerDao() {
		String sql = "Select * from trainers ";
		Session session = this.sessionFactory.getCurrentSession();
		Query<Trainer> query = session.createQuery(sql, Trainer.class);
		return query.getResultList();

	}
}
