package Datastructures;

import java.util.Scanner;

public class DStack {
    public static void main(String[] args) {
        class Stack{
            int st[];
            int tos;
    
            Stack(){
               this.st=new int[5];
               this.tos=-1;
            }
            void push(int x){
                if(tos==st.length-1){
                    System.out.println("Stack is overflow");
                }
                else{
                  this.st[++tos]=x;
                  this.display();

                }
    
            }
            void pop(){
                if(tos==-1){
                    System.out.println("Stack is underflow");
                }
                else{
                    this.tos--;
                    this.display();
                }
                
            }
            void display(){
                for(int i=0;i<=tos;i++){
                    System.out.print(st[i]+"\t");
                }
                System.out.println("");
            }

    
        }

        Stack sc=new Stack();
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("1.Push value  \t 2.Pop Value \t 3.quit");
            int ch=input.nextInt();
            if(ch==1){
                int val=input.nextInt();
                sc.push(val);
            }
            if(ch==2){
                sc.pop();
            }
            if(ch==3){
                break;
            }
        }
    }
    
}
