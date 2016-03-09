package abstraction;

/** Test class extends AbstractClassA. C>B>A. BB>A
 * 
 *
 */
public class AbstractClassB extends AbstractClassA {


	public AbstractClassB(int index, String Name) {
		super(index, Name);
	}

	@Override
	public void setIndex(int index) {
		this.index = 1;
	}

	public void output(){
		System.out.println("This is AbstractClassB: "+index+" "+Name);
	}
	
}
