package instruction;

import data.Address;
import data.Data;
import data.Memory;
import program.ProgramCounter;

public class Add extends Expression {
    
    
	public Add(Data data1, Data data2, Address address) {
		super(data1, data2, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute(Memory m, ProgramCounter counter) {

		operation(m, data1, data2, address);
		return counter.getCounter() + 1;
	}

	@Override

	protected void operation(Memory m,Data d1, Data d2, Address address1) {
		address.getValue(m).add(d1.getValue(m), d2.getValue(m));
		
	}
	
	public String toString(){
		return "ADD " + data1 + " " + data2 + " "+ address;
	}

}
