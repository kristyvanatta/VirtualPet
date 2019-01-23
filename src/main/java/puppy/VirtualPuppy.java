package puppy;

public class VirtualPuppy {
	
	private String name;
	private int attentionLevel = 3;
	private int hungerLevel = 5;
	private int thirstLevel = 5;
	private int sleepinessLevel = 0;
	private int cleanlinessLevel = 5;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttentionLevel() {
		return attentionLevel;
	}
	public void setAttentionLevel(int attentionLevel) {
		this.attentionLevel = attentionLevel;
	}
	public int getHungerLevel() {
		return hungerLevel;
	}
	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}
	public int getThirtLevel() {
		return thirstLevel;
	}
	public void setThirstLevel(int thirstLevel) {
		this.thirstLevel = thirstLevel;
	}
	public int getSleepinessLevel() {
		return sleepinessLevel;
	}
	public void setSleepinessLevel(int sleepinessLevel) {
		this.sleepinessLevel = sleepinessLevel;
	}
	public int getCleanlinessLevel() {
		return cleanlinessLevel;
	}
	public void setCleanlinessLevel(int cleanlinessLevel) {
		this.cleanlinessLevel = cleanlinessLevel;
	}
	public VirtualPuppy(String name) {
		this.name = name;
		this.attentionLevel = attentionLevel;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.sleepinessLevel = sleepinessLevel;
		this.cleanlinessLevel = cleanlinessLevel;
	}
	public VirtualPuppy() {
		
	}
	public void play() {
		this.attentionLevel = attentionLevel -2;
		this.thirstLevel = thirstLevel +1;
		this.hungerLevel = hungerLevel +2;
		this.sleepinessLevel = sleepinessLevel + 5;
	}
	public void eat() {
		this.hungerLevel = hungerLevel -2;
		this.thirstLevel = thirstLevel +1;
		this.cleanlinessLevel = cleanlinessLevel -2;
	}
	public void drink() {
		this.thirstLevel = thirstLevel -2;
		this.cleanlinessLevel = cleanlinessLevel -1;
	}
	public void poop() {
		this.cleanlinessLevel = cleanlinessLevel +5;
		this.hungerLevel = hungerLevel +2;
		this.attentionLevel = attentionLevel +2;
	}
	public void sleep() {
		this.sleepinessLevel = sleepinessLevel -5;
		this.hungerLevel = hungerLevel +5;
		this.thirstLevel = thirstLevel +5;
		this.attentionLevel = attentionLevel +5;
	}
	public void tick() {
		this.hungerLevel = this.hungerLevel +2;
		this.thirstLevel = this.thirstLevel +1;
		this.attentionLevel = this.attentionLevel +2;
	}
}
	



