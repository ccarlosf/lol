package reflect;

import reflect.hero.Camille;
import reflect.hero.Diana;
import reflect.hero.Irelia;

/**
 * @description: 英雄工厂类
 * @author: Created by ccarlos
 * @date: 2019/12/28 10:41
 */
public class HeroFactory {

    /**
     * @description: 获取英雄工厂方法
     * @author: ccarlos
     * @date: 2019/12/28 10:44
     * @param: name
     * @return: factory.ISkill
     */
    public static ISkill getHero(String name) throws Exception {
        // 反射
        // 元类
        // 类是对象的抽象
        // 对象 类 元类
        // reflect.hero.Irelia
        String classStr = "reflect.hero." + name;
        Class<?> cla = Class.forName(classStr);
        Object obj = cla.newInstance();
        // JDK8以后的版本 创建对象 clazz.getDeclaredConstructor().newInstance()
        return (ISkill) obj;
//        return iSkill;
    }
}
