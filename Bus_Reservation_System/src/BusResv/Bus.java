package BusResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity; //get and set
	
	Bus(int no,boolean ac,int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getBusNo() { //accessor
		return busNo;
	}
	
	public void setBusNo(int bno) { //mutator
		busNo = bno;
	}
	
	public boolean getAc() { //accessor
		return ac;
	}
	
	public void setAc(boolean val) { //mutator
		ac = val;
	}
	
	public int getCapacity() { //accessor
		return capacity;
	}
	
	public void setCapacity(int cap) { //accessor
		capacity = cap;
	}
	
	public void displayBusInfo()
	{
		System.out.println("Bus No:"+busNo+" AC or Non AC:"+ac+" Total Capacity:"+capacity);
	}
	
	
	
	
}
