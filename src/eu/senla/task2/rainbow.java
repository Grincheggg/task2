package eu.senla.task2;

import java.util.Scanner;

public class rainbow {


    public static void color(){
        String red = "красный";
         String orange = "оранжевый";
         String yellow = "желтый";
         String green = "зеленый";
         String blue = "голубой";
         String indigo = "синий";
         String violet = "фиолетовый";
         String red1 = "красно-";
         String orange1 = "оранжево-";
         String yellow1 = "желто-";
         String green1 = "зелено-";
         String blue1 = "голубо-";
         String indigo1 = "сине-";
         String violet1 = "фиолетово-";
        Scanner input = new Scanner (System.in);
        System.out.println("Введите колличетсво желаемых цветов для отображения 1 или 2:");
        int value =input.nextInt();
        if (value == 1) {
            System.out.println("vvedite chislo ot 1 do 7");
            int Colornumber = input.nextInt();
            switch (Colornumber) {
                case 1:
                    System.out.println(red);
                    break;
                case 2:
                    System.out.println(orange);
                    break;
                case 3:
                    System.out.println(yellow);
                    break;
                case 4:
                    System.out.println(green);
                    break;
                case 5:
                    System.out.println(blue);
                    break;
                case 6:
                    System.out.println(indigo);
                    break;
                case 7:
                    System.out.println(violet);
                    break;
                default:
                    System.out.println("you input wrong number");
            }
        }
        else if (value == 2){
            System.out.println("vvedite chislo ot 1 do 7");
            int colornumber1 =  input.nextInt();
            int colornumber2 = input.nextInt();
            String result = null;
            if (colornumber1 >= 1 && colornumber2 >= 1 && colornumber1 <= 7 && colornumber2 <=7 ){
                switch (colornumber1){
                    case 1:
                        result =red1;
                        break;
                    case 2:
                        result =orange1 ;
                        break;
                    case 3:
                        result =yellow1;
                        break;
                    case 4:
                        result =green1;
                        break;
                    case 5:
                        result =blue1;
                        break;
                    case 6:
                        result = indigo1;
                        break;
                    case 7:
                        result =violet1;
                        break;
                    default:
                        System.out.println("Wrong number");
                        break;
                }
                switch (colornumber2){
                    case 1:
                        System.out.println(result +red);
                        break;
                    case 2:
                        System.out.println(result+ orange);
                        break;
                    case 3:
                        System.out.println(result+yellow);
                        break;
                    case 4:
                        System.out.println(result+green);
                        break;
                    case 5:
                        System.out.println(result+blue);
                        break;
                    case 6:
                        System.out.println(result+indigo);
                        break;
                    case 7:
                        System.out.println(result+violet);
                        break;
                    default:
                        System.out.println("Wrong number");
                        break;
                }
            }
            else {
                System.out.println("wrong number");
            }
        }
    }
}
