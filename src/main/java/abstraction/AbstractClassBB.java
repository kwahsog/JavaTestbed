package abstraction;

/** Test class extends AbstractClassA. C>B>A. BB>A
 * 
 *
 */
public class AbstractClassBB extends AbstractClassA {


	public AbstractClassBB(int index, String Name) {
		super(index, Name);
	}

	@Override
	public void setIndex(int index) {
		this.index = 3;
	}

	public void output(){
		System.out.println("This is AbstractClassBB: "+index+" "+Name);
	}
	
}
