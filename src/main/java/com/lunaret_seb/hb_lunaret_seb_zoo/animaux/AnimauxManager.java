package com.lunaret_seb.hb_lunaret_seb_zoo.animaux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class AnimauxManager implements IAnimaux {

	private List<Animaux> AnimauxList;

	public AnimauxManager() {

		AnimauxList = new ArrayList<Animaux>();
		AnimauxList.add(new Animaux("kiki", "mouse", new Date("2016/05/05"), 1));
		AnimauxList.add(new Animaux("mimi", "rat", new Date("2016/04/25"), 2));
		AnimauxList.add(new Animaux("rififi", "capibara", new Date("2015/05/05"), 3));

	}

	public Animaux getByIndex(int index) {
		return AnimauxList.get(index);
	}

	public List<Animaux> getAll() {
		return AnimauxList;
	}

	public void add(Animaux animaux) {
		AnimauxList.add(animaux);
	}

	public void update(Animaux animaux, int position) {
		AnimauxList.remove(position);
		AnimauxList.add(animaux);
	}

	public void remove(int position) {
		AnimauxList.remove(position);
	}
}
