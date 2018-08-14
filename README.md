# SearchingSorting
Various techniques of searching and sorting along with it's complexity constraints.

--Linear Search--
Traverses through all the elements of the array
Time Complexity = O(n)

--Binary Search--
Compares the mid element with key and sets the value of low and high accordingly
The array has to be sorted for it to work
T(n) = T(n/2) + 1
Time Complexity = O(logn)

--Bubble Sort--
Best Case = O(n) {Considering the modified bubble using flag}
Worst Case = O(n^2)
After each iteration the largest element goes at the last position

--Selection Sort--
Best Case = O(n^2)
Worst Case = O(n^2)
After each iteration the smallest element goes at the first position

--Insertion Sort--
Best Case = O(n)
Worst Case = O(n^2)
Proceeds with placing the element in the already sorted list of elements in the index positions to the left of it

--Merge Sort--
T(n) = 2T(n/2) + O(n)
The conquer function takes O(n) time
Best Case = O(nlogn)
Worst Case = O(nlogn)
Follows Divide and Conquer Approach
Always divides the functions in two equal parts
Extra Space O(n) required
Thus, if you feel like sorting max of 10^6 elements
You cannot do that using Merge Sort

--Quick Sort--
