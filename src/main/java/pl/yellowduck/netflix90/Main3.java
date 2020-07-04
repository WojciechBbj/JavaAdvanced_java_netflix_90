package pl.yellowduck.netflix90;

import recources.Category;

import static recources.Category.*;

public class Main3 {

    public static void main(String[] args) {
        Category category = Category.DRAMA;

        System.out.println("simple print: " + COMEDY);
        System.out.println("print toString: " + COMEDY.toString());
        System.out.println("print name: " + COMEDY.name());
        System.out.println("print ordinal: " + COMEDY.ordinal());
    }


}
