public class MyFileUtils {

    public  int substract10FromLargeNum(int number) throws Exception {
        if(number < 10){
            throw new Exception("Num smaller than 10");
        }
        return number -10;
    }
}
