import java.lang.Math;
public class Radix{
    public static int nth(int n, int col){
        n = Math.abs(n);
        // nth(123,1) -> 2
        double temp = (double)n % Math.pow(10 ,col + 1);
        // System.out.println(temp);
        return ((int)(temp / Math.pow(10 ,col)));   

    }

	public static int length(int n){
        n = Math.abs(n);
        if (n == 0){
            return 1;
        }
        return ((int)Math.log10(n) + 1);        
    }

    public static void merge(MyLinkedList original,MyLinkedList[]buckets){
        for (MyLinkedList i : buckets){
            if (i.size() > 0){
                original.extend(i); 
            }
            
        } 
    }
    public static void merge(SortableLinkedList original,SortableLinkedList[]buckets){
        for (SortableLinkedList i : buckets){
            if (i.size() > 0){
                original.extend(i); 
            }
        } 
    }
    // 5. Write a method that sorts non-negative integer values: [This part is the most important part, and I expect every student can complete it!]
    public static void radixSortSimple(SortableLinkedList data){
        int pointerCol = 0;
        while (radixpass(data, pointerCol)){
            pointerCol++;
        }
    }
    public static void radixSort(SortableLinkedList data){
        int pointerCol = 0;
        while (radixpass(data, pointerCol)){
            pointerCol++;
        }
    }
    public static boolean radixpass(SortableLinkedList data, int col){
        SortableLinkedList[] buckets = new SortableLinkedList[]{new SortableLinkedList(), new SortableLinkedList(), 
            new SortableLinkedList(), new SortableLinkedList(), new SortableLinkedList(), new SortableLinkedList(), 
            new SortableLinkedList(), new SortableLinkedList(), new SortableLinkedList(), 
            new SortableLinkedList(), new SortableLinkedList(), 
            new SortableLinkedList(), new SortableLinkedList(), new SortableLinkedList(), new SortableLinkedList(), 
            new SortableLinkedList(), new SortableLinkedList(), new SortableLinkedList() ,new SortableLinkedList()
        };

        boolean goNext = false;
        while (data.size() != 0){
            if (length(data.get(0)) > col){
                goNext = true;
            }
            
            if (data.get(0) < 0){
                buckets[9 - nth(data.get(0), col)].add(data.get(0));
                // System.out.println(9 - nth(data.get(0), col));
            }else{
                buckets[nth(data.get(0), col) + 9].add(data.get(0));
            }
            
            data.remove(0);
            
        }
        // data should be empty


        merge(data, buckets);
        
        return (goNext);
    }

    // Assume there are no negative values.
    // Use the algorithm described in class/class notes
} 