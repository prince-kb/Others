// --Linked list--
/* #include<iostream>
using namespace std;
struct node{
    int data;
    struct node *next;
};
#define TRUE 1
struct node *start;

// Creating link list
void create(){
    int i=0,a;
cout<<"Enter the number of elements of the list: ";
cin>>a;
struct node*p=(struct node*)malloc(sizeof(struct node));
cout<<"Enter the "<<i<<" element of the node: ";
cin>>p->data;
p->next=NULL;
start=p;
i++;
while(i<a){
cout<<"Enter the "<<i<<" element of the node: ";
p->next=(struct node *)malloc(sizeof(struct node));
p=p->next;
cin>>p->data;
p->next=NULL;
i++;
}
// p->next=NULL;
}

//Counting number of nodes of the linked list
int count(){
    int i=0;
    struct node *p=start;
    while(p!=NULL){
        p=p->next;
        i++;
    }
    return i;
}

//Displaying all the nodes arranged
void display(){
    cout<<endl;
    if(count()==1){
     cout<<start->data;   
    }
    else{
        cout<<endl;
    struct node *p=start;
    cout<<"| "<<start->data<<" |";
    p=start->next;
    while(p!=NULL){
        
        cout<<"-->"<<"| "<<p->data<<" |";
        p=p->next;
    }
    }
cout<<endl;
}

//Insert new element at beginning
void insert_beginning(){
struct node*p=(struct node*)malloc(sizeof(struct node));
cout<<"Enter the element: "<< endl;
cin>>p->data;
p->next=start;
start=p;
cout<<endl;
}

//Insert new element at the end position
void insert_end(){
    struct node *p=start,*q;
    while(p->next!=NULL){
        p=p->next;
    }
    q=(struct node *)malloc(sizeof(struct node));
    cout<<"enter the element to insert: ";
    cin>>q->data;
    q->next=NULL;
    p->next=q;
    cout<<endl;
}

//Inserting element at specific position
void insert_pos(){
    int i=1,pos;
    cout<<"Enter position index to insert node: ";
        cin>>pos;
        if(pos<0 || pos>count()){
            cout<<"Invalid position"<<endl;
            return;
        }
        
    if(pos==0)
        insert_beginning();
    else if(pos==count()-1)
        insert_end();
    else{
        struct node *p=start;
        struct node*q=(struct node*)malloc(sizeof(struct node));
        cout<<"Enter the element: "<< endl;
        cin>>q->data;  
        while(i<pos){
            p=p->next;
            i++;
        }
        q->next=p->next;
        p->next=q;

    }
}

//Deleting first element of the linked list
void delete_beginning(){
    if(count()==1){
        cout<<"Can't delete last element"<<endl;
        return;
    }
    else {
            struct node *p=start;
    cout<<start->data<<" deleted"<<endl;
    start=start->next;
    free(p);
    }
}


//Deleting last element of the linked list
void delete_end(){
        if(count()==1){
        cout<<"Can't delete last element"<<endl;
        return;
    }
        else {
            struct node *p=start;
            while(p->next->next != NULL)
                p=p->next;
                cout<<p->next->data<<" deleted"<<endl;
                p->next = NULL;
            free(p->next);
        }

}

//Deleting element at specific position
void delete_pos(){
    int i=1,pos;
    cout<<"Enter position index to delete node: ";
    cin>>pos;
    if(pos<0 || pos>count()){
        cout<<"Invalid position"<<endl;
        return;
    }
    if(pos==0)
        delete_beginning();
    else if(pos==count()-1)
        delete_end();
    else{
        struct node *p=start;
        while(i<pos)
            p=p->next,i++;
        struct node *q=p->next;
        cout<<q->data<<" deleted"<<endl;
        p->next=q->next;
        free(q);
    }
}
//Searching an element
void search(){
    int a,i=0;
    struct node *p=start;
    cout<<"Enter element to search: ";
    cin>>a;
    while(p!=NULL){
        if(p->data==a){
            break;
        }
            i++;
        p=p->next;
    }
    if(p==NULL){
        cout<<"Element not found"<<endl;
        return;
    }
    else {
            cout<<p->data<<" found at position "<<i<<endl;
    }
}


int main(){
int a;
create();
while(TRUE){
    cout<<endl<<"LINKED LIST MENU"<<endl;
    cout<<"1>Display 2>Insert from beginnning 3>Insert at last 4>Insert at position 5>Delete from beginning 6>Delete from last 7>Delete at position 8>Count 9>Search 10>Exit"<<endl;
    cout<<"Enter your choice: ";
    cin>>a;
    switch(a){
        default: cout<<"Wrong input"<< "--TRY AGAIN--";
            break;
        case 1: display();
            break;
        case 2: insert_beginning();
            break;
        case 3: insert_end();
            break;
        case 4: insert_pos();
            break;
        case 5: delete_beginning();
            break;
        case 6: delete_end();
            break;
        case 7: delete_pos();
            break;
        case 8: cout<<"The count is "<< count() <<endl;
            break;
        case 9: search();
            break;
        case 10:exit(0);
    }
}

}
 */

//--DOUBLY LINKED LIST--
/* 
#include<iostream>
using namespace std;
# define TRUE 1
struct node{
    struct node *prev;
    int data;
    struct node * next;
};
struct node *start;
void create(){
    int i=0,a;
    cout<<"Enter number of nodes to create:";
    cin>>a;
    cout<<"Enter 0 element: ";
    cin>>start->data;
    start->prev=NULL;
    start->next=NULL;
    if(i<a){
        struct node *p;
        start->next=p;
        while(i<a){
            p=(struct node *)malloc(sizeof(struct node));
            p->prev=start;
            cout<<"Enter "<<i<<" element: ";
            cin>>p->data;
            p->next=NULL;
            
            
        }
}
}
int main(){
int a;
create();

while(TRUE){
    cout<< "LINKED LIST MENU" << endl;
cout<< "1>Display 2>Insert at beginning 3>Insert at end 4>Delete at beginning 5>Delete at end 6>Count 7>Search 8>Exit" << endl;
cin>>a;
switch(a){
    case 1: display();
        break;
    case 2: insert_beginning();
        break;
    case 8: exit(0);
}

}
} 
*/

//--STACK--
/* 
#include<iostream>
using namespace std;
#define TRUE 1
#define MAX 5
int arr[20],front=-1,rear=-1;

void push(){
    if(rear==MAX-1){
        cout<<"STACK OVERFLOW"<<endl;
        return;
    }
    if(front==-1 && rear==-1)
        front=0,rear=0;
    else rear++;
    cout<<"Enter the element to push:";
    cin>>arr[rear];

}

void pop(){
    if(rear==-1){
        cout<<"STACK UNDERFLOW"<<endl;
        return;
    }
    cout<<arr[rear]<<" popped"<<endl;
    if(rear==0){
        rear=-1,front=-1;
    }
    else rear--;
}

void peep(){
    if(rear==-1){
        cout<<"NO ITEMS PRESENT"<<endl;
        return;
    }
    for(int i=MAX-1;i>rear;i--)
    cout<<"--"<<endl;
    for(int i=rear;i>=front;i--)
    cout<<arr[i]<<endl;
}
int main(){
int a;

while(TRUE){
cout<<endl<< "--STACK MENU--" << endl;
cout<<"1>PUSH 2>POP 3> PEEP 4>EXIT"<<endl;
cout<<"Enter your choice: ";
cin>>a;
switch (a)
{
case 1:
    push();
    break;

case 2:
    pop();
    break;

case 3:
    peep();
    break;

case 4:
    exit(0);

default:
    cout<<"Wrong Choice"<<endl<<"TRY AGAIN"<<endl;
    break;
}
}

} */

//--STACK USING LINKED LIST--
/* 
#include<iostream>
using namespace std;
#define TRUE 1
#define MAX 5
struct node {
    int data;
    struct node *next;
};
int top=-1;
struct node *start;


int to(){
    return top;
}

void insert_beginning(){
start=(struct node*)malloc(sizeof(struct node));
cout<<"Enter the element: "<< endl;
cin>>start->data;
start->next=NULL;
cout<<endl;
}

void pop(){
    if(top==-1){
        cout<<"STACK UNDERFLOW"<<endl;
        return;
    }
    else if(top == 0){
        cout<<start->data<<" deleted"<<endl;
        top--;
        free(start);
    }
    else {
        top--;
        struct node *p=start;
        while(p->next->next != NULL)
            p=p->next;
            cout<<p->next->data<<" deleted"<<endl;
            p->next = NULL;
        free(p->next);
    }
    cout<<endl;
}
void push(){
    if(top==MAX-1){
        cout<<"STACK OVERFLOW"<<endl;
        return;
    }
    
    else if(top==-1){
        top++;
        insert_beginning();
        return;
    }

    else if(top==0){   
        top++; 
        struct node *p;
        p=(struct node *)malloc(sizeof(struct node));
        p->next=NULL;
    cout<<"Enter the element to insert: ";
    cin>>p->data;
    start->next=p;
    }

    else {
        top++;
    struct node *p=start,*q;
    while(p->next!=NULL){
        p=p->next;
    }
    q=(struct node *)malloc(sizeof(struct node));
    cout<<"Enter the element to insert: ";
    cin>>q->data;
    q->next=NULL;
    p->next=q;
}
    cout<<endl;

}
void peep(){
    cout<<endl;
    if(top==-1){
        cout<<"NO ELEMENTS PRESENT"<<endl;
        return;
    }
    if(top==0){
     cout<<"| "<<start->data<<" |";  
    }
    else{
        cout<<endl;
        struct node *p=start;
    for(int i=top;i> -1;i--){
        int j=0;
        p=start;
    while(j<i){
        p=p->next;
        j++;
    }
    cout<<"| "<<p->data<<" |"<<endl;
    }
    }
cout<<endl;
}
int main(){
int a;
while(TRUE){
    cout<<endl<< "STACK MENU" << endl;
cout<<"1>PUSH 2>POP 3> PEEP 4>TOP 5>EXIT"<<endl;
cout<<"Enter your choice: ";
cin>>a;
switch (a)
{
case 1:
    push();
    break;

case 2:
    pop();
    break;

case 3:
    peep();
    break;
case 4:
cout<<"The top is "<<to()<<endl;
    break;
case 5:
    exit(0);

default:
    cout<<"Wrong Choice"<<endl<<"TRY AGAIN"<<endl;
    break;
}
}

}
 */

//--QUEUE--
#include<iostream>
using namespace std;
#define TRUE 1
#define MAX 5
int arr[MAX],front=-1,rear=-1;
void push();
void pop();
void display();
int main(){
int a;
while(TRUE){
cout<<endl<< "QUEUE MENU" << endl;
cout<< "1>ENQUEUE 2>DEQUEUE 3>DISPLAY 4>EXIT"  << endl;
cout<<"Enter your choice: ";
cin>>a;
cout<<endl;
switch (a){

case 1:
    push();
    break;

case 2:
    pop();
    break;

case 3:
    display();
    break;

case 4: 
    exit(0);

default: 
    cout<<"Wrong choice"<<endl;
    cout<<"  TRY AGAIN"<<endl;
    break;
}}}
void push(){
    if(rear==MAX-1){
        cout<<"QUEUE OVERFLOW"<<endl;
        return;
    }
    if(rear==-1)
        front=0,rear=0;

    else rear+=1;

    cout<<"Enter the item: ";
    cin>>arr[rear];

    cout<<endl;
    cout<<arr[rear]<<" enqueued"<<endl;
}

void pop(){
    if(front==-1){
    cout<<"QUEUE UNDERFLOW"<<endl;
    return;
    }
    cout<<arr[front]<<" dequeued"<<endl;
    if(front==rear)
        front=-1,rear=-1;
    else front++;
}

void display(){
    // if(rear==-1){
    //     for(int i=0;i<MAX;i++)
    //     cout<<"--"<<endl;
    // }
    // else 
    
        for(int i=MAX-1;i>rear;i--)
        cout<<"--"<<endl;
    if(rear!=-1)
        for(int i=rear;i>=front;i--)
        cout<<arr[i]<<endl;
        for(int i=front-1;i>=0;i--)
        cout<<"--"<<endl;
        
    }