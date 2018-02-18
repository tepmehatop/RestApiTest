package test;

import org.testng.annotations.Test;
import setting.Settings;

public class MainApiTest {

    @Test
    public void testUserInfoPressman() {
        Settings settings = new Settings();
        settings.searchJobById("9be6e14491305132c175cb1781a3356c");
        settings.searchIsExecutedSuccesfully();
        settings.jobTitleFind("1st Pressman");
        System.out.println("Найдена специальность Прессовщик");
            }


    @Test
    public void testUserInfo3DSpecialist() {
        Settings settings = new Settings();
        settings.searchJobById("ec45194ae348e1bb21415064364f038b");
        settings.searchIsExecutedSuccesfully();
        settings.jobTitleFind("3D Specialist");
        System.out.println("Найдена специальность 3D специалист");
            }


}
