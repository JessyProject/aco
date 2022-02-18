package Types;
public class IntegerGType {
	
	private int value;
	
	public IntegerGType() {
		value = 0;
	}
	
	public IntegerGType(int i) {
		value = i;
	}

	public void nextValue() {
		value++;		
	}
	
	public int getValue() {
		return value;		
	}

	public String printValue() {
		return String.valueOf(value);
	}

	public String toString() {
		return printValue();
	}
	

	public IntegerGType cloneValue() {
		IntegerGType integer = new IntegerGType();
		integer.value = value;
		return integer;
	}

}
