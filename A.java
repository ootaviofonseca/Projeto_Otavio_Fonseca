public class A {

    private int A1;
    private float A2;
 
    public int  getA1(){
        return A1;
    }
 
    public float getA2(){
        return A2;
    }
 
    public void setA1(int v){
        A1 = v;
    }
 
    public void setA2(int v){
        A2 = v;
    }
 
    public void  MA1(){
    System.out.println("MA1");
    }
 
    public void MA2(){
        System.out.println("MA2");
    }

    public void  MA3(){
        String ma3 = "Alteração a classe A partir do clone";
        System.out.println(ma3);
    }


}
