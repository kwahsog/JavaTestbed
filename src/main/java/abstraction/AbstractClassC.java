package abstraction;

/** Test class extends AbstractClassB. C>B>A. BB>A
 * 
 *
 */

public class AbstractClassC extends AbstractClassB {

		public AbstractClassC(int index, String Name) {
			super(index, Name);
		}

		@Override
		public void setIndex(int index) {
			this.index = 2;
		}

		public void output(){
			System.out.println("This is AbstractClassC: "+index+" "+Name);
		}
		
}
