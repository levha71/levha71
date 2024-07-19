package startjava;

public class Lesson5_2 {

    //Правильное обьявление константы
    public static final int CONSTANT = 4;
    public static void main(String[] args) {


        System.out.println("Задание 2");
        int beginDay = 1;
        int beginMonth = 12;
        int beginYear = 1932;

        int endDay = 23;
        int endMonth = 2;
        int endYear = 2012;


        final int year = 4;
        //int numberYear1 = numberYear%year;

        int numberDay1 = 31, numberDay2 = 28, numberDay3 = 31, numberDay4 = 30, numberDay5 = 31, numberDay6 = 30,
                numberDay7 = 31, numberDay8 = 31, numberDay9 = 30, numberDay10 = 31, numberDay11 = 30, numberDay12 = 31;

        int sumDayYear = 0;
        int sumBegin = 0;
        int sumEnd = 0;


        for (int i = beginYear; i <= endYear; i++) {

            // Год высокосный
            int numberYear1 = i % year;
            if (numberYear1 == 0) {
                numberDay2 = 29;
            } else numberDay2 = 28;

            int summa = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7
                    + numberDay8 + numberDay9 + numberDay10 + numberDay11 + numberDay12;


            sumDayYear = sumDayYear + summa;


        }
        // СУММА ДНЕЙ ПО ГОДАМ
        System.out.println("Количество дней между годами включительно" + " = " + sumDayYear);




        int numberYear1 = beginYear % year;
        if (numberYear1 == 0) {
            numberDay2 = 29;
        } else numberDay2 = 28;

        //  дней в году начала
        switch (beginMonth) {
            case 1:
                sumBegin = beginDay;
                break;
            case 2:
                sumBegin = numberDay1 + beginDay;
                break;
            case 3:
                sumBegin = numberDay1 + numberDay2 + beginDay;
                break;
            case 4:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + beginDay;
                break;
            case 5:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + beginDay;
                break;
            case 6:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + beginDay;
                break;
            case 7:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + beginDay;
                break;
            case 8:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 + beginDay;
                break;
            case 9:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + beginDay;
                break;
            case 10:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + numberDay9 + beginDay;
                break;
            case 11:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + numberDay9 + numberDay10 + beginDay;
                break;
            case 12:
                sumBegin = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + numberDay9 + numberDay10 + numberDay11 + beginDay;
                break;
        }
        System.out.println("Остаток дней в начале" + " = " + sumBegin);

        //  дней в году конца
        switch (endMonth) {
            case 1:
                sumEnd = endDay;
                break;
            case 2:
                sumEnd = numberDay1 + endDay;
                break;
            case 3:
                sumEnd = numberDay1 + numberDay2 + endDay;
                break;
            case 4:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + endDay;
                break;
            case 5:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + endDay;
                break;
            case 6:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + endDay;
                break;
            case 7:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + endDay;
                break;
            case 8:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 + endDay;
                break;
            case 9:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + endDay;
                break;
            case 10:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + numberDay9 + endDay;
                break;
            case 11:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + numberDay9 + numberDay10 + endDay;
                break;
            case 12:
                sumEnd = numberDay1 + numberDay2 + numberDay3 + numberDay4 + numberDay5 + numberDay6 + numberDay7 +
                        numberDay8 + numberDay9 + numberDay10 + numberDay11 + endDay;
                break;
        }
        System.out.println("Остаток дней в конце = " + sumEnd);
        // Разница в количестве дней
        int summaDay;
        summaDay = sumDayYear - sumBegin + sumEnd;
        System.out.println("Разница в количестве дней = " + summaDay);

        //Разница в количестве лет.
        int sumYear = endYear - beginYear;
        System.out.println("Разница в количестве лет = "+ sumYear);

        // Количество месяцев
        int sumMonth = sumYear*12;
        System.out.println("Количество месяцев полных= "+ (sumMonth+2));

        // Количество недель
        float sumDay = summaDay;
        float sumWeek = sumDay/7;
        System.out.println("Количество недель = "+ sumWeek);

        //День недели enum     01.12.1932 четверг
        int numberWeek = 4;
        switch (numberWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вториник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }

        int sumThursday = summaDay/7;
        System.out.println("Четвергов, Пятиниц, Суббот и Воскресеньев по " + sumThursday );
        System.out.println("Понедельников, Вторников,   Сред  по " + (sumThursday-1 ));
    }


}
