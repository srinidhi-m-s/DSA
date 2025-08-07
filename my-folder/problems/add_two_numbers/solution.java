/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        boolean carry=false;
        ListNode head=ans;
        int sum=l1.val+l2.val;
        l1=l1.next;l2=l2.next;
        if(sum>9){ 
            ans.val=sum-10;
            carry = true;
        }
        else ans.val=sum;
        System.out.println(ans.val);
        while(l1!=null || l2!=null || carry==true){
            ListNode value=new ListNode();  
            sum=0;
            if(l1!=null) {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2=l2.next;
            }
            if(carry==true) {                
                sum+=1;carry=false;
            }
            if(sum>9){ 
                value.val=sum-10;carry = true;
            }
            else value.val=sum;
            ans.next=value;
            ans=ans.next;
            
        }        
        return head;
    }
    
}