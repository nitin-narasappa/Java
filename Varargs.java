
public class Varargs {
  public static void main(String[] args){
    Add addNumbers = new Add();
    addNumbers.add(2, 4);
    addNumbers.add(1, 3, 4);
    addNumbers.add(3, 8, 6, 7);
  }
}

class Add {
    // Method which takes varargs
    public void add(int... a){
        int sum =0;
        boolean isFirst=true;
        StringBuffer sb = new StringBuffer();
        for (int temp : a){
            if(isFirst){
                sb.append(temp);
                isFirst = false;
            } else {
                sb.append("+"+temp);
            }
            sum+=temp;
        }
        System.out.println(sb.toString() + "=" + sum);
    }
}
