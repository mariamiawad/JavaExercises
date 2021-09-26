package studyplanleetcode;

public class BadVersion {
	 public static int firstBadVersion(int n) {
	        if(n > 0){
	          return  1 + firstBadVersion(n-1);
	        }
	        return 0;
	    }
	 public static void main(String[] args) {
		System.out.println(firstBadVersion(5));
	}
}
