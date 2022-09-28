
public class StepTracker {
    Converter converter = new Converter();
    MonthData[] monthToData;
    int goal = 10000;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void printStepsByDay(int month){
        for (int i = 0; i < monthToData[month].dayToData.length; i++) {
            if (i != 29) {
                System.out.print((i + 1) + " день:" + monthToData[month].dayToData[i].steps + ", ");
            }else {
                System.out.print((i + 1) + " день:" + monthToData[month].dayToData[i].steps);
            }
        }
    }
    public int getSumSteps(int mouth){
        int sumSteps = 0;
        for (int i = 0; i< monthToData[mouth].dayToData.length; i++) {
            sumSteps = sumSteps + monthToData[mouth].dayToData[i].steps;
        } return sumSteps;
        }

        public double getAverageSteps( int mount){
            int sumSteps = getSumSteps(mount);
           return (double)sumSteps / monthToData[mount].dayToData.length;
        }
        public int getDistance(int mount){

        return converter.getDistance(getSumSteps(mount));
        }

        public double getCallories(int mount){

        return converter.getCallories(getSumSteps(mount));
        }
        public int getSeriasSteps(int mount) {
        int maxSerias = 0;
            int currentSerias = 0;

        for (int i = 0; i < monthToData[mount].dayToData.length; i++) {
                if (monthToData[mount].dayToData[i].steps >= goal) {
                    currentSerias++;
                } else {
                    if (maxSerias < currentSerias)
                        maxSerias = currentSerias;
                    currentSerias = 0;
                }


                }
        return maxSerias;
            }


    static class MonthData {
        DayData[] dayToData;
         public MonthData() {
             dayToData = new DayData[30];
             for (int i = 0; i < dayToData.length; i++) {
                 dayToData[i] = new DayData();
             }
         }
      }
  static class DayData {
      int steps;

        public DayData(){

            steps = 0;
        }

  }

    }



