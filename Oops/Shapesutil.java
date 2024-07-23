public class Shapesutil {
    public static void main(String[]args){
        class Shape{
            void area(){
                System.out.println("Just to mention");
            }
            void parameter(){
                System.out.println("just to mention");
            }

        }

         class Circle extends Shape{
            int radius;
            Circle (int x){
                
                this.radius=x;
            }
            void area(){
                System.out.println(3.14 *this.radius*this.radius);
            }
            //  void parameter(){
            //     System.out.println(2*3.14*this.radius);
            //  }
        }

        class Square extends Shape{
            int side;
            Square(int x){
                this.side=x;
            }
            void area(){
                System.out.println(this.side*this.side);
            }
            void parameter(){
                System.out.println(4*this.side);
            }
        }

        Shape s1;
        // circle 
        s1=new Circle(4);
        s1.area();
        s1.parameter();

        s1=new Square(6);
        s1.area();
        s1.parameter();

        

    }
    
}
