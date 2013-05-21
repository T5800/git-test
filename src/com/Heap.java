for(int i = (n-1)/2 ; i >= 0 ; i -- )
{
	createHeap(i, list, n);
}
createHeap(int index, List list, int length)
{
	int left = 2 * index + 1;
	int right 2 * index + 2;
	int large = index;
	if( list.get(index) < list.get(left) && left < length ) {
		index = left;
	}
	if( list.get(index) < list.get(right) && right < length) {
		index = right;
	}
	if( index  != large ) {
		int temp = list.get(index) ; 
		list.set(index, list.get(large));
		list.set(large, temp);
		createHeap(index, list, length);
	}
}
println list.get(0);
