package com.lunaret_seb.hb_lunaret_seb_zoo;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;

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
	
	public Collection<E> findAll(){
		return null;
	}
	
}
