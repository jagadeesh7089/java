package Datastructures;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        class Stack{
            int[] st;
            int tos;
            Stack(){
                this.tos = -1;
                st = new int[5];
            }
            void push(int x){
                if(tos==st.length-1){
                    System.out.println("Stack Over flow");
                }
                else{
                    this.st[++tos]=x;
                    this.display();
                }
            }
            void pop(){
                if(tos==-1){
                    System.out.println("Stack lo em ledu khali");
                }
                else{
                    this.tos--;
                    display();
                }
                    
            }
            void display(){
                for(int i=0;i<=this.tos;i++){
                    System.out.print(this.st[i]+"\t");
                }
                System.out.println();
            }
        }
        Stack s1 = new Stack();
        while(true){
            
            System.out.println("Press 1. to PUSH \t 2. to POP \t 3. to display \t 4.to quit");
            Scanner input = new Scanner(System.in);
            int ch = input.nextInt();
            if(ch==1){
                System.out.println("Enter the value you want to push");
                int val = input.nextInt();
                s1.push(val);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            if(ch==2){
                s1.pop();
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            if(ch==3){
                s1.display();
            }
            if(ch==4){
                break;
            }
            
        }
        
    }
}
