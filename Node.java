/*
 Linked List 3 
 Problem Code: LL3
 You are given K sorted linked lists L1,L2,…,LK. Merge the K lists such that the final result is also sorted and return the head of the merged linked list. The function takes a single argument, heads of the K linked lists stored in an ArrayList, and you are expected to return the head of merged sorted linked list.

Input:
There are total K+1 lines of input.
First line contains single integer K, number of linked lists.
Next K lines contain the description for the corresponding list as Ni+1 space separated integers where the first integer Ni describes the size of the ith list and the next Ni integers Li1,Li2,…,LiNi are the values of the nodes for the ith list starting from the head.
Note:

For Java language, you need to:
Complete the function in the submit solution tab:
Node merge(ArrayList<Node> al){...}
 
For C++ language, you need to:
Complete the function in the submit solution tab:
Node* merge(vector<Node*> v){...}
Output:
The function you complete should return the required answer.

Constraints
1≤∑Ki=1Ni≤5∗105
1≤Lij≤109
Sample Input:
3
3 100 101 102
3 1 2 3
3 1 2 3
Sample Output:
1 1 2 2 3 3 100 101 102
 */

class Node{
    	int val;
    	Node next;
        Node(){
            next = null;
        }
    	Node(int x){
    		val = x; next = null;
    	}
    }
    Node merge(ArrayList<Node> al)
    {
         ArrayList<Integer> num = new ArrayList<Integer>();
         for(int i=0;i<al.size();i++)
         {
            Node p = al.get(i);
            while(p != null)
            {
                 num.add(p.val);
                 p = p.next;
            }
         }
         Collections.sort(num);
         Node p = new Node();
         Node arr = p;
         
         for(int i=0;i<num.size();i++)
         {
              Node temp = new Node(num.get(i));
              temp.next = null;
              p.next = temp;
              p = p.next;
         }
         return arr.next;
        
    }
