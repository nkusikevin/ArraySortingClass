package OopinJavacom.company;
class Sort{
    //array that needs to be sorted
    int [] ar = {12,2,44,23,45,223,45,6,7,8,1};

    //swap method
    static void swap (int [] arry , int i , int j){
        if (arry[i] == arry[j]) {
            return;
        }
        int temp;
        temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;

    }
}
public class Main {

    public static void main(String[] args) {
	Sort obj = new Sort();
    for (int k = obj.ar.length-1 ; k>0 ; k--){
        for (int r = 0 ; r<k ; r++){
            if (obj.ar[r] > obj.ar[r+1]){
                obj.swap(obj.ar,r,r+1 );
            }
        }
    }
    for (int i =0 ; i<obj.ar.length ; i++){
        System.out.println(obj.ar[i]);
    }
    }
}
