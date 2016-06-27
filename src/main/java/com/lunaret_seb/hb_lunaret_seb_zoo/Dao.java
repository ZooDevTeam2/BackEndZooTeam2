package com.lunaret_seb.hb_lunaret_seb_zoo;

import java.util.Collection;
import java.util.List;

public interface Dao<K,E> {

	E findById(K id);

	Collection<E> findAll();

	void persist(E entity);

	void update(E Entity);

	void remove(int position);

}