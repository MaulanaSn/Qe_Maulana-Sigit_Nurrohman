public class Angka_Muncul_Sekali {
    public static void main(String args[]) {
        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
        for (int i = 0; i &lt; names.length; i++) {
            for (int j = i + 1; j &lt; names.length; j++) {
                if (names[i].equals(names[j]) ) {
                    System.out.println("found a duplicate in array : " + names[i]);
                }
            }
        }

        // Second solution : use HashSet data structure to find duplicates
        System.out.println("Duplicate elements from array using HashSet data structure");
        Set&lt;String&gt; store = new HashSet&lt;&gt;();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("found a duplicate element in array : " + name);
            }
        }

        // Third solution : using Hash table data structure to find duplicates
        System.out.println("Duplicate elements from array using hash table");
        Map&lt;String, Integer&gt; nameAndCount = new HashMap&lt;&gt;();

        // build hash table with count
        for (String name : names) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }

        // Print duplicate elements from array in Java
        Set&lt;Entry&lt;String, Integer&gt;&gt; entrySet = nameAndCount.entrySet();
        for (Entry&lt;String, Integer&gt; entry : entrySet) {
            if (entry.getValue() &gt; 1) {
                System.out.println("Duplicate element from array : " + entry.getKey());
            }
        }
    }

}
