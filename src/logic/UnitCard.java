package logic;

import java.util.Objects;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;
	
	

	private UnitCard(String name, int bloodCost, int power, int health, String flavorText) {
		super();
		
		setName(name);
		setBloodCost(bloodCost);
		setPower(power);
		setHealth(health);
		setFlavorText(flavorText);
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		if(name.isBlank())name = "Creature";
		this.name = name;
	}



	public int getBloodCost() {
		return bloodCost;
	}



	public void setBloodCost(int bloodCost) {
		if(bloodCost < 0)bloodCost = 0;
		this.bloodCost = bloodCost;
	}



	public int getPower() {
		return power;
	}



	public void setPower(int power) {
		if(power < 0)power = 0;
		this.power = power;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		if(health < 1)health = 1;
		this.health = health;
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnitCard other = (UnitCard) obj;
		return Objects.equals(name, other.name);
	}


	public String getFlavorText() {
		return flavorText;
	}



	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}



	public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}
}
