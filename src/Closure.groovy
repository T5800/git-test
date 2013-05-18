def sqrt = {
	int x, int y ->
	y**x
}
def cal = sqrt.curry(2)
println cal(3)   // output 9
