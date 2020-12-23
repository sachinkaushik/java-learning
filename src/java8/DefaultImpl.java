package java8;

public class DefaultImpl implements InterfaceWithDefaultStatic{

	public static void main(String[] args) {
		DefaultImpl d = new DefaultImpl();
		d.defaultMethod();
		InterfaceWithDefaultStatic.staticMethod();
	}
}
