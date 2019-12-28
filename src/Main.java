import reflect.ISkill;
import abstraction.hero.Camille;
import abstraction.hero.Diana;
import abstraction.hero.Irelia;
import reflect.HeroFactory;

import java.util.Scanner;

public class Main {

    /**
     * @description: 第一版代码主函数入口
     * @author: ccarlos
     * @date: 2019/12/26 22:08
     * @param: args
     * @return: void
     */
  /*  public static void main(String[] args) {
        String name = Main.getPlayerInput();
        switch (name) {
            case "Diana":
                Diana diana = new Diana();
                diana.r();
                break;
            case "Irelia":
                Irelia irelia = new Irelia();
                irelia.r();
                break;
            case "Camille":
                Camille camille = new Camille();
                camille.r();
                break;
            default:
        }
    }*/

    /**
     * @description: interface抽象风格 主函数入口
     * @author: ccarlos
     * @date: 2019/12/26 22:29
     * @param: args
     * @return: void
     */
 /*   public static void main(String[] args) throws Exception {
        String name = Main.getPlayerInput();
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
        iSkill.r();
    }*/

    /**
     * @description: 工厂模式分类对象实例化
     *                 通过反射机制消除所有的变化
     *                 主函数入口
     * @author: ccarlos
     * @date: 2019/12/28 10:48
     * @param: args
     * @return: voidI
     */
    public static void main(String[] args) throws Exception {
        String name = Main.getPlayerInput();
        //依赖倒置的应用 不依赖具体的实现，而是依赖抽象
        ISkill iSkill = HeroFactory.getHero(name);
        iSkill.r();

        // 改动配置文件 OCP
        // 配置文件
        // 抽象工厂
        // IHeroFactory
        // spring ioc
        // ApplicationContext
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("")
        // object = ctx.getBean("")
    }

    /**
     * @description: 获取输入英雄名字
     * @author: ccarlos
     * @date: 2019/12/26 22:09
     * @return: java.lang.String
     */
    private static String getPlayerInput() {
        System.out.println("Enter a Hero's Name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
