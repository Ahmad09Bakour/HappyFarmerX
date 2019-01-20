package org.fasttrackit;

public class Fruit extends Plants{
    String kind;
    Trees trees;
    public Fruit(Trees trees) {
        this.trees = trees;  //a constructor where every Fruit must have a tree object
    }
    public Fruit(){
        this(new Trees());  // adding a default constructor where the Fruit variables can have no tree
    }


    public Trees getTrees() {
        return trees;
    }

    public void setTrees(Trees trees) {
        this.trees = trees;
    }

}
