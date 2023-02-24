package 포켓몬게임;

public class Pokemon {

	private String name;
	private String type;
	private String skill;
	private int hp;
	private int atk;

	// 모든 필드의 값을 매개변수로 받아서 객체를 생성하는 순간 채워주는 생성자 하나 만들기
	public Pokemon(String name, String type, String skill, int hp, int atk) {
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}
	// name , type, skill, hp, atk ---> getter 메소드

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getSkill() {
		return skill;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}
	// hp, atk ---> setter 메소드

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}
