/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author quang
 */
public class SortProgramming extends Menu<String> {

    static String options[] = {"Bubble Sort", "Quick Sort"};
    protected Library lib;
    protected Algorithm algorithm;
    protected int[] arr;
    protected int arr_size;

    public SortProgramming(Element element) {
        super("SORT ALGORITHM", options);
        lib = new Library();
        algorithm = new Algorithm();
        arr = element.getArr();
        arr_size = element.getArr_size();
    }

    @Override
    public void excute(int n) {
        System.out.println("unsorted Array: ");
        lib.displayArr(arr);
        switch (n) {
            case 1:
                algorithm.bubbleSort(arr);
                System.out.println("Sorted array by bubble sort");
                lib.displayArr(arr);
                System.out.println("");
                break;
            case 2:
                algorithm.quickSort(arr, 0, arr_size - 1);
                System.out.println("Sorted array by quick sort");
                lib.displayArr(arr);
                System.out.println("");
                break;
        }
    }

}
