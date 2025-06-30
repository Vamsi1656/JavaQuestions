package StaticAndDefaultHiding;

public class DefaultHiding {


    int x=10;
}

class A extends DefaultHiding{
    int x=20;
}

class B{
    public static void main(String[] args){

        DefaultHiding d=new A();
        System.out.println(d.x);
    }
}
