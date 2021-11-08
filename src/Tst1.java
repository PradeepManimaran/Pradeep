public interface Tst1 implements Test {
	public void gh() {
		System.out.println("GH");
	}
	public static void main(String[] args) {
		Tst1 n = new Tst1 ();
		n.gh();
		n.pvt();
	}
}