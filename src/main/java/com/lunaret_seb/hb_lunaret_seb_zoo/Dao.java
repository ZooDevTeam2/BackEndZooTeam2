package com.lunaret_seb.hb_lunaret_seb_zoo;

import java.util.Collection;
import java.util.List;

public interface Dao<K,E> {

	E findById(K id);

	void persist(E entity);


	void remove(E entity);
	
	Collection<E> findAll();

}