import java.util.ArrayList;
public class ListPracticeOne{
	public static void main(String[]args){
			ArrayList<Integer>list1 = new ArrayList<>();
			ArrayList<Integer>list2 = new ArrayList<>();
			ArrayList<Integer>list3 = new ArrayList<>();

			for(int i  = 1; i<11; i++)
				list1.add(i);
			for(int i  = 1; i<11; i++)
				list2.add(i);

			System.out.println(list1);
			System.out.println(list2);
	}
	//public static ArrayList<Integer>combineList(ArrayList<Integer>list1, ArrayList<Integer>list2){
	//}
}