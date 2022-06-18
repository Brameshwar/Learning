package com.bramesh.linkedLearning;

import java.util.ArrayList;

public class GFG {

    public static void print(ArrayList<CustomObject> list)
    {
        for (CustomObject obj : list) {
            System.out.print(obj.getCustomProperty());
            System.out.println(obj.getCustomProperty2());
        }
    }

    // Comparison done using compareTo function
    public static void sort(ArrayList<CustomObject> list)
    {

        list.sort((o1, o2)
                -> o1.getCustomProperty().compareTo(
                o2.getCustomProperty()));
    }

    // Adding custom objects
    public static void add(ArrayList<CustomObject> list)
    {
        list.add(new CustomObject( Double.parseDouble("5"),"A"));
        list.add(new CustomObject( Double.parseDouble("10"),"B"));
        list.add(new CustomObject( Double.parseDouble("10"),"C"));
        list.add(new CustomObject( Double.parseDouble("20"),"D"));
        list.add(new CustomObject( Double.parseDouble("20"),"E"));
    }

    public static void main(String[] args)
    {
        // Declare ArrayList with custom class

        ArrayList<CustomObject> list = new ArrayList<>();
        add(list);
        sort(list);
        print(list);
    }
}
