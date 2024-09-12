package my.enjoy.hs.week2quiz;

public class Array_week {

    public void week(){

        String[] mTot = new String[] {"월", "화", "수", "목"};
        String[] fTos = new String[] {"금", "토", "일"};

        String[] allDay = new String[7];
        System.arraycopy(mTot, 0, allDay, 0, mTot.length);
        System.arraycopy(fTos, 0, allDay, 4, fTos.length);

        for(int i = 0; i < allDay.length-1; i++){
            System.out.print(allDay[i] + ", ");
        }
        System.out.println(allDay[allDay.length-1]);




    }


}
