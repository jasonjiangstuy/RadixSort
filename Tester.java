import java.util.Arrays;
public class Tester{
    public static void main(String[] args) {
        System.out.println("Test Nth");
        // nth(123,1) -> 2
        tester("nth", 123, 1,  2);
        tester("nth", 123, 2,  1);
        tester("nth", 123, 0,  3);
        tester("nth", 123, 3,  0);

        tester("nth", -123, 1,  2);
        tester("nth", -123, 2,  1);
        tester("nth", -123, 0,  3);
        tester("nth", -123, 3,  0);
        System.out.println("Test length");
        tester("length", 0, 1);
        tester("length", 15, 2);
        tester("length", -10, 2);
        tester("length", 5112, 4);

        System.out.println("Test merge");
        MyLinkedList myTestLinkedList = new MyLinkedList();
        MyLinkedList merge = new MyLinkedList();
        MyLinkedList merge1 = new MyLinkedList();
        MyLinkedList merge2 = new MyLinkedList();
        myTestLinkedList.add("1");
        myTestLinkedList.add("2");
        myTestLinkedList.add("3");
        myTestLinkedList.add("4");
        merge.add("5");
        merge.add("6");
        merge1.add("7");
        merge1.add("8");
        merge2.add("9");
        merge2.add("10");
        
        tester("merge", myTestLinkedList, new MyLinkedList[] {merge, merge1, merge2}, "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");

        // should work on updating empty MyLinkedList
        tester("merge", myTestLinkedList, new MyLinkedList[] {merge, merge1, merge2}, "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");

        System.out.println("Test Sorted merge");
        SortableLinkedList myTestLinkedListS = new SortableLinkedList();
        SortableLinkedList mergeS = new SortableLinkedList();
        SortableLinkedList merge1S = new SortableLinkedList();
        SortableLinkedList merge2S = new SortableLinkedList();
        myTestLinkedListS.add(1);
        myTestLinkedListS.add(2);
        myTestLinkedListS.add(3);
        myTestLinkedListS.add(4);
        mergeS.add(5);
        mergeS.add(6);
        merge1S.add(7);
        merge1S.add(8);
        merge2S.add(9);
        merge2S.add(10);
        
        tester("mergeSorted", myTestLinkedListS, new SortableLinkedList[] {mergeS, merge1S, merge2S}, "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");

        // should work on updating empty MyLinkedList
        tester("mergeSorted", myTestLinkedListS, new SortableLinkedList[] {mergeS, merge1S, merge2S}, "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");

        System.out.println("Test radixSortSimple");
        SortableLinkedList unsorted = new SortableLinkedList();
        int[] testArray = new int[]{12, 34, 42, 32, 44, 41, 34, 11, 32, 23, 87, 50, 77, 58, 8};
        for (int i : testArray){
            unsorted.add(i);
        }
        Arrays.sort(testArray);
        tester("radixSortSimple", unsorted, Arrays.toString(testArray));

        System.out.println("Test radixSort");
        unsorted = new SortableLinkedList();
        testArray = new int[]{12, 34, 42, 32, 44, -41, 34, 11, 32, 23, -87, 50, 77, -58, 8};
        for (int i : testArray){
            unsorted.add(i);
        }
        Arrays.sort(testArray);
        tester("radixSort", unsorted, Arrays.toString(testArray));
    }
    

    private static void tester(Object... values) {
        if (values[0].equals("nth")){
            // System.out.println(Radix.nth((int)values[1], (int)values[2]));
            System.out.println(Radix.nth((int)values[1], (int)values[2])==(int)values[3]);
        }
        if (values[0].equals("length")){
            // System.out.println(Radix.length((int)values[1]));
            System.out.println(Radix.length((int)values[1])==(int)values[2]);
        }

        if (values[0].equals("merge")){
            // System.out.println(Radix.length((int)values[1]));
            Radix.merge((MyLinkedList)values[1], (MyLinkedList[])values[2]);
            System.out.println(values[1].toString().equals(values[3]));
        }
        if (values[0].equals("mergeSorted")){
            // System.out.println(Radix.length((int)values[1]));
            Radix.merge((SortableLinkedList)values[1], (SortableLinkedList[])values[2]);
            System.out.println(values[1].toString().equals(values[3]));
        }
        if (values[0].equals("radixSortSimple")){
            // System.out.println(Radix.length((int)values[1]));
            Radix.radixSortSimple((SortableLinkedList)values[1]);
            // System.out.println(values[1].toString() + "\n"+ values[2]);
            // System.out.println(values[1].toString().equals(values[2]));
        }

        if (values[0].equals("radixSort")){
            // System.out.println(Radix.length((int)values[1]));
            Radix.radixSort((SortableLinkedList)values[1]);
            // System.out.println(values[1].toString() + "\n"+ values[2]);
            // System.out.println(values[1].toString().equals(values[2]));
        }



    }
    
}