/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:

    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head->next==nullptr)
            return nullptr;

        ListNode* ptr1 = head;
        ListNode* ptr2 = head;
        int i=0;
        int p1=1, p2=1;
        while(ptr1->next!=nullptr){
            i++;
            ptr1=ptr1->next;
            p1++;
            if(i>n){
                ptr2=ptr2->next;
                p2++;
            }
        }
        //cout << p1 << " " << p2 << endl;
        if(ptr2==head && (p1-p2)!=n)
            head=head->next;
        else if(ptr2->next->next==nullptr){
            if(ptr2==head)
                head->next=nullptr;
            else
                ptr2->next=nullptr;
        }
        else
            ptr2->next=ptr2->next->next;
        //cout << ptr1->val << " " << ptr2->val;
        return head;
    }
};
