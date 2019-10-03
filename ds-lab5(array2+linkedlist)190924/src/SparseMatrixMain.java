
public class SparseMatrixMain { 
   public static void main(String[] args) { 
	 int noZeroCnt = 0; //�迭 a�� ������ 0�̾ƴ� ���Ұ��� ���� �ʵ�
	 int x=1, y=0; //�迭 b�� ��ġ���� ���� �ʵ�
	 
	 //������ ���� �ʱ�ȭ  
	 int[][] a = { {15, 0, 0, 22, 0, -15}, {0, 11, 3, 0, 0, 0}, {0, 0, 0, -6, 0, 0},
     			   {0, 0, 0, 0, 0, 0 }, {91, 0, 0, 0, 0, 0}, {0, 0, 28, 0, 0, 0},
     			   {0, 0, 3, 0, 9, 0}, {0, 0, 2, 0, 0, 1}};
     
	 //�迭 a�� 0�̾ƴ� ������ ������ ���Ѵ�.
     for(int i=0 ; i<a.length ; i++) { 
         for(int j=0 ; j<a[i].length ; j++) { 
            if(a[i][j]!=0) noZeroCnt++;
         } 
       }

     System.out.println("A: ������ ��ҹ迭"); 
     printMatrix(a); 
     
     //3���ҽ� ������ ����, ����
     int[][] b = new int[noZeroCnt+1][3]; //3��x[0�� �ƴ� ������ ����+1(Header�� ����)]���� �迭b�� ���� ���� 

     b[0][0] = a.length; //�迭 a�� �� ũ��
     b[0][1] = a[0].length; //�迭 a�� �� ũ��
     b[0][2] = noZeroCnt;
     
     //�迭 a���� 0�� �ƴ� ���Ҹ� ã�� 3���ҽ� ��ҹ迭 b�� ����
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
     
     System.out.println("B: 0�� �ƴ� ���Ҹ� ã�� ������ 3���ҽ� �迭"); 
     printMatrix(b); 
     
     // 3���ҽ� �迭b�� ��� ���� ���� ��ȯ�� ��ġ�迭b�� ��ȯ  
     int temp; //���ұ�ȯ�� ���� �ӽú���
     for(int i=0;i<b.length;i++) { 
    	   temp = b[i][0];
    	   b[i][0] = b[i][1];
    	   b[i][1] =temp;
     } 

     System.out.println("C: ��ġ�� �迭"); 
     printMatrix(b);
     
     // ��ġ�迭 b�� ������ ���� ���� ��ġ�迭 b�� ��ȯ
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
     
     
     System.out.println("D: ����ȭ�� ��ġ �迭"); 
     printMatrix(b);
   }
   
   // �迭���� ����ϴ� �޼ҵ�
   static void printMatrix(int[][] m) { 
	   for(int i=0 ; i<m.length ; i++) { 
		   for(int j=0 ; j<m[i].length ; j++) { 
			   System.out.print(m[i][j] + "\t"); 
		   } 
		   System.out.println(); 
	   } 
   }
} 
