
public class Marathon {

  
public static int fastest(int[] times) {

         int fastest = 0;
         if (times.length > 0){

      for (int i = 1; i < times.length; i++){
      if (times[i] < times[fastest]){

      fastest = i;
        }
     }
     }
        return fastest;
       }
  public static int secondPlace(int[] times) {

       int firstPlace = fastest(times);
        int secondPlace = 0;
       if (times.length > 1){

        for (int i = 0; i < times.length; i++){

     if (times[i] > times[firstPlace]){

         if (times[i] < times[secondPlace]){
         secondPlace = i;
               }
             }
             }
          }
        return secondPlace;
          }
          public static void main(String[] arguments) {
       String[] names = {
     "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
     "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
     "Aaron", "Kate"
     };
        int[] times = {
      341, 273, 278, 329, 445, 402, 388, 275, 243, 344, 412, 393, 299,
     343, 317, 265
     };

System.out.println(names[fastest(times)] +  " , You are the Fastest runner coming in at " + ": " + times[fastest(times)]);
System.out.println(names[secondPlace(times)] +" , sorry but you are second place coming in at " + ": " + times[secondPlace(times)]);
}
}

  
