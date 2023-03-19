
public class test {

	public static void main(String[] args) {
		int[] arr = {1000000000,6,42,3,12,6,42,1000000000};
		int result = new test().solution(1000000000, 42,arr);
		System.out.println(result);

	}
	    int solution(int X, int Y, int[] A) {
	        int N = A.length;
	        int result = -1;
	        int nX = 0;
	        int nY = 0;
	        for (int i = 0; i < N-1; i++) {
	            if (A[i] == X)
	                nX += 1;
	            else if (A[i] == Y)
	                nY += 1;
	            if (nX == nY) 
	            	result = i;
//	            else if ((i+2==N && ((nX == nY-1)||(nY == nX-1)))) {
//	            	result = i-1;
//	            }
	        }
	        return result;
	    }
	

}
