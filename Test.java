public class Test {
    public static void main(String[] args) {

        IntegerArrayList list = new IntegerArrayList();
        IntegerArrayList list2 = new IntegerArrayList();
        IntegerArrayList emptyList = new IntegerArrayList();
        IntegerArrayList emptyList2 = new IntegerArrayList();
        System.out.println();

        
        System.out.println("Test add(val): Add 5 values to list");
        System.out.println("Expected: [10,20,30,40,50]  size: 5");
        list.clear();
        for (int val = 10; val <= 50; val += 10)
        {
            list.add(val);
        }
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test add(val): Add the 11th item to the list (causes array to resize)");
        System.out.println("Expected: [10,20,30,40,50,60,70,80,90,100,110]  size: 11");
        for (int val = 60; val <= 110; val += 10)
        {
            list.add(val);
        }
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test add(index, val): Add item of value 1 to position 0");
        System.out.println("Expected: [1,10,20,30,40,50,60,70,80,90,100,110]  size: 12");
        list.add(0, 1);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test add(index, val): Add item of value 45 to position 5");
        System.out.println("Expected: [1,10,20,30,40,50,60,70,80,90,100,110]  size: 13");
        list.add(5, 45);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test add(index, val): Add item of value 120 to position size");
        System.out.println("Expected: [1,10,20,30,40,50,60,70,80,90,100,110,120]  size: 14");
        list.add(list.size(), 120);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test add(index, val): Add item to position -1");
        System.out.println("Expected: IndexOutOfBoundsException: Index -1");
        try
        {
            list.add(-1, 1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(list + "  size: " + list.size());
        System.out.println();

        System.out.println("Test add(index, val): Add item to position size+1");
        System.out.println("Expected: IndexOutOfBoundsException: Index 15");
        try
        {
            list.add(list.size() + 1, 1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test get(index): Get all values from the list");
        System.out.println("Expected: 10 20 30 40 50  size: 5");
        System.out.print("Output: ");
        list.clear();
        for (int val = 10; val <= 50; val += 10)
        {
            list.add(val);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print( " size: " + list.size());
        System.out.println();
        System.out.println();


        System.out.println("Text get(index): Get item at invalid index (position 5) from the list");
        System.out.println("Expected: IndexOutOfBoundsException: Index 5");
        try
        {
            System.out.println(list.get(5));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println();


        System.out.println("Test get(index): Get item at invalid index (position -1) from the list");
        System.out.println("Expected: IndexOutOfBoundsException: Index -1");
        try
        {
            System.out.println(list.get(-1));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println();


        System.out.println("Test size(): Get size of an empty list");
        System.out.println("Expected: []  size: 0");
        System.out.println("Output: " + emptyList + "  size: " + emptyList.size());
        System.out.println();


        System.out.println("Test size(): Get size of a list of size 5");
        System.out.println("Expected: [10,20,30,40,50]  size: 5");
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test clear(): Clear an empty list");
        System.out.println("Expected: []  size: 0");
        emptyList.clear();
        System.out.println("Output: " + emptyList + "  size: " + emptyList.size());
        System.out.println();


        System.out.println("Test set(index, val): Set position 0 to value 5");
        System.out.println("Expected: [5,20,30,40,50,60,70,80,90,100]  size: 10");
        list.clear();
        for (int val = 10; val <= 100; val += 10)
        {
            list.add(val);
        }
        list.set(0, 5);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test set(index, val): Set position 5 to value 55");
        System.out.println("Expected: [5,20,30,40,50,55,70,80,90,100]  size: 10");
        list.set(5, 55);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test set(index, val): Set position size-1 to value 95");
        System.out.println("Expected: [5,20,30,40,50,55,70,80,90,95]  size: 10");
        list.set(list.size()-1, 95);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test set(index, val): Set position -1 to a value");
        System.out.println("Expected: IndexOutOfBoundsException: Index -1");
        try
        {
            list.set(-1, 1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test set(index, val): Set position size to a value");
        System.out.println("Expected: IndexOutOfBoundsException: Index 10");
        try
        {
            list.set(10, 1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test remove(index): Remove item at index 0");
        System.out.println("Expected: [20,30,40,50,60,70,80,90,100]  size: 9");
        list.clear();
        for (int val = 10; val <= 100; val += 10)
        {
            list.add(val);
        }
        list.remove(0);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test remove(index): Remove item at index 5");
        System.out.println("Expected: [20,30,40,50,60,80,90,100]  size: 8");
        list.remove(5);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test remove(index): Remove item at size-1");
        System.out.println("Expected: [20,30,40,50,60,80,90]  size: 7");
        list.remove(list.size() - 1);
        System.out.println("Output: " + list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test remove(index, val): Remove item at position -1");
        System.out.println("Expected: IndexOutOfBoundsException: Index -1");
        try
        {
            list.remove(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test remove(index, val): Remove item at position size");
        System.out.println("Expected: IndexOutOfBoundsException: Index 7");
        try
        {
            list.remove(list.size());
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(list + "  size: " + list.size());
        System.out.println();


        System.out.println("Test isEmpty(index): Return isEmpty on an empty list");
        System.out.println("Input: " + emptyList + "  size: " + emptyList.size());
        System.out.println("Expected: true");
        System.out.println("Output: " + emptyList.isEmpty());
        System.out.println();


        System.out.println("Test isEmpty(index): Return isEmpty on a non-empty list");
        System.out.println("Input: " + list + "  size: " + list.size());
        System.out.println("Expected: false");
        System.out.println("Output: " + list.isEmpty());
        System.out.println();


        System.out.println("Test contains(val): Return whether an empty list contains a value");
        System.out.println("Input: " + emptyList + "  size: " + emptyList.size());
        System.out.println("Expected: false");
        System.out.println("Output: " + emptyList.contains(1));
        System.out.println();


        System.out.println("Test contains(val): Return whether a non-empty list contains a value in the list (90)");
        System.out.println("Input: " + list + "  size: " + list.size());
        System.out.println("Expected: true");
        System.out.println("Output: " + list.contains(90));
        System.out.println();


        System.out.println("Test contains(val): Return whether a non-empty list contains a value not in the list (100)");
        System.out.println("Input: " + list + "  size: " + list.size());
        System.out.println("Expected: false");
        System.out.println("Output: " + list.contains(100));
        System.out.println();


        System.out.println("Test indexOf(val): Return the index a value appears in an empty list");
        System.out.println("Input: " + emptyList + "  size: " + emptyList.size());
        System.out.println("Expected: -1");
        System.out.println("Output: " + emptyList.indexOf(1));
        System.out.println();


        System.out.println("Test indexOf(val): Return the index a value (90) appears in a non-empty list");
        System.out.println("Input: " + list + "  size: " + list.size());
        System.out.println("Expected: 6");
        System.out.println("Output: " + list.indexOf(90));
        System.out.println();


        System.out.println("Test indexOf(val): Return the index a value not in the list (100) appears in a non-empty list");
        System.out.println("Input: " + list + "  size: " + list.size());
        System.out.println("Expected: -1");
        System.out.println("Output: " + list.indexOf(100));
        System.out.println();


        System.out.println("Test equals(): Two empty lists");
        System.out.println("Expected: true");
        System.out.println("Output: " + emptyList.equals(emptyList2));
        System.out.println();


        System.out.println("Test equals(): Two equal non-empty lists");
        System.out.println("Expected: true");
        list.clear();
        list2.clear();
        for (int val = 10; val <= 100; val += 10)
        {
            list.add(val);
            list2.add(val);
        }
        System.out.println("Output: " + list.equals(list2));
        System.out.println();

        System.out.println("Test equals(): Two non-empty lists with unequal size and same values in corresponding positions");
        System.out.println("Expected: false");
        list.add(110);
        System.out.println("Output: " + list.equals(list2));
        System.out.println();


        System.out.println("Test equals(): Two non-empty lists with same size and different values");
        System.out.println("Expected: false");
        list.remove(0);
        System.out.println("Output: " + list.equals(list2));
        System.out.println();



    }
}