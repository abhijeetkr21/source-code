import java.text.DateFormat;
import java.util.Date;
public class DateFormatClass{
                  public static void main(String s[]){
                   Date d1=new Date();
                   DateFormat[] dfa=new DateFormat[6];
                dfa[0]=DateFormat.getInstance();
                dfa[1]=DateFormat.getInstance();
                dfa[2]=DateFormat.getInstance(DateFormat.SHORT);
                dfa[3]=DateFormat.getInstance(DateFormat.MEDIUM);
                dfa[4]=DateFormat.getInstance(DateFormat.LONG);
                dfa[5]=DateFormat.getInstance(DateFormat.FULL);
     for(int i=0;i<dfa.length;i++){
               System.out.println(dfa[i].format(d1));
                                   }
                         }
    }
               
