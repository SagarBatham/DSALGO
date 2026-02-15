
// representing the number of students. The task is to allocate books to each student such that:

// Each student receives atleast one book.
// Each student is assigned a contiguous sequence of books.
// No book is assigned to more than one student.
// The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, 
// find the arrangement where the student who receives the most pages still has the smallest possible maximum.

// Note: If it is not possible to allocate books to all students, return -1.

// Examples:

// Input: arr[] = [12, 34, 67, 90], k = 2
// Output: 113
// Explanation: Allocation can be done in following ways:
// => [12] and [34, 67, 90] Maximum Pages = 191
// => [12, 34] and [67, 90] Maximum Pages = 157
// => [12, 34, 67] and [90] Maximum Pages = 113.
// The third combination has the minimum pages assigned to a student which is 113.
// Input: arr[] = [15, 17, 20], k = 5
// Output: -1
// Explanation: Since there are more students than total books, it's impossible to allocate a book to each student.
public class Book_Allocation {
    public static void main(String[] args) {
        int[] pages={10,20,30,40};
        int k=2;
        int n=bookallo(pages, k);
        System.out.println(n);
    }
    public static int bookallo(int[] pages,int k){
        int low=0;
        int high=0;
        for (int i = 0; i < pages.length; i++) {
            high+=pages[i];
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(pages,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] pages,int noS,int mid) {
        int student=1;
        int readpage=0;
        for (int i = 0; i < pages.length; i++) {
            if(readpage+pages[i]<=mid){
                readpage+=pages[i];
            }else{
                student++;
                readpage=pages[i];
            }

            if(student>noS){
                return false;
            }
        }
        return true;
    }
}
