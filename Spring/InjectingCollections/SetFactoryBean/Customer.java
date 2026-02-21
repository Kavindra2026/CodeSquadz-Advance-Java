package my;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private Set<Object> sets; // = new HashSet<Object>();

    public String toString() {
        return sets.toString(); // Note: code used "lists" in one version, corrected contextually
    }

    public Set<Object> getSets() {
        return sets; // Note: code used "lists" in one version
    }

    public void setSets(Set<Object> sets) { // Note: code used "setLists" in one version
        this.sets = sets;
    }
}