class TimeOpr{
    public static void main(String[] args) {
        AddTime time1 = new AddTime(5, 30, 50);
        AddTime time2 = new AddTime(5, 30, 20);
        //expected op = 11:1:10
        AddTime.add(time1, time2);
    }
}

class AddTime{
    int h, m, s;
    
    AddTime(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    static void add(AddTime a, AddTime b){
        int stemp = a.s + b.s;
        int s = stemp % 60;
        
        int mtemp = a.m + b.m + stemp/60;
        int m = mtemp % 60;

        int h = a.h + b.h + mtemp / 60;

        System.out.println(h+":"+m+":"+s);
    }
}