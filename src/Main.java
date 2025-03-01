//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1");
        int blueRose = 450;
        System.out.println("Значение переменной blueRose с типом int равно " + blueRose );
        byte greenApple = 75;
        System.out.println("Значение переменной greenApple с типом byte равно " + greenApple );
        short combatSquad = 30788;
        System.out.println("Значение переменной combatSquad с типом short равно " + combatSquad );
        long thePopulationOfTheCountry = 146028325;
        System.out.println("Значение переменной thePopulationOfTheCountry с типом long равно " +thePopulationOfTheCountry );
        float bottleVolume = 0.75F;
        System.out.println("Значение переменной bottleVolume c типом float равно " + bottleVolume );
        double airTemperature = 35.6;
        System.out.println("Значение переменной airTemperature с типом double равно " + airTemperature );

        System.out.println("Задание 2");
        byte a = 67;
        System.out.println(a);
        short b = -159;
        System.out.println(b);
        short c = 569;
        System.out.println(c);
        short d = 27897;
        System.out.println(d);
        long e = 987678965549L;
        System.out.println(e);
        float f = 2.786F;
        System.out.println(f);
        float g = 27.12f;
        System.out.println(g);

        System.out.println("Задание 3");
        byte LP = 23;
        System.out.println(LP);
        byte  AS = 27;
        System.out.println(AS);
        byte  EA = 30;
        System.out.println(EA);
        short allThePeper = 480;
        System.out.println(allThePeper);
        int  numberOfSheets = allThePeper/(LP + AS + EA );
        System.out.println("На каждого ученика расчитано " + numberOfSheets + " листов !");

        System.out.println("Задание 4");
        int effeciecy = 16/2;
        System.out.println(effeciecy);
        byte minutes = 20;
        System.out.println(minutes);
        int  hour = minutes * 3;
        System.out.println(hour);
        int day = hour * 24;
        System.out.println(day);
        int mount = day * 30;
        System.out.println(mount);
        int effeciecyOf20Minutes = effeciecy * minutes;
        System.out.println("За 20 минут машина произаела " + effeciecyOf20Minutes + " штук бутылок" );
        int effeciecyOfHour = effeciecy * hour;
        System.out.println("За 1 час машина произвела " + effeciecyOfHour + " штук бутылок ");
        int effeciecyOfDay = effeciecy * day;
        System.out.println("За 1 день машина произвела " + effeciecyOfDay + " штук бутылок");
        int effeciecyOf3Days = effeciecyOfDay * 3;
        System.out.println("За 3 дня машина произвела " + effeciecyOf3Days + " штук бутылок");
        int effeciecyOfMount = effeciecy * mount ;
        System.out.println("За месяц машина произвела " + effeciecyOfMount + " штук бутылок");

        System.out.println("Задание 5");
        byte allPot = 120;
        System.out.println(allPot);
        byte consumptionWhitePaint = 2;
        System.out.println(consumptionWhitePaint);
        byte consumptionBrownPaint = 4;
        System.out.println(consumptionBrownPaint);
        int consumptionPot = consumptionWhitePaint + consumptionBrownPaint;
        System.out.println(consumptionPot);
        int numberOfClass = allPot / consumptionPot ;
        System.out.println(numberOfClass);
        int needWhitePaint = consumptionWhitePaint * numberOfClass ;
        System.out.println(needWhitePaint);
        int needBrownPaint = consumptionBrownPaint * numberOfClass ;
        System.out.println(needBrownPaint);
        System.out.println("В школе где " + numberOfClass + " классов нужно " + needWhitePaint + " банок белой краски и " + needBrownPaint +" банок коричневой краски !" ) ;

        System.out.println(" Задание 6");
        byte bananas = 80;
        System.out.println(bananas);
        byte milk = 105;
        System.out.println(milk);
        byte iceCream = 100;
        System.out.println(iceCream);
        byte eggs = 70;
        System.out.println( eggs );
        int sportsNutrition = (bananas * 5 ) + (milk * 2 ) + (iceCream * 2) + (eggs * 4);
        System.out.println(sportsNutrition + " грамм !");
        int mass1 = 1000;
        System.out.println(mass1);
        int  sportsNutrition2 = sportsNutrition / mass1 ;
        System.out.println(sportsNutrition2 + " кг !");

        System.out.println("Задание 7");
        byte needToRest = 7;
        System.out.println(needToRest + " кг!");
        int massToRest = needToRest * 1000;
        System.out.println( massToRest + " грамм");
        int restOfDay = 250;
        System.out.println(restOfDay);
        int restOfDay2 = 500;
        System.out.println(restOfDay2);
        int days1 = massToRest / restOfDay;
        System.out.println("Если спортсмен будет сбрасывать " + restOfDay + " грамм в день, то ему понадобится " + days1 + " дней!");
        int days2 = massToRest / restOfDay2;
        System.out.println("Если спортсмен будет сбрасывать " +restOfDay2 +  "  грамм в  день , то ему понфдобиться " + days2 + " дней !");
        int average =(days1 + days2 ) / 2;
        System.out.println("В среднем , для сбрасывания " + needToRest + " кг, спортсмену понадобиться " + average + " день !");

        System.out.println("Зфдание 8");
        int Masha = 67760;
        System.out.println(Masha);
        double  raising = Masha  * 0.10;
        System.out.println(raising);
        double Masha2 = raising + Masha;
        System.out.println(Masha2);
        int beforeThePromotion = Masha * 12;
        System.out.println(beforeThePromotion);
        double afterThePromotion = Masha2 * 12;
        System.out.println(afterThePromotion);
        double difference = afterThePromotion - beforeThePromotion ;
        System.out.println("Маша теперь получает " + Masha2 + " рублей в месяц. Годовой доход вырос на " + difference + " рублей" );
        int Denis = 83690;
        System.out.println(Denis);
        double raisingD = Denis * 0.10;
        System.out.println(raisingD);
        double Denis2 = Denis + raisingD ;
        System.out.println(Denis2);
        int beforeThePromotionD = Denis * 12;
        System.out.println(beforeThePromotionD);
        double afterThePromotionD = Denis2 * 12;
        System.out.println(afterThePromotionD);
        double differenceD = afterThePromotionD - beforeThePromotionD ;
        System.out.println("Денис теперь получает " + Denis2 + " рублей в месяц. Годовой доход вырос на " + differenceD + " рублей" );
        int Christina = 76230;
        System.out.println(Christina);
        double raisingC = Christina * 0.10;
        System.out.println(raisingC);
        double Christina2 = Christina + raisingC ;
        System.out.println(Christina2);
        int beforeThePromotionC = Christina * 12;
        System.out.println(beforeThePromotionC);
        double afterThePromotionC = Christina2 * 12;
        System.out.println(afterThePromotionC);
        double differenceC = afterThePromotionC - beforeThePromotionC ;
        System.out.println("Кристина теперь получает " + Christina2 + " рублей в месяц. Годовой доход вырос на " + differenceC + " рублей");
























    }
}