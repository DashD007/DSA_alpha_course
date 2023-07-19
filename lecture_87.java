public class lecture_87{
    public static int linearSearch(int numbers[], int key){
        for(int i=1;i<=numbers.length;i++){
            if(numbers[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        int key =10;
        int index = linearSearch(numbers,key);
        if(index== -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("the index is "+ index);
        }
    }
}
