package com.hannah.algorithm.sorting;

//public class insertSort {
//}

// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns {
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items

    //--------------------------------------------------------------
    public ArrayIns(int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    //--------------------------------------------------------------
    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        for (int j = 0; j < nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }

    /*
     * programming project 3-2
     */
    public long median() {
        int minIndex = 0;
        int maxIndex = nElems - 1;
        int mid = (minIndex + maxIndex) / 2;

        if (nElems % 2 == 0) {
            return (a[mid] + a[mid + 1]) / 2;
        }

        return a[mid];
    }

    /*
     * programming project 3-3
     * removes duplicates from a previously sorted array without disrupting the order.
     */
    public void noDups() {
//        System.out.println(a[0]);
        long newestUniqueNum = a[0];
        int duplicateCount = 0;
        for (int i = 1; i < nElems; i++) {


            if (a[i] == newestUniqueNum) {
                duplicateCount++;
            } else {
                long temp = a[i];
                a[i - duplicateCount] = temp;
                newestUniqueNum = temp;
            }
            // deal with last one
            if (i == nElems - 1) {
                a[i - duplicateCount] = a[i];
                nElems -= duplicateCount;
            }
        }

    }

    //--------------------------------------------------------------
    public void insertionSort() {
        int in, out;
        int copyCount = 0;
        int compareCount = 0;

        for (out = 1; out < nElems; out++)     // out is dividing line
        {
            long temp = a[out];            // remove marked item
            in = out;                      // start shifts at out
            while (in > 0) { // until one is smaller,
                compareCount++;
                if (a[in - 1] >= temp) {
                    a[in] = a[in - 1];            // shift item to right
                                           // go left one position
                    copyCount++;
                }
                else{
                    break;
                }
                --in;
            }
            a[in] = temp;                  // insert marked item
        }  // end for

        System.out.println("total copy count: " + copyCount);
        System.out.println("total compare count: " + compareCount);
    }  // end insertionSort()

//--------------------------------------------------------------
}  // end class ArrayIns

////////////////////////////////////////////////////////////////
class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;            // array size
        ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array

        arr.insert(99);               // insert 10 items
        arr.insert(99);
        arr.insert(55);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(11);
        arr.insert(13);
        arr.insert(66);
        arr.insert(33);
        arr.insert(99);
        arr.insert(100);

        arr.display();                // display items

        arr.insertionSort();          // insertion-sort them

        arr.display();

        System.out.println("median is " + arr.median());
        arr.display();
        arr.noDups();
//        arr.insert(4);
        arr.display();

        ArrayIns arr2 = new ArrayIns(10);
        arr2.insert(1);
        arr2.insert(2);
        arr2.insert(4);
        arr2.insert(5);
        arr2.insert(8);
        arr2.insert(7);
        arr2.insert(9);
        arr2.insert(10);

        arr2.display();
        arr2.insertionSort();


    }  // end main()
}  // end class InsertSortApp

