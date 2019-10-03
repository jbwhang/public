
public class SparseMatrixMain { 
   public static void main(String[] args) { 
	 int noZeroCnt = 0; //배열 a의 원소중 0이아닌 원소값을 가는 필드
	 int x=1, y=0; //배열 b의 위치값을 갖는 필드
	 
	 //희소행렬 선언 초기화  
	 int[][] a = { {15, 0, 0, 22, 0, -15}, {0, 11, 3, 0, 0, 0}, {0, 0, 0, -6, 0, 0},
     			   {0, 0, 0, 0, 0, 0 }, {91, 0, 0, 0, 0, 0}, {0, 0, 28, 0, 0, 0},
     			   {0, 0, 3, 0, 9, 0}, {0, 0, 2, 0, 0, 1}};
     
	 //배열 a중 0이아닌 원소의 개수를 구한다.
     for(int i=0 ; i<a.length ; i++) { 
         for(int j=0 ; j<a[i].length ; j++) { 
            if(a[i][j]!=0) noZeroCnt++;
         } 
       }

     System.out.println("A: 최초의 희소배열"); 
     printMatrix(a); 
     
     //3원소쌍 희소행렬 선언, 생성
     int[][] b = new int[noZeroCnt+1][3]; //3행x[0이 아닌 원소의 개수+1(Header행 포함)]열의 배열b로 선언 생성 

     b[0][0] = a.length; //배열 a의 행 크기
     b[0][1] = a[0].length; //배열 a의 열 크기
     b[0][2] = noZeroCnt;
     
     //배열 a에서 0이 아닌 원소를 찾아 3원소쌍 희소배열 b에 저장
     for(int i=0 ; i<a.length ; i++) { 
    	 for(int j=0 ; j<a[i].length ; j++) { 
        	 if(a[i][j] != 0) {
        	   b[x][y] = i;
        	   y++;
        	   b[x][y] = j;
        	   y++;
        	   b[x][y] = a[i][j];
        	   x++;
        	   y=0;
        	 }
         } 
       }
     
     System.out.println("B: 0이 아닌 원소를 찾아 구성한 3원소쌍 배열"); 
     printMatrix(b); 
     
     // 3원소쌍 배열b의 행과 열의 값을 교환한 전치배열b로 변환  
     int temp; //원소교환을 위한 임시변수
     for(int i=0;i<b.length;i++) { 
    	   temp = b[i][0];
    	   b[i][0] = b[i][1];
    	   b[i][1] =temp;
     } 

     System.out.println("C: 전치된 배열"); 
     printMatrix(b);
     
     // 전치배열 b를 순서를 갖는 최종 전치배열 b로 변환
     for(int i=1;i<b.length-1;i++) {
    	 for(int j=i+1;j<b.length;j++) {
    		 if(b[i][0]>b[j][0]) {
    			 temp=b[i][0];
    			 b[i][0]=b[j][0];
    			 b[j][0]=temp;
    			 
    			 temp=b[i][1];
    			 b[i][1]=b[j][1];
    			 b[j][1]=temp;
    			 
    			 temp=b[i][2];
    			 b[i][2]=b[j][2];
    			 b[j][2]=temp;
    		 }
    		 else if(b[i][0]==b[j][0] && b[i][1]>b[j][1]) {
    			 temp=b[i][0];
    			 b[i][0]=b[j][0];
    			 b[j][0]=temp;
    			 
    			 temp=b[i][1];
    			 b[i][1]=b[j][1];
    			 b[j][1]=temp;
    			 
    			 temp=b[i][2];
    			 b[i][2]=b[j][2];
    			 b[j][2]=temp;
    		 }
    	}
     }
     
     
     System.out.println("D: 순서화된 전치 배열"); 
     printMatrix(b);
   }
   
   // 배열들을 출력하는 메소드
   static void printMatrix(int[][] m) { 
	   for(int i=0 ; i<m.length ; i++) { 
		   for(int j=0 ; j<m[i].length ; j++) { 
			   System.out.print(m[i][j] + "\t"); 
		   } 
		   System.out.println(); 
	   } 
   }
} 
