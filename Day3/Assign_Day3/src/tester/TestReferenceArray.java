package tester;
import java.util.Scanner;

class Box{
  private int w,h,d;
  Box(int w,int h,int d){
    this.w=w;
    this.h=h;
    this.d=d;
  }
  void displyDims(){
    System.out.println("W : "+w);
    System.out.println("H : "+h);
    System.out.println("D : "+d);
  }
  int calcVolume(){
    return h*w*d;
  }

  int getW(){
    return w;
  }

  int getH(){
    return h;
  }

  int getD(){
    return d;
  }

  boolean isEqual(Box b){
    if(b.getW()==w && b.getH()==h && b.getD()==d)
      return true;
    else
      return false;
  }

  Box getDoubleBox(){
    Box temp=new Box(w*2,h*2,d*2);
    return temp;
  }

}

class TestReferenceArray{
  public static void main(String[] args) {
  
  //sc
  Scanner sc=new Scanner(System.in);
  
  // System.out.println("How many boxes ?");
  // //ref type var , that can refer to array object , to hold Box type of refs
  // Box[] boxes;
  // boxes=new Box[sc.nextInt()];//2
  
  // for(int i=0;i<boxes.length;i++){
  //   System.out.println("enter box dims W H D ");
  //   boxes[i]=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
  // }

  // //display dims n vol
  // for(Box b : boxes) //b=boxes[0],b=boxes[1].....
  // {
  //   b.displyDims();
  //   System.out.println(b.calcVolume());
  // }

//----------------------------------------------------------------------

  // System.out.println("Compare Two Boxes");
  // Box[] boxes=new Box[2];//2
  
  // for(int i=0;i<boxes.length;i++){
  //   System.out.println("enter box dims W H D ");
  //   boxes[i]=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
  // }
  // if(boxes[0].isEqual(boxes[1]))
  //   System.out.println("Box 1 isEqual to Box 2");
  // else
  //   System.out.println("Box 1 isNotEqual to Box 2");
  // }

//------------------------------------------------------------------------

  System.out.println("enter box dims W H D ");
    Box b1=new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
    b1.displyDims();
  System.out.println("Creating a new box b2 with Double the Dimensions");
    Box b2=b1.getDoubleBox();
    //Box b2=new Box(b1.getW()*2,b1.getH()*2,b1.getD()*2);
    b2.displyDims();
  }
}