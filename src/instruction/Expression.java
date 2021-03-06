package instruction;

import data.Address;
import data.Data;
import data.Memory;

public abstract class Expression implements Instruction {
	
	protected Data data1, data2;
	protected Address address;
	
	public Expression(Data d1, Data d2, Address address){
		this.data1 = d1;
		this.data2 = d2;
		this.address = address;
		
	}
	
	protected abstract void operation(Memory m, Data data1 , Data data2, Address adress1);
	
	public int execute(Memory m, int i){
		operation(m, data1, data2, address);
		return ++i;		
	}
}
