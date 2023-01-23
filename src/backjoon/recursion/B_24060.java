package backjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class MergeArray{
	private int[] arr;
	private int[] tmp;
	private int k;
	private int cnt;
	
	public MergeArray(int n, int k) {
		arr = new int[n];
		tmp = new int[n];
		this.k = k;
		cnt = 0;
	}


	public void mergeSort(int p, int r) {
		int q;
		if(p < r) {  //  0 < 4  >> 0 < 2
			q = (p + r) / 2;   // 2 >> 1
			mergeSort(p, q);  // 0 2  >> 0 1
			mergeSort(q+1, r);  
			merge(p, q, r);
		}
	}
	
	public void merge(int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		while(i <= q && j <= r) {
			if(arr[i] <= arr[j]) {
				tmp[t++] = arr[i++];
			} 
			else {
				tmp[t++] = arr[j++];
			}
		}
		while(i <= q) {
			tmp[t++] = arr[i++];
		}
		
		i = p; 
		t = 0;
		while(j <= r) {
			arr[i++] = tmp[t++];
			cnt++;
			if(cnt == k) {
				System.out.println(arr[i-1]);
				System.exit(0);
			}
		}
	}
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
}

//알고리즘 수업 - 병합 정렬1
public class B_24060 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		MergeArray m = new MergeArray(N, K);
		st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		m.setArr(arr);
		m.mergeSort(0, N - 1);
		System.out.println(-1);
		
	}
}
