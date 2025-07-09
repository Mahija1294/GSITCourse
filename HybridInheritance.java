package myfirstpackage;

//Base class
class Device {
String brand;

Device(String brand) {
   this.brand = brand;
}

void powerOn() {
   System.out.println(brand + " device is powering on...");
}
}

//Interface 1
interface Camera {
void takePhoto();
void recordVideo();
}

//Interface 2
interface MusicPlayer {
void playMusic();
void stopMusic();
}

//Child class with hybrid inheritance
class SmartPhone extends Device implements Camera, MusicPlayer {

SmartPhone(String brand) {
   super(brand);
}

// Camera methods
public void takePhoto() {
   System.out.println("Taking a photo...");
}

public void recordVideo() {
   System.out.println("Recording a video...");
}

// MusicPlayer methods
public void playMusic() {
   System.out.println("Playing music...");
}

public void stopMusic() {
   System.out.println("Stopping music...");
}
}

public class HybridInheritance {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("Samsung");

	     phone.powerOn();         // From Device (class)
	     phone.takePhoto();       // From Camera (interface)
	     phone.recordVideo();     // From Camera (interface)
	     phone.playMusic();       // From MusicPlayer (interface)
	     phone.stopMusic(); // From MusicPlayer (interface)

	}

}
