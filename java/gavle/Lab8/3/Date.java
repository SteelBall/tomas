class Date {
    private static int[] ymd = new int[3];
    protected Date (int year, int month, int day) {
        this.ymd[0] = year;
        this.ymd[1] = month;
        this.ymd[2] = day;
    }
    // Kod borttaget
    protected int[] getDate () {
        return this.ymd;
    }
    public void printDate () {
        System.out.println (ymd[0] + "-" + ymd[1] + "-" + ymd[2]);
    }
}
/*
N�r programmet k�rs skrivs f�ljande ut:

2015-5-11
2015-5-35

Det som �r problemet �r att det �r fritt fram att modifiera datum efter�t, dag 35 finns inte.

Eftersom klassen �r public och inneh�llet synligt kan i princip all anv�nding av klassen ocks� �ndra den. F�r att hindra detta beh�ver den skyddas genom att s�ttas som private och bara kunn accessa den genom get och set-metoder.
*/
