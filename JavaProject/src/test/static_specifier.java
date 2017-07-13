package test;

class access{
    public int x;
	 int y;
    void cal(int a, int b){
        x +=  a ;
        y +=  b;
    }        
}    
class static_specifier {
    public static void main(String args[])
    {
        access obj1 = new access();
        access obj2 = new access();   
        obj1.x = 0;
        obj1.y = 0;
        obj1.cal(1, 2);
        obj2.x = 0;
        obj2.cal(2, 3);
        //y=5,x=2--obj2
        //obj1-- x==1,y==5
        System.out.println(obj1.x + " " + obj1.y);     
    }
}