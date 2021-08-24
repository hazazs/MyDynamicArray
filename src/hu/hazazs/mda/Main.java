package hu.hazazs.mda;

public class Main {

	public static void main(String[] args) {
		DynamicArray<String> array = new DynamicArray<>();

		// add test
		array.add("kolbász");
		System.out.println(array);
		array.add("tevepúp");
		System.out.println(array);
		array.add("kolbász");
		System.out.println(array);
		array.add("kolbász");
		System.out.println(array);
		array.add("negró");
		System.out.println(array);
		array.add("kolbász");
		System.out.println(array);
		array.add("kolbász");
		System.out.println(array);

		System.out.println("-------");

		// add test with index (insert)
		array.add(-3, "kutyaütő");
		array.add(0, "kolbász");
		System.out.println(array);
		array.add(4, "vaskalap");
		System.out.println(array);
		array.add(9, "wc-papír");
		System.out.println(array);
		array.add(12, "denevér");

		System.out.println("-------");

		// get test
		System.out.println(array.get(-4));
		System.out.println(array.get(0));
		System.out.println(array.get(2));
		System.out.println(array.get(9));
		System.out.println(array.get(21));

		System.out.println("-------");

		// contains test
		System.out.println(array.contains("Béla"));
		System.out.println(array.contains("negró"));
		System.out.println(array.contains("wc-papír"));
		System.out.println(array.contains("Üzbeg"));
		System.out.println(array.contains("tevepúp"));

		System.out.println("-------");

		// remove test
		array.remove(-11);
		array.remove(0);
		System.out.println(array);
		array.remove(3);
		System.out.println(array);
		array.remove(7);
		System.out.println(array);
		array.remove(101);

		System.out.println("-------");

		// removeAll test
		array.removeAll("kettőspont");
		array.removeAll("kolbász");
		System.out.println(array);
		array.removeAll("negró");
		System.out.println(array);

		System.out.println("-------");

		// additional tests just to be sure
		array.remove(0);
		System.out.println(array);
		System.out.println(array.get(3));
		System.out.println(array.contains("verejték"));
		array.remove(7);
		array.removeAll("zsinagóga");
		array.add(0, "Good bye!");
		System.out.println(array);
	}

}