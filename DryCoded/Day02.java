public class Day02{
    public static void main(String[] args){
        char[] arr = {'1','2','3','4','5','6','O','W','N'};
        int runs = 0;
        int balls = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='1'){
                runs++;
                balls++;
            }else if(arr[i]=='2'){
                runs = runs+2;
                balls++;
            }else if(arr[i]=='3'){
                runs = runs+3;
                balls++;
            }else if(arr[i]=='4'){
                runs = runs+4;
                balls++;
            }else if(arr[i]=='5'){
                runs = runs+5;
                balls++;
            }else if(arr[i]=='6'){
                runs = runs+6;
                balls++;
            }else if(arr[i]=='W'){
                runs++;
            }else if(arr[i]=='N'){
                runs++;
            }else if(arr[i]=='O'){
                balls++;
            }
        }
        String overs = balls/6 + "." + balls%6;
        System.out.println("Overs: " + overs);
        System.out.println("Runs: " + runs);
    }
}