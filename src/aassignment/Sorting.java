package aassignment;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args){
        int nums[]=new int[50];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many numbers");
        int n=s.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println("The number in ascending order is");
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
        
    }
    
}
