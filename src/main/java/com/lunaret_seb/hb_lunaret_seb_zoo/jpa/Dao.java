package com.lunaret_seb.hb_lunaret_seb_zoo.jpa;

import java.util.Collection;

public interface Dao<K, E> {

	E findById(K id);

	void persist(E entity);

	void remove(E entity);

	Collection<E> findAll();
}
