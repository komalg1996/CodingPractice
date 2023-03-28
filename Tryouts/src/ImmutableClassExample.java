
public final class ImmutableClassExample {

	private final int i;
	
	ImmutableClassExample(int i){
		this.i=i;
	}
	
	public ImmutableClassExample change(int i) {
		if(this.i==i) {
			return this;
		}else {
		return new ImmutableClassExample(i);
		}
	}
	
	public static void main(String[] args) {
		ImmutableClassExample d =new ImmutableClassExample(10);
	
		ImmutableClassExample d2=d.change(10);
		
		System.out.println(d==d2);
	}

}
