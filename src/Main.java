import awkward.hero.Diana;

import java.util.Scanner;

public class Main {

    /**
     * @description: 主函数入口
     * @author: ccarlos
     * @date: 2019/12/26 22:08
     * @param: args
     * @return: void
     */
    public static void main(String[] args) {
        String name = Main.getPlayerInput();
        if (name.equals("Diana")) {
            Diana diana = new Diana();
            diana.r();
        }
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
