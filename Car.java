
public class Car {
String color;
String type;
String desc;

public String getDescription() {
	this.desc = "This is a " + color + " " + type;
	return this.desc;
}
}
