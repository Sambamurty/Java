package LooseCoupling;



public class Mario implements Operation {

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move Forward");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move Backward");
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Sit");
	}

}
