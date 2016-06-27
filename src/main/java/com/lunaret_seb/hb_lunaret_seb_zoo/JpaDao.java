package com.lunaret_seb.hb_lunaret_seb_zoo;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class JpaDao <K, E> implements Dao<K, E>  {

	protected Class<E> entityClass;
	@Inject
	protected EntityManager entityManager;

	public JpaDao() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
	}

	public void persist(E entity) {
		entityManager.persist(entity);
	}

	public void remove(E entity) {
		entityManager.remove(entity);
	}

	public E findById(K id) {
		return entityManager.find(entityClass, id);
	}
	
	@Override
	public List<E> findAll() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<E> cq = cb.createQuery(this.entityClass);
		Root<E> root = cq.from(this.entityClass);
		
		cq.select(root);
		TypedQuery<E> q = entityManager.createQuery(cq);
		List<E> allEntities = q.getResultList();
		
		return allEntities;
	}
	
}
