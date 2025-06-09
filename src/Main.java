//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

        // Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        // Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

        // Task 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        // Task 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        // Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sumBoxer = boxer1 + boxer2;
        System.out.println("Общая масса бойцов - " + sumBoxer + " кг");
        var diffBoxer = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов - " + diffBoxer + "кг");

        // Task 7
        var remBoxer = boxer2 % boxer1;
        System.out.println("Остаток от деления между двумя весами - " + remBoxer + "кг");

        // Task 8
        var numHours = 640;
        var numEmployees = numHours / 8;
        System.out.println("Всего работников в компании — " + numEmployees + " человек");
        numEmployees = numEmployees + 94;
        var numHoursOut = numEmployees * 8;
        System.out.println("Если в компании работает " + numEmployees + " человек, то всего " + numHoursOut + " часов работы может быть поделено между сотрудниками");
    }
}