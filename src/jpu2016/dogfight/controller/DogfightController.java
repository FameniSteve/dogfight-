package jpu2016.dogfight.controller;

public class DogfightController implements IOrderPerformer {

	private int TIME_SLEEP=30;
	private IDogfightModel dogfightModel;
	
	public DogfightController(IDogfightModel dogfightModel) {
	
		this.dogfightModel= dogfightModel;
		
	public void orderPerform(UserOrder userOrder) {
		this.userOrder= userOrder;
	}
	
	public void Play() {
		
	}
	
	}
	
}
