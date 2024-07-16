package Datastructures;
import java.util.Scanner;

public class DQueue {
    public static void main(String[] args) {
        class Queue{
            int arr[];
            int left;
            int right;
            int length;

            Queue(){
              this.arr =new int[100];
              this.left=0;
              this.right=0;
              this.length=5;
            }
            void enqueue(int x){
                if(length==(right-left)){
                    System.out.println("Queue is overflow");
                }
                else{
                    this.arr[right]=x;
                    right+=1;
                    this.display();
                }

            }
            void dequeue(){
                if(left-right==0){
                    System.out.println("Queue is underflow");
                }
                else{
                    this.left++;
                    this.display();   
                }
            }
            void display(){
                for(int i=this.left;i<=this.right-1;i++){
                    System.out.print(arr[i]+" \t");
                }
                System.out.println("");
            }
        }

        Queue q1=new Queue();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1. to Enqueue  \t Enter 2.to Dequeue  \t Enter 3.to quit");
            int ch=sc.nextInt();
            if(ch==1){
                int val=sc.nextInt();
                q1.enqueue(val);

            }
            if(ch==2){
                q1.dequeue();
            }
            if(ch==3){
                break;
            }
        }
    }

    
}
