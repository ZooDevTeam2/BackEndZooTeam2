package com.lunaret_seb.hb_lunaret_seb_zoo;

import java.util.List;

public interface ICrudBase<T> {

	T getByIndex(int index);

	List<T> getAll();

	void add(T obj);

	void update(T obj, int position);

	void remove(int position);

}