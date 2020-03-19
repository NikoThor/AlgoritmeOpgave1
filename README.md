# My first look at algorithms 


1: Linear Search
inear search is used to search a key element from multiple elements.

Algorithm:
Traverse the array
Match the key element with array element
If key element is found, return the index position of the array element
If key element is not found, return -1


2: Binary Search
 Search a sorted array by repeatedly dividing the search interval in half. 
 Algorithm
Compare x with the middle element.
If x matches with middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
Else (x is smaller) recur for the left half.

3: Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

Algorithm
Take an array of numbers
sort the array from lowest number to greatest number
look at two numbers
sort so the lowest number comes first
Repeat until done

4: Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum elementfrom unsorted part and putting it at the beginning

Algoritm 
search for the lowest element and arrange it to the proper location.
We swap the current element with the next lowest number.
