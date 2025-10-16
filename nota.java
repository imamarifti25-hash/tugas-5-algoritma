import java.util.ArrayList;


public class nota{
    String No, Item, Price, Qty, Subtotal;
    
    public nota(String a, String b, String c, String d, String e){
        this.No = a;
        this.Item =b;
        this.Price =c;
        this.Qty =d;
        this.Subtotal =e;
    
    }
    public static void main (String[] args) throws Exception {
        ArrayList <nota> goods =new ArrayList<nota>();

                goods.add(new nota("1.","chiken","15000","3","45000"));
                goods.add(new nota("2.","book","25000","2","50000"));

                System.out.println ("No\tItem\tPrice\tQty\tSubtotal");
                System.out.println("-----------------------------------------");
                for(nota x:goods) {
                    System.out.println(x.No+"\t"+x.Item+"\t"+x.Price+"\t"+x.Qty+"\t"+x.Subtotal);
                }
                System.out.println("-----------------------------------------");
                System.out.println("Total 95000");
       }
    }

    

