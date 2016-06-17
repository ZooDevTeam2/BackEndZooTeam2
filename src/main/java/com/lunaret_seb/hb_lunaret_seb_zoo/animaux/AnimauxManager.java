package com.lunaret_seb.hb_lunaret_seb_zoo.animaux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AnimauxManager {

	
	private static AnimauxManager instance = null;
	private static List<Animaux> AnimauxList;
	
	public static AnimauxManager getInstance() {
		if (instance == null) {
			instance = new AnimauxManager();
			AnimauxList = new ArrayList<Animaux>();
			AnimauxList.add(new Animaux("kiki", "mouse", new Date("2016/06/05"), 1));
			AnimauxList.add(new Animaux("riri", "mouse", new Date("2015/05/04"), 1));
			AnimauxList.add(new Animaux("lili", "mouse", new Date("2014/04/03"), 1));
		}
		return instance;
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
