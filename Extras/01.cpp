#include <iostream>
using namespace std;

class node{
public:
int data;
node *next;
    node(int x){
       data=x;
       next=NULL;
    }

    void display(){
        cout<<data<<" ";
    }

};

void insertHead(node *&head,int d){
    node *temp=new node(d);
    temp->next=head;
    head=temp;
}
void insertTail(node*&head,int d){
    node *temp=new node(d);
    node *head1=head;
    while(head1->next!=NULL){
        head1=head1->next;
    }
    head1->next=temp;
}
void print1(node *head){
    if(head==NULL){
        cout<<endl;
        return;
    }
    cout<<head->data<<" ";
    print1(head->next);
}
void print2(node *head){
    if(head==NULL){
        cout<<endl;
        return;
    }
    print2(head->next);
    cout<<head->data<<" ";
}
void reverse1(node *&head){
    node *prev=NULL;
    node *current=head;
    node *forward=NULL;

    while(current!=NULL){
        forward=current->next;
        current->next=prev;
        prev=current;
        current=forward;
    }
    head=prev;
}
void reverse2(node *&head,node *current,node *prev){
    if(current==NULL){
        head=prev;
        return;
    }
    node *forward=current->next;
    current->next=prev;
    prev=current;
    current=forward;
    reverse2(head,current,prev);
}
void reverse3(node*&head,node*current,node*prev){
    if(current==NULL){
        head=prev;
        return;
    }
    node *forward=current->next;
    current->next=prev;
    reverse3(head,forward,current);
}
int main(){
    node *head=new node(5);
    insertHead(head,6);
    insertHead(head,7);
    insertHead(head,8);
    insertHead(head,80);
    insertHead(head,78);
    insertHead(head,78);
    insertHead(head,788);
    
    // print1(head);
    // reverse1(head);
    // reverse2(head,head,NULL);
    // reverse3(head,head,NULL);
    // print2(head);

}