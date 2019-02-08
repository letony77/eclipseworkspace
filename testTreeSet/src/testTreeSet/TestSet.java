package testTreeSet;


import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class TestSet {
public static void afficherSet(final Set<String> set) {
Iterator<String> iterator = set.iterator();
while (iterator.hasNext()) {
String element = iterator.next();
System.out.print(element);
if (iterator.hasNext()) {
System.out.print(", ");
} else {
System.out.println("");
}
}
}
public static void main(final String[] args) {
NavigableSet<String> set = new TreeSet<String>();
for (char i = 'a'; i < 'z'; i++) {
/*set.add("" + i);*/
set.add("a");
set.add("b");
set.add("c");
set.add("c");
set.add("s");
set.add("p");
set.add("z");
}
System.out.println(set);
System.out.println("higher(5) = " + set.higher("s"));
System.out.println("lower(5) = " + set.lower("s"));
System.out.print("Ordre descendant = ");

afficherSet(set.descendingSet());

}
}
