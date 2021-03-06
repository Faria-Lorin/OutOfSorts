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
    for(int j = 0; j < data.length; j++){
      int tempIndex = j;
      for(int i = j+1; i < data.length; i++){
        if (data[i] < data[tempIndex]){
          tempIndex = i;
        }
      }
      int orig = data[j];
      data[j] = data[tempIndex];
      data[tempIndex] = orig;
      }
    }
  public static void insertionSort(int[] data){

    for(int j = 1; j < data.length; j++){
      int newIndex = j;
      int value = data[j];
      while (newIndex > 0 && data[newIndex-1] > value){
        data[newIndex] = data[newIndex-1];
        newIndex = newIndex - 1;
      }

      data[newIndex] = value;
      }
  }
}
