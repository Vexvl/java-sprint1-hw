public class stepsMethods {
    int[][] totalSteps;
    int sumSteps;
    int dayRow=0;
    int maxRow;
    int maxSteps = 0;
    int goalSteps = 10000;
    Converter converter = new Converter();
    stepsMethods() {
        totalSteps = new int[13][30];
    }

    void saveSteps(int inputMonth, int inputDay, int inputSteps) {
        totalSteps[inputMonth][inputDay] = inputSteps;
        System.out.println("Успешно сохранено");
    }

    void showStat(int monthNumber) {
        for (int i = 0; i < 30; i++) {
            System.out.println("Количество пройденных шагов по дням: " + (i+1) + " день: " + (totalSteps[monthNumber][i]));
        }
        for (int i = 0; i < 30;i++){
            sumSteps = totalSteps[monthNumber][(i)]+sumSteps;
        }
        System.out.println("Количество пройденных шагов за месяц: " + sumSteps);

        for (int i = 0; i < 30; i++){
            if(totalSteps[monthNumber][i]>maxSteps){
                maxSteps=totalSteps[monthNumber][(i)];
            }
        }
        System.out.println("Максимальное количество пройденных шагов за " + monthNumber + " месяц - " + maxSteps);
        System.out.println("Среднее количество шагов за день: " + sumSteps/30);
        System.out.println("Вы прошли дистанцию в " + converter.countDistance(sumSteps) + " км");
        System.out.println("Вы сожгли " + converter.countCal(sumSteps) + " килокалорий");

        for (int i = 0; i < 29; i++) {
            if (totalSteps[monthNumber][i]>=goalSteps){
                dayRow = dayRow + 1;
                maxRow=dayRow;
            }
            else {
                if (maxRow<dayRow){
                    maxRow=dayRow;
                }
                else dayRow=0;
            }
        }
        System.out.println("Ваша лучшая серия: " + maxRow + " дней(день)");
    }
    void changeGoalSteps(int inputGoal){
        goalSteps = inputGoal;
        System.out.println("Новое целевое значение " + goalSteps);
    }
}







