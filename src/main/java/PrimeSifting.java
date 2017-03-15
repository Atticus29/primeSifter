import java.util.ArrayList;
import java.util.List;

public class PrimeSifting{
  public static boolean isValidInput(int number){
    if (number > 1){
      return true;
    } else{
      return false;
    }
  }

  public static List<Integer> getPrimeList(int number){
    List<Integer> primeList = new ArrayList<Integer>();
    for(int i = 1; i <= number; i++){
      if(i == 2){
        primeList.add(i);
      } else{
        int counter = 0;
        for(int j = 0; j<primeList.size(); j++){
          if( i % primeList.get(j) != 0){
            counter ++;
          }
          if(counter == primeList.size()){
            primeList.add(i);
          }
        }
      }
    }
    return primeList;
  }
}
