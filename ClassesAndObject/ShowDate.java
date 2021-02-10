
public class ShowDate {
    public int yy;
    public String mm;
    public int dd;

    public ShowDate() {

        int dd = 0;
        String mm = null;
        int year = 0;
    }

    public ShowDate(int ddd, String mmm, int yyy) {

        this.yy = yyy;
        this.mm = mmm;
        this.dd = ddd;
    }

    public void dd(int ddd) {
        this.dd = ddd;
    }

    public int getdd() {
        return dd;
    }

    public void mm(String mmm) {
        this.mm = mmm;
    }

    public String getmmm() {
        return mm;
    }

    public void yy(int yyy) {
        this.yy = yyy;
    }

    public int getyy() {
        return yy;
    }

    public static void main(String[] args) {
        ShowDate dd = new ShowDate();
        ShowDate ddd = new ShowDate(01, "jan", 2005);
        System.out.println(dd.getdd() + "\t" + dd.getmmm() + "\t" + dd.getyy());

        System.out.println(ddd.getdd() + "\t" + ddd.getmmm() + "\t" + ddd.getyy());
     

    }

}
