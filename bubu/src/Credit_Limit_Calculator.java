public class Credit_Limit_Calculator {
    int nracc;
    int begbalance;
    int totcharges;
    int totcredits;
    int limcredit;

    public void setAccinfo(int nracc, int begbalance, int totcharges, int totcredits, int limcredit)
    {
        setnracc(nracc);
        setbegbalance(begbalance);
        settotcharges(totcharges);
        settotcredits(totcredits);
        setlimcredit(limcredit);
    }
    public void setnracc(int nracc)
    {
        this.nracc = nracc;
    }
    public void setbegbalance(int begbalance)
    {
        this.begbalance = begbalance;
    }
    public void settotcharges(int totcharges)
    {
        this.totcharges = totcharges;
    }
    public void settotcredits(int totcredits)
    {
        this.totcredits = totcredits;
    }
    public void setlimcredit(int limcredit)
    {
        this.limcredit = limcredit;
    }
    public int getnracc(){
        return nracc;
    }
    public int getbegbalance(){
        return begbalance;
    }
    public int getlimcredit(){
        return limcredit;
    }
    public int gettotcharges(){
        return totcharges;
    }
    public int gettotcredits(){
        return totcredits;
    }
    public int getnewbalance(){
        return getbegbalance() - gettotcharges() + gettotcredits();
    }
    public boolean creditexceeded(){
        return (getnewbalance() > getlimcredit()) ? false : true;
    }
}
