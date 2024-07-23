public class Abstract {
    public static void main(String[]args){
       abstract class Shapes{
        abstract void area();
          void abc(){
            System.out.println("this abc method");
          }
          abstract void perimeter();

        }

         class Circle extends Shapes{

            int radius;
            Circle(int x){
                this.radius=x;
            }
            void perimeter(){
                System.out.println(2*3.14*this.radius);
            }

            void area(){
                System.out.println(3.14*this.radius*this.radius);
            }
        }

        class Square extends Shapes{

            int side;
            Square(int x){
                this.side=x;

            }
            void area() {
            System.out.println(this.side*this.side);
            }
            void perimeter(){
               System.out.println(4*this.side);
            }
        }

         Shapes s1;
         s1=new Circle(5);
         s1.area();
         
         s1=new Square(2);
         s1.perimeter();


    }
    
} 
