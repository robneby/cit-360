import java.util.*;
public class collections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*********************
		 * Collection's - List
		 *********************/
		
		System.out.println("--** List Collection **--");
		List list = new ArrayList();
		list.add("Sugar");
		list.add("Chocolate Chip's");
		list.add("Spanish vanilla");
		list.add("Candy Cane");
		list.add("Spaghetti Noodles");
		list.add("Strawberry");
		list.add("Coconut");
		list.add("Lollipops");
		list.add("Milk");
		list.add("Red Jello");
		list.add("Peppermint Ice Cream");

		for (Object str : list) {
			System.out.println((String) str);
		}

		/******************
		 * Collection's - Set
		 ******************/

		System.out.println("--** Set Collection **--");
		Set set = new TreeSet();
		set.add("Apple");
		set.add("Bananna");
		set.add("Orange");
		set.add("Grape Fruit");
		set.add("Lemon");
		set.add("Pinapple");
		set.add("Raspberry");
		set.add("Blueberry");
		set.add("Strawberry");
		set.add("Elderberry");
		set.add("Boysenberry");

		for (Object str : set) {
			System.out.println((String) str);
		}

		/******************
		 * Collection's - Queue
		 ******************/

		System.out.println("--** Queue Collection **--");
		Queue queue = new PriorityQueue();
		queue.add("Captain America");
		queue.add("Black Panther");
		queue.add("Hulk");
		queue.add("Iron Man");
		queue.add("Doctor Strange");
		queue.add("Ant Man");
		queue.add("Spiderman");
		queue.add("Thor");
		queue.add("Star Lord");
		queue.add("Rocket Racoon");
		queue.add("Groot");

		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(queue.poll());
		}

		/******************
		 * Collection - Map *
		 ******************/

		System.out.println("--** Map Collection **--");
		Map map = new HashMap();
		map.put(1, "Men");
		map.put(2, "Dwarfs");
		map.put(3, "Hobbits");
		map.put(4, "Wizards");
		map.put(5, "Elves");
		map.put(6, "Gobblins");
		map.put(7, "Orcs");
		map.put(8, "Trolls");
		map.put(9, "Rangers");
		map.put(10, "Ents");
		map.put(11, "Eagles");
		map.put(3, "Spiders");
		
		for (int i = 1; i <= 11; i++) {
			String result = (String) map.get(i);
			System.out.println(result);
		}
		
		System.out.println("--** Generic collection **--");
        List<location> myList = new LinkedList<location>();
        myList.add(new location("Utah", "Salt Lake City", "Jennie Harris"));
        myList.add(new location("Utah", "Logan", "Annie Butts"));
        myList.add(new location("Arizona", "Phoenix", "Steve Harris"));
        myList.add(new location("California", "San Diego", "Robert Nebeker"));
        myList.add(new location("Utah", "St George", "Barbara Harris"));
        myList.add(new location("New York", "Wakefield", "Brian Broderick"));
        myList.add(new location("California", "Carona", "Darlene Boas"));

        for (location shop : myList) {
            System.out.println(shop);
        }
	}

}