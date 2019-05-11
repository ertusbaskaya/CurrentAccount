
public class Control {
    
    final private String PHONE_PATTERN = "(([\\+]90?)|([0]?))([ ]?)((\\([0-9]{3}\\))|([0-9]{3}))([ ]?)([0-9]{3})(\\s*[\\-]?)([0-9]{2})(\\s*[\\-]?)([0-9]{2})";
    final private String LETTER_PATTERN = "^[a-zA-Z]+$";
    public boolean isAPhone(String pnumber){
        if (pnumber.matches(PHONE_PATTERN)) {
            return true;
        }
        return false;
    }
    
    public boolean isANumber(String data){
        
        for (char c :  data.toCharArray())
         {
             if (!Character.isDigit(c)) {
                 return false;
             }
        }
        
        return true;
    }
    
    public boolean isALetter(String letter){
        for (char c :  letter.toCharArray())
         {
             if (!Character.isAlphabetic(c)) {
                 return false;
             }
        }
        return true;
    }
}