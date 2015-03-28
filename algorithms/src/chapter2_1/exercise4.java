package chapter2_1;
/*
 * 输入：两个用数组表示的n位二进制数A和B,二进制低位放在数组高位
 * 输出：A和B两个数之和，用数组C表示，二进制低位放在数组高位
 */
public class exercise4 {
	public static void main(String args[]){
		int A[]={1,0,1,1,0,1,1};		   //数组A存储了二进制数1011011
		int B[]={1,1,1,0,0,1,1};		   //数组B存储了二进制数1110011
		int C[] =new int[A.length+1];
		int overflow=0;					   //用一个数表示溢出与否，1代表进位，0代表不进位
		for(int i=A.length-1;i>=0;i--){	   //从数组高位倒序遍历A和B两个数组
			if (A[i]+B[i]+overflow==3){	   //代表相加的两位都是1且低位进位
				C[i+1]=1;				   //这种情况下相加后该位必为1，写入C
				overflow=1;				   //发生进位，置进位值为1
			}
			else if(A[i]+B[i]+overflow==2){//代表相加的三个数中有两个为1
				C[i+1]=0;				   //这种情况下相加后该位比为0，写入C
				overflow=1;				   //发生进位，置进位值为1
			}
			else{
				C[i+1]=A[i]+B[i]+overflow; //其他情况下三数相加不发生进位，直接写入C
				overflow=0;				   //由于不发生进位，置进位值为0
			}
		}
		C[0]=overflow;					   //将C的最高位写入
		for(int i=0;i<C.length;i++){	   //依次输出C的各位
			System.out.print(C[i]);
		}
	}
}
