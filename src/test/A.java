package test;

/**
 * @description: A类
 * @author: Created by ccarlos
 * @date: 2019/12/28 13:19
 */
public class A {

    private IC ic;

    public A(IC ic) {
        this.ic = ic;
    }

    /**
     * @description: print方法
     * @author: ccarlos
     * @date: 2019/12/28 13:19
     * @return: void
     */
    public void print(){
//        C c=new C();
        this.ic.print();
        // interface
//        c.test1();
//        System.out.println("This is Class A");
    }

    public void setIc(IC ic) {
        this.ic = ic;
    }
}
