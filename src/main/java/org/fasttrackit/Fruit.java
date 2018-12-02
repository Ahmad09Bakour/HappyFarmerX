package org.fasttrackit;

public class Fruit extends Plants{
    Trees trees;
    public Fruit(Trees trees) {this.trees = trees;}    // constructor

    public Trees getTrees() {
        return trees;
    }

    public void setTrees(Trees trees) {
        this.trees = trees;
    }
}
