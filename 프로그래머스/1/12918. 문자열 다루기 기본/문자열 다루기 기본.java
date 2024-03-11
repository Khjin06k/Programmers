import java.util.*;
class Solution {
    public boolean solution(String s) {
        try{
            if(s.length() == 4 || s.length() == 6) Integer.parseInt(s);
            else return false;
        }catch(Exception e){
            return false;
        }
        return true;
    }
}