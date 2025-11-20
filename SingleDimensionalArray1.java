public class SingleDimensionalArray1{
	public static void main(String[] args){
		String[] names = new String[]{"Ben","Daniel","Jack","Henry","Joy"};
		int[] ages = new int[] {12,16,30,19,25};
		
		for(int i = 0; i < 5; i++){
		System.out.printf("%s%n you are %d years old%n",names[i],ages[i]);
		}
	}
}	