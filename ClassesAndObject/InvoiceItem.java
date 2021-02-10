public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, Double unitprice) {
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitprice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public Double getUnitPrice(){
        return unitPrice;

    }
    public void setUnitprice(Double unitPrice){
        this.unitPrice=unitPrice;

    }
    public Double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "Invoice[id: "+id+"desc: " +desc+" Qty: "+qty+"    unit Price: "+unitPrice+"]";
    }

    public static void main(String[] args) {
        InvoiceItem IV= new InvoiceItem("555","bread",5 , 20.0);
        System.out.println(IV.toString());


    }

}
