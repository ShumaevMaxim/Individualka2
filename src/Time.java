//Описать класс для работы с временем. Реализовать методы вычисления разницы
//между двумя моментами времени, сложения времени и заданного количества секунд,
//вычитания из времени заданного количества секунд, сравнение двух моментов времени,
//перевод в минуты.
public class Time {
    int hh, mm, sec;
    Time (int hh, int mm, int sec){
        this.hh = hh;
        this.mm = mm;
        this.sec = sec;
    }
    void slozhenie(int c){
        int h1 = hh;
        int m1 = mm;
        int s1 = sec;
        s1+=c;
        while(s1 >= 60){
            s1-= 60;
            m1++;
        }
        while(m1 >= 60){
            m1-= 60;
            h1++;
        }
        System.out.println(h1+" "+ m1 + " " +s1 + " ");
    }
    void vychitanie(int a){
        int h1 = hh;
        int m1 = mm;
        int s1 = sec;
        s1-=a;
        while(s1 < 0){
            s1+= 60;
            m1--;
        }
        while(m1 < 0){
            m1+= 60;
            h1--;
        }
        System.out.println(h1+" "+ m1 + " " +s1 + " ");
    }
    void sravn(Time a){
        System.out.println(Math.abs(this.hh - a.hh) + " hours " + Math.abs(this.mm - a.mm) + " minutes  " + Math.abs(this.sec - a.sec) + " seconds ");
    }
    double perevod(){
        double h = hh;
        double m = mm;
        double s = sec;
        while (h != 0){
            m+=60;
            h--;
        }
        return (m + s/60);
    }
}
