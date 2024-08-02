import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        
        String a = "";
        for(int i = 0; i<my_string.length(); i++){
            char str = my_string.charAt(i);
            if(str != ' '){
                a += str;
            }else{
                if(!a.equals("")){
                    list.add(a);
                    a = "";
                }
            }
        }
        if(!a.equals("")) list.add(a);
        
        return list.toArray(new String[0]);
    }
}