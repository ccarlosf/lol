package factory;

import factory.hero.Camille;
import factory.hero.Diana;
import factory.hero.Irelia;

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
        ISkill iSkill;
        switch (name) {
            case "Diana":
                iSkill = new Diana();
                break;
            case "Irelia":
                iSkill = new Irelia();
                break;
            case "Camille":
                iSkill = new Camille();
                break;
            default:
                throw new Exception();
        }
        return iSkill;
    }
}
