//寻找第 K 大
//有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
// 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
// 测试样例： [1,3,5,2,2],5,3 返回：2

//【题目解析】：
//把快排分区思想理解透彻
//【解题思路】：
//这题应该是用快排的思想：例如找49个元素里面第24大的元素，那么按如下步骤： 1.进行一次快排（将大的
//元素放在前半段，小的元素放在后半段）,假设得到的中轴为p 2.判断 p - low + 1 == k ，如果成立，直接输出
//a[p]，（因为前半段有k - 1个大于a[p]的元素，故a[p]为第K大的元素） 3.如果 p - low + 1 > k， 则第k大的元
//素在前半段，此时更新high = p - 1，继续进行步骤1 4.如果p - low + 1 < k， 则第k大的元素在后半段， 此时
//更新low = p + 1, 且 k = k - (p - low + 1)，继续步骤1. 由于常规快排要得到整体有序的数组，而此方法每次可
//以去掉“一半”的元素，故实际的复杂度不是o(nlgn), 而是o(n)。

public class day01_6 {
    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n-1, K);
    }
    public int findKth(int[] a, int low, int high, int k) {
        int part = partation(a, low, high);

        if(k == part - low + 1) return a[part];
        else if(k > part - low + 1) return findKth(a, part + 1, high, k - part + low -1);
        else return findKth(a, low, part -1, k);

    }
    public int partation(int[] a, int low, int high) {
        int key = a[low];
        while(low < high) {
            while(low < high && a[high] <= key) high--;
            a[low] = a[high];
            while(low < high && a[low] >= key) low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
}
