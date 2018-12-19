package ly;

import java.util.Random;

/**
* @author 作者
* @version 创建时间：2018年12月18日 上午11:13:58
* 类说明
*/
public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000;
		System.out.println(rannum);
		//0.874775352321559 
		//0.9923276131981639
		//0.9237368201587747


	}

}
