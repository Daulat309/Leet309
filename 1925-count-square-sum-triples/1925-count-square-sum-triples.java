class Solution {
    public int countTriples(int n) {
	var squares = new HashSet<Integer>();
	for (var i = 1; i <= n; i++) squares.add(i * i);
	var count = 0;
	for (var i = 1; i < n; i++)
		for (var j = i; i * i + j * j <= n * n; j++)
			if (squares.contains(i * i + j * j)) count += 2;
	return count;
    }
}