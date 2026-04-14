import java.util.*;

class Library implements Comparable<Library>{
    String title;

    Library(String title){
        this.title = title;
    }

    @Override
    public int compareTo(Library o) {
        return this.title.compareTo(o.title) * -1;
    }

    public String toString(){
        return "Title: " + this.title;
    }
}

public class LibraryClass {
    public static void main(String[] args) {
        List<Library> lib = new ArrayList<>();
        lib.add(new Library("A"));
        lib.add(new Library("E"));
        lib.add(new Library("C"));
        lib.add(new Library("D"));
        lib.add(new Library("B"));

        System.out.println(lib);

        Collections.sort(lib);
        System.out.println(lib);
    }
}
