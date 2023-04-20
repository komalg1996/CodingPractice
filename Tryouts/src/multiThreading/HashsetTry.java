package multiThreading;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetTry {

	
	public static void main(String[] args) {
		Set<Players> s = new HashSet<Players>();
		s.add(new Players(01, "akash", "aa"));
		s.add(new Players(02, "kartik", "bb"));
		s.add(new Players(03, "pratik", "bb"));
		s.add(new Players(04, "shweta", "cc"));
		s.add(new Players(05, "suraj", "bb"));
		//s.add(null);
		//s.add(new Players(05, "suraj", "bb"));

		System.out.println(s);
		
		for(Players p: s) {
			if(p.getTeam()=="bb") {
				System.out.println(p.name);
			}
		}

	}

}

class Players{
	int num;
	String name;
	String team;
	public Players(int num, String name, String team) {
		super();
		this.num = num;
		this.name = name;
		this.team = team;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Players [num=" + num + ", name=" + name + ", team=" + team + "]";
	}
	
	
}