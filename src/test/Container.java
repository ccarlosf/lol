package test;

/**
 * @description: 容器类
 * @author: Created by ccarlos
 * @date: 2019/12/28 14:03
 */
public class Container {

    /**
     * @description: 获取Bean方法
     * @author: ccarlos
     * @date: 2019/12/28 14:03
     * @return: void
     */
    public void getBean() {
        IC ic = new C();
        A a = new A(ic);
        A a1 = new A();
        a1.setIc(ic);
    }
}
