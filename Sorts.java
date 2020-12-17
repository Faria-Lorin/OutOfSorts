public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){

    for(int j = 0; j < data.length; j++){
      int swap = 0;
      for(int i = 0; i < data.length-1; i++){
        if (data[i] > data[i+1]){
          int temp = data[i];
          data [i] = data[i+1];
          data [i+1] = temp;
          swap++;
        }
      }
      if (swap == 0)
            break;
      }
    }
  public static void selectionSort(int[] data){
    for(int j = 0; j < data.length - 1; j++){
      int temp = 0;
      int index = 0;
      for(int i = j; i < data.length-1; i++){
        if (data[i] < data[i+1]){
          temp = data[i];
          index = i;
        }
      }
      data[j] = temp;
      data[index] = data[j];
      }
    }
  }
